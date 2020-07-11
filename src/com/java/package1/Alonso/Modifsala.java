package com.java.package1.Alonso;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Modifsala extends JFrame {

	private JPanel contentPane;
	private JTextField ncom;
	private JTextField ncien;
	private JTextField gen;
	private JTextField edad;
	private JTextField peso;
	private JTextField tipo;
	private JTextField color;
	private JTextField venenosa;
	private JLabel lblNewLabel_1;
	private JTextField textField;


	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Modifsala(ResultSet rs, int id) throws SQLException {
		
		Salamandra sa = new Salamandra();
        
		
		while (rs.next()) {
			sa.setNombreComun(rs.getString(2));
			sa.setNombreCientifico(rs.getString(3));
			sa.setGenero(rs.getString(4));
			sa.setEdad(rs.getInt(5));
			sa.setPeso(rs.getInt(6));
			sa.setTipoDeAnfibio(rs.getString(7));
			sa.setVenenosa(rs.getBoolean(8));
			
			
			
		}
		System.out.print("esto es"+sa.getNombreComun());
		
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 463, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ncom = new JTextField(sa.getNombreComun());
		ncom.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncom.setBounds(208, 54, 168, 20);
		contentPane.add(ncom);
		ncom.setColumns(10);
		
		ncien = new JTextField(sa.getNombreCientifico());
		ncien.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncien.setBounds(208, 85, 168, 20);
		contentPane.add(ncien);
		ncien.setColumns(10);
		
		JRadioButton mach = new JRadioButton("macho");
		if("macho".equals(sa.getGenero())) {
			mach.setSelected(true);
		}
		mach.setBounds(208, 123, 86, 20);
		contentPane.add(mach);
		
		JRadioButton hem = new JRadioButton("hembra");
		if("hembra".equals(sa.getGenero())) {
			hem.setSelected(true);
		}
		hem.setBounds(290, 123, 86, 20);
		contentPane.add(hem);
		
		edad = new JTextField(String.valueOf(sa.getEdad()));
		edad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		edad.setBounds(208, 150, 86, 20);
		contentPane.add(edad);
		edad.setColumns(10);
		
		peso = new JTextField(String.valueOf(sa.getPeso()));
		peso.setFont(new Font("Tahoma", Font.PLAIN, 11));
		peso.setBounds(208, 191, 86, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		tipo = new JTextField(sa.getTipoDeAnfibio());
		tipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tipo.setBounds(208, 222, 86, 20);
		contentPane.add(tipo);
		tipo.setColumns(10);
	
		JRadioButton venenosa = new JRadioButton("");
		if(sa.getVenenosa()==true) {
			venenosa.setSelected(true);
		}
		venenosa.setBounds(208, 253, 86, 20);
		contentPane.add(venenosa);
		
		JLabel lblNewLabel = new JLabel("Nombre Comun:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(35, 55, 148, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombreCientifico = new JLabel("Nombre Cientifico:");
		lblNombreCientifico.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombreCientifico.setBounds(35, 86, 148, 14);
		contentPane.add(lblNombreCientifico);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGenero.setBounds(35, 117, 148, 14);
		contentPane.add(lblGenero);
		
		JLabel lblEdad = new JLabel("Edad (anios):");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEdad.setBounds(35, 151, 148, 14);
		contentPane.add(lblEdad);
		
		JLabel lblPeso = new JLabel("Peso (en Kg):");
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPeso.setBounds(35, 191, 148, 17);
		contentPane.add(lblPeso);
		
		JLabel lblTipoDeAnfibio = new JLabel("Tipo de Anfibio:");
		lblTipoDeAnfibio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDeAnfibio.setBounds(35, 223, 148, 14);
		contentPane.add(lblTipoDeAnfibio);
	
		JLabel lblVenenosatrueOr = new JLabel("Venenosa (true o false):");
		lblVenenosatrueOr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVenenosatrueOr.setBounds(35, 254, 148, 14);
		contentPane.add(lblVenenosatrueOr);
		
		JButton btnAgregar = new JButton("Modificar");
		btnAgregar.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Salamandra sala = new Salamandra();
				
				String gen = new String();
				
			    if (hem.isSelected() && mach.isSelected() || !hem.isSelected() && !mach.isSelected()){
			     
			     
			     JOptionPane.showMessageDialog(null, "Seleccione un genero");
			     
			    }
			    else {
			    	
				if (hem.isSelected()) {
					gen ="hembra";
			    }
				else if(mach.isSelected()) {
					gen ="macho";
				}
				sala.setNombreComun(ncom.getText());
				sala.setNombreCientifico(ncien.getText());
				sala.setGenero(gen);
				sala.setEdad(Integer.parseInt(edad.getText()));
				sala.setPeso(Double.parseDouble(peso.getText()));
				sala.setTipoDeAnfibio(tipo.getText());
				sala.setVenenosa(venenosa.isSelected());
				
				try
				{
				//ingresar los datos en la tabla animal
				Object[] obj = {sala.getNombreComun(),sala.getNombreCientifico(),sala.getGenero(), sala.getEdad(), sala.getPeso()};
				
				DB db = DB.getInstances();
				
				db.dbPrepareStatement("UPDATE animal SET \"nombreComun\"=?, \"nombreCientifico\"=?, genero=?, edad=?, peso=? WHERE id="+id+";", obj);
				//*******
				
								
				
				
				//ingresar los datos en la tabla salamandra
				Object[] ste = {sala.getTipoDeAnfibio(),sala.getVenenosa()};
				
				
				
				db.dbPrepareStatementsala("UPDATE salamandra SET \"tipoDeAnfibio\"=?, venenosa=? WHERE id="+id+";",ste);
				//********
				
				}
				finally
				{
				
								
				JOptionPane.showMessageDialog(null, "Animal Modificado");
				dispose();
				}
			    }
			}
		});
		btnAgregar.setBounds(70, 290, 148, 32);
		contentPane.add(btnAgregar);
		
		lblNewLabel_1 = new JLabel("Salamandra:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setBounds(10, 11, 427, 32);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField(String.valueOf(id));
		textField.setEditable(false);
		textField.setBounds(140, 21, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Abortar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton.setBounds(239, 290, 137, 30);
		contentPane.add(btnNewButton);
		
		setVisible(true);
	}

}
