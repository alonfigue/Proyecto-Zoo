package socket.client.alonso;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.ScrollPane;


public class ClientFrame extends JFrame implements Runnable {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;
	private JTextField nic;
	private JTextField ip;
	private JTextField idAnimal;
	private JLabel lblNewLabel_2;
	private JScrollPane scrollPane;
	

	
	public ClientFrame() {
		setTitle("Chat Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 264, 284, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Enviar");
		EnviaTexto envia = new EnviaTexto();
		btnNewButton.addActionListener(envia);
		btnNewButton.setBounds(10, 295, 89, 23);
		contentPane.add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setForeground(Color.BLACK);
		textArea.setBackground(SystemColor.inactiveCaptionBorder);
		textArea.setFont(new Font("Arial", Font.PLAIN, 14));
		textArea.setBounds(10, 53, 284, 200);
		//contentPane.add(textArea);
		
		nic = new JTextField();
		nic.setBounds(10, 22, 117, 20);
		contentPane.add(nic);
		nic.setColumns(10);
		
		ip = new JTextField();
		ip.setBounds(148, 22, 146, 20);
		contentPane.add(ip);
		ip.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nick");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("IP destino");
		lblNewLabel_1.setBounds(148, 11, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		idAnimal = new JTextField();
		idAnimal.setBounds(208, 296, 86, 20);
		contentPane.add(idAnimal);
		idAnimal.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Id Animal");
		lblNewLabel_2.setBounds(152, 299, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 53, 280, 195);
		contentPane.add(scrollPane);
		

		scrollPane.setViewportView(textArea);
		
		Thread hilo = new Thread(this);
		hilo.start();
		
		setVisible(true);
	}
	
	private class EnviaTexto implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try {
				 //crea un objeto socket para la conexión con el server para
				//ello se necesita de la ip y el puerto
				 Socket socket = new Socket("192.168.1.126", 3000);
				 
				 //se instancia un objeto de la clase Sent creada para empaquetar el mensaje.
				 Sent message = new Sent();
				 message.setNick(nic.getText());
				 message.setIp(ip.getText());
				 message.setMensaje(textField.getText());
				 message.setIdAnimal(idAnimal.getText());
				 
				 //Genera un objeto stream para enviar el objeto con los datos
				// utiliza el metodo getOutputStream para decirle al socket que el flujo de datos va a circular a traves 
				 //de la direccion y puerto del socket creado.
				 ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
				 //envia el objeto al server
				 out.writeObject(message);
				 				 
				 textArea.append("\n"+message.getNick()+" >> "+message.getMensaje()+" >> "+message.getIp());	
				 
					 // Cierra las conexiones
					 System.out.println("Cerrando Conexion");
					 
					 out.close();
					 
			         }
					 catch(IOException err) {
					 System.out.println(err);
					 }
					 
		  }
	   }

	//escucha del puerto 3000 para poder obtener los mensajes desde el recipiente
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			ServerSocket serviceClient = new ServerSocket(3000);
			
			Socket sClient;
			
			Sent recibido;
			
			while(true) {
				//se coloca un bluce infinito para que se cierre el socket y se vuelva a abrir con cada mensaje
				//Acceptamos las conexiones por el puerto del socket
				sClient = serviceClient.accept();
				
				//Creamos un flujo de entrada de objeto
				ObjectInputStream ent = new ObjectInputStream(sClient.getInputStream());
				
				
				recibido = (Sent) ent.readObject();
				
				String nic = recibido.getNick();
				String ip = recibido.getIp();
				String mensaje = recibido.getMensaje();
				String idAnimal = recibido.getIdAnimal();
				
				textArea.append("\n"+nic+" >> "+mensaje+" >> "+ip);
			}
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}