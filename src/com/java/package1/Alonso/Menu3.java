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
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Menu3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Menu3(ArrayList<Anfibio> anfibios1,ArrayList<Object> objetos1,ArrayList<Ave> aves1,ArrayList<Mamifero> mamiferos1,ArrayList<Reptil> reptiles1) {
		
	
		
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
				
				String msj = new String();
				for(int i=0; i<anfibios1.size(); i++) {
					msj += "Animal #"+(i+1)+"->"+anfibios1.get(i)+".\n\n";
				}
				
				Imprimir pr = new Imprimir(msj);
				dispose();
			}
			
		});
		btnNewButton.setBounds(48, 66, 160, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2. Aves");
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msj = new String();
				for(int i=0; i<aves1.size(); i++) {
					msj += "Animal #"+(i+1)+"->"+aves1.get(i)+".\n\n";
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
				
				String msj = new String();
				for(int i=0; i<mamiferos1.size(); i++) {
					msj += "Animal #"+(i+1)+"->"+mamiferos1.get(i)+".\n\n";
				}
				
				Imprimir pr = new Imprimir(msj);
				dispose();
			}
		});
		btnNewButton_2.setBounds(48, 144, 160, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4. Reptiles");
		btnNewButton_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msj = new String();
				for(int i=0; i<reptiles1.size(); i++) {
					msj += "Animal #"+(i+1)+"->"+reptiles1.get(i)+".\n\n";
				}
				
				Imprimir pr = new Imprimir(msj);
				dispose();
				
			}
		});
		btnNewButton_3.setBounds(262, 144, 160, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5. Todos los animales");
		btnNewButton_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msj = new String();
				for(int i=0; i<objetos1.size(); i++) {
					msj += "Animal #"+(i+1)+"->"+objetos1.get(i)+".\n\n";
				}
				
				Imprimir pr = new Imprimir(msj);
				dispose();
				
			}
		});
		btnNewButton_4.setBounds(133, 228, 215, 50);
		contentPane.add(btnNewButton_4);
		setVisible(true);
	}

}
