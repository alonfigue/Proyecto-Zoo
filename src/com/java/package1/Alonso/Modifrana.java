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

public class Modifrana extends JFrame {

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
	public Modifrana(ResultSet rs, int id) throws SQLException {
		
		 Rana ra = new Rana();
	        
			
			while (rs.next()) {
				ra.setNombreComun(rs.getString(2));
				ra.setNombreCientifico(rs.getString(3));
				ra.setGenero(rs.getString(4));
				ra.setEdad(rs.getInt(5));
				ra.setPeso(rs.getInt(6));
				ra.setTipoDeAnfibio(rs.getString(7));
				ra.setVenenosa(rs.getBoolean(8));
				ra.setColorDePiel(rs.getString(9));
				
				
			}
		
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 466, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ncom = new JTextField(ra.getNombreComun());
		ncom.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncom.setBounds(208, 56, 168, 20);
		contentPane.add(ncom);
		ncom.setColumns(10);
		
		ncien = new JTextField(ra.getNombreCientifico());
		ncien.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncien.setBounds(208, 87, 168, 20);
		contentPane.add(ncien);
		ncien.setColumns(10);
		
		JRadioButton mach = new JRadioButton("macho");
		if("macho".equals(ra.getGenero())) {
			mach.setSelected(true);
		}
		mach.setBounds(209, 121, 86, 20);
		contentPane.add(mach);
		
		JRadioButton hem = new JRadioButton("hembra");
		if("hembra".equals(ra.getGenero())) {
			hem.setSelected(true);
		}
		hem.setBounds(297, 121, 86, 20);
		contentPane.add(hem);
		
		edad = new JTextField(String.valueOf(ra.getEdad()));
		edad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		edad.setBounds(208, 152, 86, 20);
		contentPane.add(edad);
		edad.setColumns(10);
		
		peso = new JTextField(String.valueOf(ra.getPeso()));
		peso.setFont(new Font("Tahoma", Font.PLAIN, 11));
		peso.setBounds(208, 181, 86, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		tipo = new JTextField(ra.getTipoDeAnfibio());
		tipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tipo.setBounds(208, 212, 86, 20);
		contentPane.add(tipo);
		tipo.setColumns(10);
		
		color = new JTextField(ra.getColorDePiel());
		color.setFont(new Font("Tahoma", Font.PLAIN, 11));
		color.setBounds(208, 243, 86, 20);
		contentPane.add(color);
		color.setColumns(10);
		
		JRadioButton venenosa = new JRadioButton("");
		if(ra.getVenenosa()==true) {
			venenosa.setSelected(true);
		}
		venenosa.setBounds(208, 274, 86, 20);
		contentPane.add(venenosa);
		
		JLabel lblNewLabel = new JLabel("Nombre Comun:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(35, 57, 148, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombreCientifico = new JLabel("Nombre Cientifico:");
		lblNombreCientifico.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombreCientifico.setBounds(35, 88, 148, 14);
		contentPane.add(lblNombreCientifico);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGenero.setBounds(35, 119, 148, 14);
		contentPane.add(lblGenero);
		
		JLabel lblEdad = new JLabel("Edad (anios):");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEdad.setBounds(35, 153, 148, 14);
		contentPane.add(lblEdad);
		
		JLabel lblPeso = new JLabel("Peso (en Kg):");
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPeso.setBounds(35, 182, 148, 19);
		contentPane.add(lblPeso);
		
		JLabel lblTipoDeAnfibio = new JLabel("Tipo de Anfibio:");
		lblTipoDeAnfibio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDeAnfibio.setBounds(35, 213, 148, 14);
		contentPane.add(lblTipoDeAnfibio);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblColor.setBounds(35, 244, 148, 14);
		contentPane.add(lblColor);
		
		JLabel lblVenenosatrueOr = new JLabel("Venenosa (true o false):");
		lblVenenosatrueOr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVenenosatrueOr.setBounds(35, 275, 148, 14);
		contentPane.add(lblVenenosatrueOr);
		
		JButton btnAgregar = new JButton("Modificar");
		btnAgregar.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rana rann = new Rana();
				
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
				rann.setNombreComun(ncom.getText());
				rann.setNombreCientifico(ncien.getText());
				rann.setGenero(gen);
				rann.setEdad(Integer.parseInt(edad.getText()));
				rann.setPeso(Double.parseDouble(peso.getText()));
				rann.setTipoDeAnfibio(tipo.getText());
				rann.setColorDePiel(color.getText());
				rann.setVenenosa(venenosa.isSelected());
				
				try
				{
				//ingresar los datos en la tabla animal
				Object[] obj = {rann.getNombreComun(),rann.getNombreCientifico(),rann.getGenero(), rann.getEdad(), rann.getPeso()};
				
				DB db = DB.getInstances();
				
				db.dbPrepareStatement("UPDATE animal SET \"nombreComun\"=?, \"nombreCientifico\"=?, genero=?, edad=?, peso=? WHERE id="+id+";", obj);
				//*******
				
					
				
				
				//ingresar los datos en la tabla rana
				Object[] ste = {rann.getTipoDeAnfibio(),rann.getVenenosa(), rann.getColorDePiel()};
				
				
				
				db.dbPrepareStatementrann("UPDATE rana SET \"tipoDeAnfibio\"=?, venenosa=?,\"colorDePiel\"=? WHERE id="+id+";", ste);
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
		btnAgregar.setBounds(95, 301, 148, 32);
		contentPane.add(btnAgregar);
		
		lblNewLabel_1 = new JLabel("Rana:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(30, 11, 114, 32);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Abortar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton.setBounds(253, 301, 123, 30);
		contentPane.add(btnNewButton);
		
		textField = new JTextField(String.valueOf(id));
		textField.setEditable(false);
		textField.setBounds(95, 21, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		setVisible(true);
			    
	}

}
