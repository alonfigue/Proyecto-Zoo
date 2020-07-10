package com.java.package1.Alonso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AddFlamenco extends JFrame {

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

	/**
	 * Create the frame.
	 */
	public AddFlamenco() {
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 468, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ncom = new JTextField();
		ncom.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncom.setBounds(226, 55, 168, 20);
		contentPane.add(ncom);
		ncom.setColumns(10);
		
		ncien = new JTextField();
		ncien.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncien.setBounds(226, 86, 168, 20);
		contentPane.add(ncien);
		ncien.setColumns(10);
		
		JRadioButton mach = new JRadioButton("macho");
		mach.setBounds(220, 121, 86, 20);
		contentPane.add(mach);
		
		JRadioButton hem = new JRadioButton("hembra");
		hem.setBounds(308, 121, 86, 20);
		contentPane.add(hem);
		
		edad = new JTextField();
		edad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		edad.setBounds(226, 148, 86, 20);
		contentPane.add(edad);
		edad.setColumns(10);
		
		peso = new JTextField();
		peso.setFont(new Font("Tahoma", Font.PLAIN, 11));
		peso.setBounds(226, 179, 86, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		inc = new JTextField();
		inc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		inc.setBounds(226, 210, 86, 20);
		contentPane.add(inc);
		inc.setColumns(10);
		
		JRadioButton vuela = new JRadioButton("");
		vuela.setBounds(226, 249, 86, 20);
		contentPane.add(vuela);
		
		pulmas = new JTextField();
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
		
		JButton btnAgregar = new JButton("Agregar Flamenco");
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
				
				db.dbPrepareStatement("insert into animal(\"nombreComun\", \"nombreCientifico\", genero, edad, peso, id_clase, id_tipo) values( ?, ?, ? , ?, ?,3,8)", obj);
				//*******
				
				//obetener el id del animal
				
				int result;
				String qr = "SELECT id FROM animal WHERE id=(SELECT max(id) FROM animal)";
				result= db.dbStatementid(qr);
				
				
				
				//ingresar los datos en la tabla flamenco
				Object[] ste = {flamo.getPeriodoDeIncubacion(), flamo.getVuela(), flamo.getNumPlumas()};
				
	
				
				db.dbPrepareStatementflamo("insert into flamenco(\"periodoDeIncubacion\", vuela, \"numPlumas\", id) values( ?, ?, ?,"+result+")", ste);
				//********   
				
				}
				finally
				{
				JOptionPane.showMessageDialog(null, "Animal Ingresado");
				dispose();
			    }
			}
			}
		});
		btnAgregar.setBounds(128, 323, 190, 32);
		contentPane.add(btnAgregar);
		
		lblNewLabel_1 = new JLabel("Ingresar los datos del nuevo Flamenco:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(21, 11, 421, 33);
		contentPane.add(lblNewLabel_1);
	}
}
