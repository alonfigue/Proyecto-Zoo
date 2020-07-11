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

public class Eliminar extends JFrame {

	private JPanel contentPane;
	private JTextField Id;

	
	public Eliminar() {
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 411, 184);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Eliminar Animal");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(116, 11, 148, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Introducir el Id del animal a eliminar:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(25, 58, 239, 16);
		contentPane.add(lblNewLabel_1);
		
		Id = new JTextField();
		Id.setBounds(262, 56, 86, 20);
		contentPane.add(Id);
		Id.setColumns(10);
		
		JButton btnNewButton = new JButton("eliminar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =Integer.parseInt(Id.getText());
				
				DB db = DB.getInstances();
				String query = "SELECT animal.id, animal.\"nombreComun\", animal.\"nombreCientifico\", animal.genero, animal.edad, animal.peso, \"claseAnimal\".nombreclase, \"tipoAnimal\".nombretipo FROM animal INNER JOIN public.\"tipoAnimal\" ON animal.id_tipo = \"tipoAnimal\".id_tipo INNER JOIN \"claseAnimal\" ON animal.id_clase = \"claseAnimal\".id_clase WHERE animal.id="+id+";";
				ResultSet rs = db.dbStatementimp(query);
				String msj = new String();
				
				try {
					while (rs.next()) {
						msj += "Id # "+rs.getInt(1)+" -> Nombre comun: "+rs.getString(2)+" /Nombre Cientifico: "+rs.getString(3)+" /Genero: "+rs.getString(4)+" /Edad: "+rs.getInt(5)+" /Peso: "+rs.getDouble(6)+" /Clase de Animal: "+rs.getString(7)+" /Tipo de Animal"+rs.getString(8)+".\n";
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
				
	                Eliminar2 el = new Eliminar2(msj, id);
	                dispose();
			}
				
			}
		});
		btnNewButton.setBounds(144, 111, 89, 23);
		contentPane.add(btnNewButton);
		
		setVisible(true);

}
	}