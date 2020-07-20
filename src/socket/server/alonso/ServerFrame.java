package socket.server.alonso;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.*;
import java.net.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;

import socket.client.alonso.Sent;

import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;

public class ServerFrame extends JFrame implements Runnable{

	private JPanel contentPane;
	private JTextArea textArea;

	
	
	public ServerFrame() {
		setTitle("Chat Server");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 28, 414, 200);
		//contentPane.add(textArea);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 28, 397, 187);
		contentPane.add(scrollPane);
		
				
		scrollPane.setViewportView(textArea);
		
		setVisible(true);
		
		Thread hilo = new Thread(this);
		hilo.start();
		
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		try {
			//Decimos que puerto va a escuchar
			ServerSocket serv = new ServerSocket(3000);
			
			String nic, ip , mensaje, idAnimal;
			
			Sent recibido;
			
			while (true) {
			//se coloca un bluce infinito para que se cierre el socket y se vuelva a abrir con cada mensaje
			//Acceptamos las conexiones por el puerto del socket
			Socket miserv = serv.accept();
			
			//Creamos un flujo de entrada de objeto
			ObjectInputStream ent = new ObjectInputStream(miserv.getInputStream());
			
			
			recibido = (Sent) ent.readObject();
			
			nic = recibido.getNick();
			ip = recibido.getIp();
			mensaje = recibido.getMensaje();
			idAnimal = recibido.getIdAnimal();
			
			textArea.append("\n"+nic+" >> "+mensaje+" >> "+ip);
			
			
			
			//nuevo socket para enviar al destinatario final
			Socket destfinal = new Socket(ip,3000);
			
			
			//Genera un objeto stream para enviar el objeto con los datos
			// utiliza el metodo getOutputStream para decirle al socket que el flujo de datos va a circular a traves 
			 //de la direccion y puerto del socket creado.
			 ObjectOutputStream reenvio = new ObjectOutputStream(destfinal.getOutputStream());
			 //envia el objeto al server
			 reenvio.writeObject(recibido);
			
			 
			 reenvio.close();
			 destfinal.close();
			 miserv.close();
			
			}
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
	}
}
