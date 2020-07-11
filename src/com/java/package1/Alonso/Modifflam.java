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

public class Modifflam extends JFrame {

	private JPanel contentPane;
	private JTextField ncom;
	private JTextField ncien;
	private JTextField gen;
	private JTextField edad;
	private JTextField peso;
	private JTextField inc;
	private JTextField vuela;
	private JTextField pulmas;
	private JLabel lblNewLabel_1;
	private JTextField textField;


	/**
	 * Create the frame.
	 * 
	 * @throws SQLException 
	 */
	public Modifflam(ResultSet rs, int id) throws SQLException {
		
		 Flamenco flama = new Flamenco();
	        
			
			while (rs.next()) {
				flama.setNombreComun(rs.getString(2));
				flama.setNombreCientifico(rs.getString(3));
				flama.setGenero(rs.getString(4));
				flama.setEdad(rs.getInt(5));
				flama.setPeso(rs.getInt(6));
				flama.setPeriodoDeIncubacion(rs.getInt(7));
				flama.setVuela(rs.getBoolean(8));
				flama.setNumPlumas(rs.getInt(9));
				
			}
		
		
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 468, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ncom = new JTextField(flama.getNombreComun());
		ncom.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncom.setBounds(226, 55, 168, 20);
		contentPane.add(ncom);
		ncom.setColumns(10);
		
		ncien = new JTextField(flama.getNombreCientifico());
		ncien.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncien.setBounds(226, 86, 168, 20);
		contentPane.add(ncien);
		ncien.setColumns(10);
		
		JRadioButton mach = new JRadioButton("macho");
		if("macho".equals(flama.getGenero())) {
			mach.setSelected(true);
		}
		mach.setBounds(220, 121, 86, 20);
		contentPane.add(mach);
		
		JRadioButton hem = new JRadioButton("hembra");
		if("hembra".equals(flama.getGenero())) {
			hem.setSelected(true);
		}
		hem.setBounds(308, 121, 86, 20);
		contentPane.add(hem);
		
		edad = new JTextField(String.valueOf(flama.getEdad()));
		edad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		edad.setBounds(226, 148, 86, 20);
		contentPane.add(edad);
		edad.setColumns(10);
		
		peso = new JTextField(String.valueOf(flama.getPeso()));
		peso.setFont(new Font("Tahoma", Font.PLAIN, 11));
		peso.setBounds(226, 179, 86, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		inc = new JTextField(String.valueOf(flama.getPeriodoDeIncubacion()));
		inc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		inc.setBounds(226, 210, 86, 20);
		contentPane.add(inc);
		inc.setColumns(10);
		
		JRadioButton vuela = new JRadioButton("");
		if(flama.getVuela()==true) {
			vuela.setSelected(true);
		}
		vuela.setBounds(226, 249, 86, 20);
		contentPane.add(vuela);
		
		pulmas = new JTextField(String.valueOf(flama.getNumPlumas()));
		pulmas.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pulmas.setBounds(226, 280, 86, 20);
		contentPane.add(pulmas);
		pulmas.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre Comun:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(35, 56, 148, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombreCientifico = new JLabel("Nombre Cientifico:");
		lblNombreCientifico.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombreCientifico.setBounds(35, 87, 148, 14);
		contentPane.add(lblNombreCientifico);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGenero.setBounds(35, 118, 148, 14);
		contentPane.add(lblGenero);
		
		JLabel lblEdad = new JLabel("Edad (anios):");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEdad.setBounds(35, 149, 148, 19);
		contentPane.add(lblEdad);
		
		JLabel lblPeso = new JLabel("Peso (en Kg):");
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPeso.setBounds(35, 180, 148, 19);
		contentPane.add(lblPeso);
		
		JLabel lblTipoDeAnfibio = new JLabel("Periodo de incubacion (dias):");
		lblTipoDeAnfibio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDeAnfibio.setBounds(35, 211, 181, 15);
		contentPane.add(lblTipoDeAnfibio);
		
		JLabel lblColor = new JLabel("Vuela (true o false):");
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblColor.setBounds(35, 250, 148, 14);
		contentPane.add(lblColor);
		
		JLabel lblVenenosatrueOr = new JLabel("Numero de plumas:");
		lblVenenosatrueOr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVenenosatrueOr.setBounds(35, 281, 148, 14);
		contentPane.add(lblVenenosatrueOr);
		
		JButton btnAgregar = new JButton("Modificar");
		btnAgregar.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Flamenco flamo = new Flamenco();
				
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
				flamo.setNombreComun(ncom.getText());
				flamo.setNombreCientifico(ncien.getText());
				flamo.setGenero(gen);
				flamo.setEdad(Integer.parseInt(edad.getText()));
				flamo.setPeso(Double.parseDouble(peso.getText()));
				flamo.setPeriodoDeIncubacion(Integer.parseInt(inc.getText()));
				flamo.setVuela(vuela.isSelected());
				flamo.setNumPlumas(Integer.parseInt(pulmas.getText()));
				
				try
				{
				//ingresar los datos en la tabla animal
				Object[] obj = {flamo.getNombreComun(), flamo.getNombreCientifico(), flamo.getGenero(), flamo.getEdad(), flamo.getPeso()};
				
				DB db = DB.getInstances();
				
				db.dbPrepareStatement("UPDATE animal SET \"nombreComun\"=?, \"nombreCientifico\"=?, genero=?, edad=?, peso=? WHERE id="+id+";", obj);
				//*******
				
							
				
				//ingresar los datos en la tabla flamenco
				Object[] ste = {flamo.getPeriodoDeIncubacion(), flamo.getVuela(), flamo.getNumPlumas()};
				
	
				
				db.dbPrepareStatementflamo("UPDATE flamenco SET \"periodoDeIncubacion\"=?, vuela=?, \"numPlumas\"=? WHERE id="+id+";", ste);
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
		btnAgregar.setBounds(89, 323, 148, 32);
		contentPane.add(btnAgregar);
		
		lblNewLabel_1 = new JLabel("Flamenco:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(21, 11, 421, 33);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField(String.valueOf(id));
		textField.setEditable(false);
		textField.setBounds(130, 21, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Abortar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton.setBounds(248, 323, 125, 30);
		contentPane.add(btnNewButton);
		
		setVisible(true);
		
	}

}
