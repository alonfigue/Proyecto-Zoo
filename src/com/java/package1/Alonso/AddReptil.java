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

public class AddReptil extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public AddReptil(ArrayList<Object> objetos1,ArrayList<Reptil> reptiles1) {
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 448, 271);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elegir tipo de Reptil a agregar al Zoo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(27, 11, 397, 31);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("1. Serpiente");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddSerpiente ste = new AddSerpiente(objetos1, reptiles1);
				ste.setVisible(true);
				
				dispose();
			}
		});
		btnNewButton.setBounds(133, 70, 160, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2. Cocodrilo");
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCocodrilo crl = new AddCocodrilo(objetos1, reptiles1);
				crl.setVisible(true);
				
				dispose();
			}
		});
		btnNewButton_1.setBounds(133, 147, 160, 40);
		contentPane.add(btnNewButton_1);
		setVisible(true);
	}

}
