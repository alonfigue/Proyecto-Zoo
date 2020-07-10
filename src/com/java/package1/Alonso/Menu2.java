package com.java.package1.Alonso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Menu2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Menu2() {
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 522, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Imprimir");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu3 print = new Menu3();
				
			}
		});
		btnNewButton.setBounds(342, 63, 105, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Agregar");
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu4 ad = new Menu4();
			}
		});
		btnNewButton_1.setBounds(342, 138, 105, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				DB db = DB.getInstances();
				db.dbClose();
			}
		});
		btnNewButton_2.setBounds(342, 218, 105, 50);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("MENU DE OPCIONES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(145, 11, 228, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1. Imprimir lista de animales del Zoo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(54, 81, 263, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2. Agregar nuevo animal al Zoo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(54, 147, 204, 32);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("3. Salir de la aplicacion");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(56, 227, 181, 32);
		contentPane.add(lblNewLabel_3);
		
		setVisible(true);
	}
}
