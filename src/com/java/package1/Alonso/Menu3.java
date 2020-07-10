package com.java.package1.Alonso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Menu3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Menu3() {
		
	
		
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 522, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elegir categoria de animales del Zoo para imprimir lista: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 11, 486, 31);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("1. Anfibios");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DB db = DB.getInstances();
				String query = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, rana.\"tipoDeAnfibio\", rana.venenosa, rana.\"colorDePiel\" FROM animal INNER JOIN rana ON animal.id = rana.id";
				ResultSet rs = db.dbStatementimp(query);
				String msj = new String();
				String msj2 = new String();
				try {
					while (rs.next()) {
						msj += "Id # "+rs.getInt(1)+" -> Nombre comun: "+rs.getString(2)+" /Nombre Cientifico: "+rs.getString(3)+" /Genero: "+rs.getString(4)+" /Edad: "+rs.getInt(5)+" /Peso: "+rs.getDouble(6)+" /Tipo de Anfibio: "+rs.getString(7)+" /Venenosa"+rs.getBoolean(8)+" /Color de Piel"+rs.getString(9)+".\n";
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
				}
				
				
				
				String query2 = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, salamandra.\"tipoDeAnfibio\", salamandra.venenosa FROM animal INNER JOIN salamandra ON animal.id = salamandra.id";
				ResultSet rs2 = db.dbStatementimp(query2);
				
				try {
					while (rs2.next()) {
						msj2 += "Id # "+rs2.getInt(1)+" -> Nombre comun: "+rs2.getString(2)+" /Nombre Cientifico: "+rs2.getString(3)+" /Genero: "+rs2.getString(4)+" /Edad: "+rs2.getInt(5)+" /Peso: "+rs2.getDouble(6)+" /Tipo de Anfibio: "+rs2.getString(7)+" /Venenosa"+rs2.getBoolean(8)+".\n";
					}
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				finally {
	                try {
	                   rs2.close();
	                    
	                    
	                } catch (SQLException a2) {
	                	a2.printStackTrace();
	                }
				}
				
				
				
				Imprimir pr = new Imprimir(msj+msj2);
				dispose();
			}
			
		});
		btnNewButton.setBounds(48, 66, 160, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2. Aves");
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB db = DB.getInstances();
				String query = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, avestruz.\"periodoDeIncubacion\", avestruz.vuela, avestruz.\"tamanoCuello\" FROM animal INNER JOIN avestruz ON animal.id = avestruz.id";
				ResultSet rs = db.dbStatementimp(query);
				String msj = new String();
				String msj2 = new String();
				try {
					while (rs.next()) {
						msj += "Id # "+rs.getInt(1)+" -> Nombre comun: "+rs.getString(2)+" /Nombre Cientifico: "+rs.getString(3)+" /Genero: "+rs.getString(4)+" /Edad: "+rs.getInt(5)+" /Peso: "+rs.getDouble(6)+" /Peridodo de Incubacion: "+rs.getInt(7)+" /Vuela"+rs.getBoolean(8)+" /Tamano Cuello"+rs.getDouble(9)+".\n";
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
				}
				
				
				
				String query2 = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, flamenco.\"periodoDeIncubacion\", flamenco.vuela, flamenco.\"numPlumas\" FROM animal INNER JOIN flamenco ON animal.id = flamenco.id";
				ResultSet rs2 = db.dbStatementimp(query2);
				
				try {
					while (rs2.next()) {
						msj2 += "Id # "+rs2.getInt(1)+" -> Nombre comun: "+rs2.getString(2)+" /Nombre Cientifico: "+rs2.getString(3)+" /Genero: "+rs2.getString(4)+" /Edad: "+rs2.getInt(5)+" /Peso: "+rs2.getDouble(6)+" /Periodo de Incubacion: "+rs2.getInt(7)+" /Vuela: "+rs2.getBoolean(8)+" /Numero de Plumas: "+rs2.getInt(9)+".\n";
					}
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				finally {
	                try {
	                   rs2.close();
	                    
	                    
	                } catch (SQLException a2) {
	                	a2.printStackTrace();
	                }
				}
				
				
				
				Imprimir pr = new Imprimir(msj);
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(262, 66, 160, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3. Mamiferos");
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DB db = DB.getInstances();
				String query = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, orangutan.alimento, orangutan.\"periodoDeLactancia\", orangutan.\"enCelo\", orangutan.iq, orangutan.\"conPareja\" FROM animal INNER JOIN orangutan ON animal.id = orangutan.id";
				ResultSet rs = db.dbStatementimp(query);
				String msj = new String();
				String msj2 = new String();
				try {
					while (rs.next()) {
						msj += "Id # "+rs.getInt(1)+" -> Nombre comun: "+rs.getString(2)+" /Nombre Cientifico: "+rs.getString(3)+" /Genero: "+rs.getString(4)+" /Edad: "+rs.getInt(5)+" /Peso: "+rs.getDouble(6)+" /Alimento: "+rs.getString(7)+" /Periodo de Lactancia: "+rs.getInt(8)+" /En celo: "+rs.getBoolean(9)+" /Iq: "+rs.getInt(10)+" /Con pareja: "+rs.getBoolean(11)+".\n";
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
				}
				
				
				
				String query2 = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, jaguar.alimento, jaguar.\"periodoDeLactancia\", jaguar.\"enCelo\", jaguar.\"numManchas\", jaguar.\"numDientes\" FROM animal INNER JOIN jaguar ON animal.id = jaguar.id";
				ResultSet rs2 = db.dbStatementimp(query2);
				
				try {
					while (rs2.next()) {
						msj2 += "Id # "+rs2.getInt(1)+" -> Nombre comun: "+rs2.getString(2)+" /Nombre Cientifico: "+rs2.getString(3)+" /Genero: "+rs2.getString(4)+" /Edad: "+rs2.getInt(5)+" /Peso: "+rs2.getDouble(6)+" /Alimento: "+rs2.getString(7)+" /Perido de Lactancia: "+rs2.getInt(8)+" /En celo: "+rs2.getBoolean(9)+" /Numero de Manchas: "+rs2.getInt(10)+" /Numero de Dientes: "+rs2.getInt(11)+".\n";
					}
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				finally {
	                try {
	                   rs2.close();
	                    
	                    
	                } catch (SQLException a2) {
	                	a2.printStackTrace();
	                }
				}
				
				
				
							
				Imprimir pr = new Imprimir(msj+msj2);
				dispose();
			}
		});
		btnNewButton_2.setBounds(48, 144, 160, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4. Reptiles");
		btnNewButton_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB db = DB.getInstances();
				String query = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, cocodrilo.\"periodoDeIncubacion\", cocodrilo.escamas, cocodrilo.patas, cocodrilo.\"largoDeCola\" FROM animal INNER JOIN cocodrilo ON animal.id = cocodrilo.id";
				ResultSet rs = db.dbStatementimp(query);
				String msj = new String();
				String msj2 = new String();
				try {
					while (rs.next()) {
						msj += "Id # "+rs.getInt(1)+" -> Nombre comun: "+rs.getString(2)+" /Nombre Cientifico: "+rs.getString(3)+" /Genero: "+rs.getString(4)+" /Edad: "+rs.getInt(5)+" /Peso: "+rs.getDouble(6)+" /Periodo de Incubacion: "+rs.getInt(7)+" /Escamas: "+rs.getBoolean(8)+" /Patas: "+rs.getBoolean(9)+" /Largo de Cola: "+rs.getDouble(10)+".\n";
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
				}
				
				
				
				String query2 = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, serpiente.longitud, serpiente.venenosa, serpiente.color FROM animal INNER JOIN serpiente ON animal.id = serpiente.id";
				ResultSet rs2 = db.dbStatementimp(query2);
				
				try {
					while (rs2.next()) {
						msj2 += "Id # "+rs2.getInt(1)+" -> Nombre comun: "+rs2.getString(2)+" /Nombre Cientifico: "+rs2.getString(3)+" /Genero: "+rs2.getString(4)+" /Edad: "+rs2.getInt(5)+" /Peso: "+rs2.getDouble(6)+" /Longitud: "+rs2.getDouble(7)+" /Venenosa: "+rs2.getBoolean(8)+" /Color: "+rs2.getString(9)+".\n";
					}
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				finally {
	                try {
	                   rs2.close();
	                    
	                    
	                } catch (SQLException a2) {
	                	a2.printStackTrace();
	                }
				}
				
				
				Imprimir pr = new Imprimir(msj+msj2);
				dispose();
				
			}
		});
		btnNewButton_3.setBounds(262, 144, 160, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5. Todos los animales");
		btnNewButton_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB db = DB.getInstances();
				String query = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, \"claseAnimal\".nombreclase, \"tipoAnimal\".nombretipo FROM animal INNER JOIN public.\"tipoAnimal\" ON animal.id_tipo = \"tipoAnimal\".id_tipo INNER JOIN \"claseAnimal\" ON animal.id_clase = \"claseAnimal\".id_clase ORDER BY id";
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
				db.dbClose();
				
				Imprimir pr = new Imprimir(msj);
				dispose();
				
			}
		});
		btnNewButton_4.setBounds(133, 228, 215, 50);
		contentPane.add(btnNewButton_4);
		setVisible(true);
	}

}
