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

public class AddSalamandra extends JFrame {

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

	/**
	 * Create the frame.
	 */
	public AddSalamandra(ArrayList<Anfibio> anfibios1,ArrayList<Object> objetos1) {
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 463, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ncom = new JTextField();
		ncom.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncom.setBounds(208, 54, 168, 20);
		contentPane.add(ncom);
		ncom.setColumns(10);
		
		ncien = new JTextField();
		ncien.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncien.setBounds(208, 85, 168, 20);
		contentPane.add(ncien);
		ncien.setColumns(10);
		
		JRadioButton mach = new JRadioButton("macho");
		mach.setBounds(208, 123, 86, 20);
		contentPane.add(mach);
		
		JRadioButton hem = new JRadioButton("hembra");
		hem.setBounds(290, 123, 86, 20);
		contentPane.add(hem);
		
		edad = new JTextField();
		edad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		edad.setBounds(208, 150, 86, 20);
		contentPane.add(edad);
		edad.setColumns(10);
		
		peso = new JTextField();
		peso.setFont(new Font("Tahoma", Font.PLAIN, 11));
		peso.setBounds(208, 191, 86, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		tipo = new JTextField();
		tipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tipo.setBounds(208, 222, 86, 20);
		contentPane.add(tipo);
		tipo.setColumns(10);
	
		JRadioButton venenosa = new JRadioButton("");
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
		
		JButton btnAgregar = new JButton("Agregar Salamandra");
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
				
				db.dbPrepareStatement("insert into animal(\"nombreComun\", \"nombreCientifico\", genero, edad, peso, id_clase, id_tipo) values( ?, ?, ? , ?, ?,5,5)", obj);
				//*******
				
				//obetener el id del animal
				
				int result;
				String qr = "SELECT id FROM animal WHERE id=(SELECT max(id) FROM animal)";
				result= db.dbStatementid(qr);
				
				
				
				//ingresar los datos en la tabla salamandra
				Object[] ste = {sala.getTipoDeAnfibio(),sala.getVenenosa()};
				
				
				
				db.dbPrepareStatementsala("insert into salamandra(\"tipoDeAnfibio\", venenosa, id) values( ?, ?,"+result+")", ste);
				//********
				db.dbClose();
				}
				finally
				{
				
								
				JOptionPane.showMessageDialog(null, "Animal Ingresado");
				dispose();
				}
			    }
			}
		});
		btnAgregar.setBounds(125, 290, 190, 32);
		contentPane.add(btnAgregar);
		
		lblNewLabel_1 = new JLabel("Ingresar los datos de la nueva Salamandra:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setBounds(10, 11, 427, 32);
		contentPane.add(lblNewLabel_1);
		
		
	}
}
