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

public class AddAve extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public AddAve(ArrayList<Object> objetos1,ArrayList<Ave> aves1) {
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 449, 277);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elegir tipo de Ave a agregar al Zoo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(42, 23, 365, 33);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("1. Flamenco");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddFlamenco flama = new AddFlamenco(objetos1, aves1);
				flama.setVisible(true);
				
				dispose();
			}
		});
		btnNewButton.setBounds(137, 90, 160, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2. Avestruz");
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddAvestruz atr = new AddAvestruz(objetos1, aves1);
				atr.setVisible(true);
				
				dispose();
			}
		});
		btnNewButton_1.setBounds(137, 167, 160, 40);
		contentPane.add(btnNewButton_1);
		setVisible(true);
	}

}
