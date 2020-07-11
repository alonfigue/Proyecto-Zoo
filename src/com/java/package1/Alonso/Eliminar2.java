package com.java.package1.Alonso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Eliminar2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Eliminar2(String msj, int id) {
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 805, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Animal a Eliminar");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(301, 11, 208, 27);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea(msj);
		textArea.setBounds(10, 49, 769, 51);
		contentPane.add(textArea);
		
		JButton erase = new JButton("Eliminar");
		erase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                
				
				try {
				DB db = DB.getInstances();
				db.dbPrepareStatementelim(id);
				}finally
				{
				JOptionPane.showMessageDialog(null, "Animal Eliminado");
				dispose();
				}
				
			}
		});
		erase.setBounds(268, 117, 107, 23);
		contentPane.add(erase);
		
		JButton noterase = new JButton("No eliminar");
		noterase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		noterase.setBounds(398, 117, 105, 23);
		contentPane.add(noterase);
		
		setVisible(true);
	}
}
