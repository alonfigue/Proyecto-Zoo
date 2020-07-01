package com.java.package1.Alonso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Font;

public class Imprimir extends JFrame {

	private JPanel contentPane;

		/**
	 * Create the frame.
	 */
	public Imprimir(String msj) {
			setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800,500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista de animales de la categoria seleccionada en el Zoo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(89, 11, 608, 33);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 55, 693, 362);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea(msj);		textArea.setLineWrap(true);
    		
		scrollPane.setViewportView(textArea);
		
		
		setVisible(true);
	}
}
