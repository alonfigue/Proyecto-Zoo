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

public class Menu4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Menu4() {
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 518, 284);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elegir categoria de animal nuevo a ingresar al Zoo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(32, 11, 460, 22);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("1. Anfibio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddAnfibio anf = new AddAnfibio();
				
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton.setBounds(56, 75, 160, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2. Ave");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddAve ave = new AddAve();
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton_1.setBounds(268, 75, 160, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3. Mamifero");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddMamifero mamf = new AddMamifero();
			    dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton_2.setBounds(56, 161, 160, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4. Reptil");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddReptil rep = new AddReptil();
			    dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton_3.setBounds(268, 161, 160, 40);
		contentPane.add(btnNewButton_3);
		setVisible(true);
	}
}
