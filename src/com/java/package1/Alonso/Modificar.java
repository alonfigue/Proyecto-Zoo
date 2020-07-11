package com.java.package1.Alonso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Modificar extends JFrame {

	private JPanel contentPane;
	private JTextField change;

	
	public Modificar() {
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 411, 184);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modificar Datos del Animal");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(89, 11, 239, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Introducir el Id del animal a modificar:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(25, 58, 239, 16);
		contentPane.add(lblNewLabel_1);
		
		change = new JTextField();
		change.setBounds(262, 56, 86, 20);
		contentPane.add(change);
		change.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("Mostrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                final int id =Integer.parseInt(change.getText());
                System.out.print("este es el primer "+id+"\n");
                
                
                
				DB db = DB.getInstances();
				String query = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, \"claseAnimal\".nombreclase, \"tipoAnimal\".nombretipo FROM animal INNER JOIN public.\"tipoAnimal\" ON animal.id_tipo = \"tipoAnimal\".id_tipo INNER JOIN \"claseAnimal\" ON animal.id_clase = \"claseAnimal\".id_clase WHERE animal.id="+id+";";
				ResultSet rs = db.dbStatementimp(query);
				String msj = new String();
				
				try {
					while (rs.next()) {
						msj = rs.getString(8);
						System.out.print(rs.getInt(1));
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally {
	                try {
	                   
	                    rs.close();
	                    
	                } catch (SQLException a2) {
	                	a2.printStackTrace();
	                }
				
	                switch(msj)
	                {
	                case "cocodrilo":
	                	
	                	DB db2 = DB.getInstances();
	                	query = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, cocodrilo.\"periodoDeIncubacion\", cocodrilo.escamas, cocodrilo.patas, cocodrilo.\"largoDeCola\" FROM public.animal INNER JOIN cocodrilo ON animal.id=cocodrilo.id WHERE animal.id="+id+";";
	                	ResultSet rs2 = db2.dbStatementt(query, id);
	                	
	                	try {
							Modifcoco coco = new Modifcoco(rs2,id);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
	                	break;
	                case "serpiente":
	                	DB db3 = DB.getInstances();
	                	query = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, serpiente.\"periodoDeIncubacion\", serpiente.escamas, serpiente.patas, serpiente.longitud, serpiente.venenosa, serpiente.color FROM public.animal INNER JOIN serpiente ON animal.id=serpiente.id WHERE animal.id="+id+";";
	                	ResultSet rs3 = db3.dbStatementt(query, id);
	                	
	                	
	                	try {
							Modifserpiente serp = new Modifserpiente(rs3, id);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	                	break;
	                case "avestruz":
	                	DB db4 = DB.getInstances();
	                	query = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, avestruz.\"periodoDeIncubacion\", avestruz.vuela, avestruz.\"tamanoCuello\" FROM public.animal INNER JOIN avestruz ON animal.id=avestruz.id WHERE animal.id="+id+";";
	                	ResultSet rs4 = db4.dbStatementt(query, id);
	                	
	                	try {
							Modifave avest = new Modifave(rs4,id);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	                	break;
	                case "flamenco":
	                	DB db5 = DB.getInstances();
	                	query = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, flamenco.\"periodoDeIncubacion\", flamenco.vuela, flamenco.\"numPlumas\" FROM public.animal INNER JOIN flamenco ON animal.id=flamenco.id WHERE animal.id="+id+";";
	                	ResultSet rs5 = db5.dbStatementt(query, id);
	                	
	                	
	                	try {
							Modifflam flam = new Modifflam(rs5, id);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	                	break;
	                case "rana":
	                	DB db6 = DB.getInstances();
	                	query = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, rana.\"tipoDeAnfibio\", rana.venenosa, rana.\"colorDePiel\" FROM public.animal INNER JOIN rana ON animal.id=rana.id WHERE animal.id="+id+";";
	                	ResultSet rs6 = db6.dbStatementt(query, id);
	                	
	                	
	                	try {
							Modifrana rana = new Modifrana(rs6, id);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	                	break;
	                case "salamandra":
	                	DB db7 = DB.getInstances();
	                	query = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, salamandra.\"tipoDeAnfibio\", salamandra.venenosa FROM public.animal INNER JOIN salamandra ON animal.id=salamandra.id WHERE animal.id="+id+";";
	                	ResultSet rs7 = db7.dbStatementt(query, id);
	                	
	                	try {
							Modifsala salam = new Modifsala(rs7, id);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	                	
	                	break;
	                case "orangutan":
	                	DB db8 = DB.getInstances();
	                	query = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, alimento, orangutan.\"periodoDeLactancia\", orangutan.\"enCelo\", orangutan.iq, orangutan.\"conPareja\" FROM public.animal INNER JOIN orangutan ON animal.id=orangutan.id WHERE animal.id="+id+";";
	                	ResultSet rs8 = db8.dbStatementt(query, id);
	                	
	                	
	                	try {
							Modiforang orang = new Modiforang(rs8, id);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	                	
	                	break;
	                case "jaguar":
	                	DB db9 = DB.getInstances();
	                	query = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, jaguar.alimento, jaguar.\"periodoDeLactancia\", jaguar.\"enCelo\", jaguar.\"numManchas\", jaguar.\"numDientes\" FROM public.animal INNER JOIN jaguar ON animal.id=jaguar.id WHERE animal.id="+id+";";
	                	ResultSet rs9 = db9.dbStatementt(query, id);
	                	
	                	
	                	try {
							Modifjag jagu = new Modifjag(rs9, id);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	                	break;
	                		
	                	
	              
	                
	                }
	                
	                
	                dispose();
			}
				
			}
		});
		btnNewButton.setBounds(156, 104, 89, 23);
		contentPane.add(btnNewButton);
		
		setVisible(true);
	}
}
