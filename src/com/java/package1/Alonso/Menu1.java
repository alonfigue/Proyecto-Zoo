package com.java.package1.Alonso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Menu1 extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public Menu1(ArrayList<Anfibio> anfibios1,ArrayList<Object> objetos1,ArrayList<Ave> aves1,ArrayList<Mamifero> mamiferos1,ArrayList<Reptil> reptiles1) {
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 474, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenidos");
		lblNewLabel.setBounds(160, 35, 141, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Aplicacion de gestion del Zoologico");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(112, 97, 253, 33);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu2 m2 = new Menu2(anfibios1,objetos1,aves1,mamiferos1,reptiles1);
				
				dispose();
			}
		});
		btnNewButton.setBounds(151, 166, 150, 50);
		contentPane.add(btnNewButton);
	}
}
