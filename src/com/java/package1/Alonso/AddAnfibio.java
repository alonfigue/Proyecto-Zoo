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

public class AddAnfibio extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public AddAnfibio() {
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elegir tipo de Anfibio a agregar al Zoo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 23, 400, 30);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("1. Rana");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddRana rana = new AddRana();
				rana.setVisible(true);
				
				dispose();
			}
		});
		btnNewButton.setBounds(129, 80, 160, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2. Salamandra");
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddSalamandra salam = new AddSalamandra();
				salam.setVisible(true);
				
				dispose();
			}
		});
		btnNewButton_1.setBounds(129, 163, 160, 40);
		contentPane.add(btnNewButton_1);
		setVisible(true);
	}

}
