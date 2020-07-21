package socket.server.alonso;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.*;
import java.net.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.java.package1.Alonso.DB;

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
			
			String nic, ip , mensaje, idAnimal, ipOrigen;
			
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
			//ip del equipo de origen del mensaje
			ipOrigen = miserv.getRemoteSocketAddress().toString();
			
			
			int ini = ipOrigen.indexOf("/");
			int fin = ipOrigen.indexOf(":");
			String ipOrigen1 = ipOrigen.substring(ini + 1, fin);
			
			System.out.print(ipOrigen1);
			
			textArea.append("\n"+nic+" >> "+mensaje+" >> "+ip);
			
			//codigo para obtener datos del animal solicitado
			if (!"".equals(idAnimal)) {
				
				DB db = DB.getInstances();
				String query = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, \"claseAnimal\".nombreclase, \"tipoAnimal\".nombretipo FROM animal INNER JOIN public.\"tipoAnimal\" ON animal.id_tipo = \"tipoAnimal\".id_tipo INNER JOIN \"claseAnimal\" ON animal.id_clase = \"claseAnimal\".id_clase WHERE animal.id="+idAnimal+" ORDER BY id";
				ResultSet rs = db.dbStatementimp(query);
				String msj = new String();
				try {
					while (rs.next()) {
						msj += "Id # "+rs.getInt(1)+" -> Nombre comun: "+rs.getString(2)+" /Nombre Cientifico: "+rs.getString(3)+" /Genero: "+rs.getString(4)+" /Edad: "+rs.getInt(5)+" /Peso: "+rs.getDouble(6)+" /Clase de Animal: "+rs.getString(7)+" /Tipo de Animal"+rs.getString(8)+".\n";
					}
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				finally {
	                try {
	                    rs.close();
	                    
	                } catch (SQLException a) {
	                	a.printStackTrace();
	                }
				}
					
			
				textArea.append(msj);
				
				Mensaje mess = new Mensaje();
				
				mess.setMsj(msj);
				
				//nuevo socket para enviar al destinatario final
				Socket am = new Socket(ipOrigen1,3001);
				
				
				//Genera un objeto stream para enviar el objeto con los datos
				// utiliza el metodo getOutputStream para decirle al socket que el flujo de datos va a circular a traves 
				 //de la direccion y puerto del socket creado.
				 ObjectOutputStream respuesta = new ObjectOutputStream(am.getOutputStream());
				 //envia el objeto al server
				 respuesta.writeObject(mess);
				 
				 
				respuesta.close();
				 am.close();
			}
			
			
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
