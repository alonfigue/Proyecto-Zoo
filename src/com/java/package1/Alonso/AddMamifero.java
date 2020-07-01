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

public class AddMamifero extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public AddMamifero(ArrayList<Object> objetos1,ArrayList<Mamifero> mamiferos1) {
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elegir tipo de Mamifero a agregar al Zoo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 414, 48);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("1. Orangutan");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddOrangutan ngu = new AddOrangutan(objetos1, mamiferos1);
				ngu.setVisible(true);
				
				dispose();
			}
		});
		btnNewButton.setBounds(134, 96, 160, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2. Jaguar");
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddJaguar ste = new AddJaguar(objetos1, mamiferos1);
				ste.setVisible(true);
				
				dispose();
			}
		});
		btnNewButton_1.setBounds(134, 176, 160, 40);
		contentPane.add(btnNewButton_1);
		setVisible(true);
	}

}
