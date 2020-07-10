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

public class AddAvestruz extends JFrame {

	private JPanel contentPane;
	private JTextField ncom;
	private JTextField ncien;
	private JTextField gen;
	private JTextField edad;
	private JTextField peso;
	private JTextField inc;
	private JTextField vuela;
	private JTextField cuello;
	private JLabel lblNewLabel_1;

	/**
	 * Create the frame.
	 */
	
	public AddAvestruz() {
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 472, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ncom = new JTextField();
		ncom.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncom.setBounds(218, 54, 168, 20);
		contentPane.add(ncom);
		ncom.setColumns(10);
		
		ncien = new JTextField();
		ncien.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncien.setBounds(218, 85, 168, 20);
		contentPane.add(ncien);
		ncien.setColumns(10);
		
		edad = new JTextField();
		edad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		edad.setBounds(218, 147, 86, 20);
		contentPane.add(edad);
		edad.setColumns(10);
		
		peso = new JTextField();
		peso.setFont(new Font("Tahoma", Font.PLAIN, 11));
		peso.setBounds(218, 178, 86, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		inc = new JTextField();
		inc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		inc.setBounds(218, 209, 86, 20);
		contentPane.add(inc);
		inc.setColumns(10);
		
		JRadioButton vuela = new JRadioButton("");
		vuela.setBounds(218, 240, 86, 20);
		contentPane.add(vuela);
		
		cuello = new JTextField();
		cuello.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cuello.setBounds(218, 271, 86, 20);
		contentPane.add(cuello);
		cuello.setColumns(10);
		
		JRadioButton mach = new JRadioButton("macho");
		mach.setBounds(218, 120, 86, 20);
		contentPane.add(mach);
		
		JRadioButton hem = new JRadioButton("hembra");
		hem.setBounds(306, 120, 86, 20);
		contentPane.add(hem);
		
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
		lblPeso.setBounds(35, 176, 97, 26);
		contentPane.add(lblPeso);
		
		JLabel lblTipoDeAnfibio = new JLabel("Periodo de incubacion (dias):");
		lblTipoDeAnfibio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDeAnfibio.setBounds(35, 211, 187, 14);
		contentPane.add(lblTipoDeAnfibio);
		
		JLabel lblColor = new JLabel("Vuela (true o false):");
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblColor.setBounds(35, 242, 148, 14);
		contentPane.add(lblColor);
		
		JLabel lblVenenosatrueOr = new JLabel("Tamanio del cuello (mts):");
		lblVenenosatrueOr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVenenosatrueOr.setBounds(35, 272, 168, 14);
		contentPane.add(lblVenenosatrueOr);
		
		JButton btnAgregar = new JButton("Agregar Avestruz");
		btnAgregar.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Avestruz tz = new Avestruz();
				
				
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
				tz.setNombreComun(ncom.getText());
				tz.setNombreCientifico(ncien.getText());
				tz.setGenero(gen);
				tz.setEdad(Integer.parseInt(edad.getText()));
				tz.setPeso(Double.parseDouble(peso.getText()));
				tz.setPeriodoDeIncubacion(Integer.parseInt(inc.getText()));
				tz.setVuela(vuela.isSelected());
				tz.setTamanoCuello(Double.parseDouble(cuello.getText()));
				
				try
				{
				//ingresar los datos en la tabla animal
				Object[] obj = {tz.getNombreComun(),tz.getNombreCientifico(),tz.getGenero(), tz.getEdad(), tz.getPeso()};
				
				DB db = DB.getInstances();
				
				db.dbPrepareStatement("insert into animal(\"nombreComun\", \"nombreCientifico\", genero, edad, peso, id_clase, id_tipo) values( ?, ?, ? , ?, ?,3,9)", obj);
				//*******
				
				//obetener el id del animal
				
				int result;
				String qr = "SELECT id FROM animal WHERE id=(SELECT max(id) FROM animal)";
				result= db.dbStatementid(qr);
				
			
				//ingresar los datos en la tabla avestruz
				Object[] ste = {tz.getPeriodoDeIncubacion(), tz.getVuela(), tz.getTamanoCuello()};
				
				db.dbPrepareStatementtz("insert into avestruz(\"periodoDeIncubacion\", vuela, \"tamanoCuello\", id) values( ?, ?, ?,"+result+")", ste);
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
		btnAgregar.setBounds(129, 302, 192, 34);
		contentPane.add(btnAgregar);
		
		lblNewLabel_1 = new JLabel("Ingresar los datos del nuevo Avestruz:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(23, 11, 423, 32);
		contentPane.add(lblNewLabel_1);
		
		
	}
}
