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

public class Modifserpiente extends JFrame {

	private JPanel contentPane;
	private JTextField ncom;
	private JTextField ncien;
	private JTextField edad;
	private JTextField peso;
	private JTextField inc;
	private JTextField patas;
	private JTextField escamas;
	private JTextField longi;
	private JTextField venenosa;
	private JTextField color;
	private JLabel lblLongitudmts;
	private JLabel lblVenenosatrueO;
	private JLabel lblColor_1;
	private JLabel lblNewLabel_1;
	private JTextField textField;


	/**
	 * Create the frame.
	 * @param rs2 
	 * @throws SQLException 
	 */
	public Modifserpiente(ResultSet rs, int id) throws SQLException {
		
		Serpiente nserp = new Serpiente();
		
		while (rs.next()) {
			nserp.setNombreComun(rs.getString(2));
			nserp.setNombreCientifico(rs.getString(3));
			nserp.setGenero(rs.getString(4));
			nserp.setEdad(rs.getInt(5));
			nserp.setPeso(rs.getInt(6));
			nserp.setPeriodoDeIncubacion(rs.getInt(7));
			nserp.setEscamas(rs.getBoolean(8));
			nserp.setPatas(rs.getBoolean(9));
			nserp.setLongitud(rs.getDouble(10));
			nserp.setVenenosa(rs.getBoolean(11));
			nserp.setColor(rs.getString(12));
		}
		

		
		
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 494, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ncom = new JTextField(nserp.getNombreComun());
		ncom.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncom.setBounds(239, 74, 168, 20);
		contentPane.add(ncom);
		ncom.setColumns(10);
		
		ncien = new JTextField(nserp.getNombreCientifico());
		ncien.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncien.setBounds(240, 99, 168, 20);
		contentPane.add(ncien);
		ncien.setColumns(10);
		
		edad = new JTextField(String.valueOf(nserp.getEdad()));
		edad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		edad.setBounds(239, 161, 86, 20);
		contentPane.add(edad);
		edad.setColumns(10);
		
		peso = new JTextField(String.valueOf(nserp.getPeso()));
		peso.setFont(new Font("Tahoma", Font.PLAIN, 11));
		peso.setBounds(239, 189, 86, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		inc = new JTextField(String.valueOf(nserp.getPeriodoDeIncubacion()));
		inc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		inc.setBounds(239, 214, 86, 20);
		contentPane.add(inc);
		inc.setColumns(10);
		
		
		longi = new JTextField(String.valueOf(nserp.getLongitud()));
		longi.setFont(new Font("Tahoma", Font.PLAIN, 11));
		longi.setColumns(10);
		longi.setBounds(239, 304, 86, 20);
		contentPane.add(longi);
		
		color = new JTextField(nserp.getColor());
		color.setFont(new Font("Tahoma", Font.PLAIN, 11));
		color.setColumns(10);
		color.setBounds(240, 356, 86, 20);
		contentPane.add(color);
		
		JLabel lblNewLabel = new JLabel("Nombre Comun:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(40, 79, 148, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombreCientifico = new JLabel("Nombre Cientifico:");
		lblNombreCientifico.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombreCientifico.setBounds(38, 105, 148, 14);
		contentPane.add(lblNombreCientifico);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGenero.setBounds(41, 134, 148, 14);
		contentPane.add(lblGenero);
		
		JLabel lblEdad = new JLabel("Edad (anios):");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEdad.setBounds(41, 160, 148, 14);
		contentPane.add(lblEdad);
		
		JLabel lblPeso = new JLabel("Peso (en Kg):");
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPeso.setBounds(41, 187, 151, 21);
		contentPane.add(lblPeso);
		
		JLabel lblTipoDeAnfibio = new JLabel("Periodo de incubacion (dias):");
		lblTipoDeAnfibio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDeAnfibio.setBounds(41, 216, 185, 14);
		contentPane.add(lblTipoDeAnfibio);
		
		JLabel lblColor = new JLabel("Patas (true o false):");
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblColor.setBounds(41, 246, 148, 14);
		contentPane.add(lblColor);
		
		JLabel lblVenenosatrueOr = new JLabel("Escamas (true o false):");
		lblVenenosatrueOr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVenenosatrueOr.setBounds(41, 277, 148, 14);
		contentPane.add(lblVenenosatrueOr);
		
		lblLongitudmts = new JLabel("Longitud (mts):");
		lblLongitudmts.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLongitudmts.setBounds(42, 304, 148, 21);
		contentPane.add(lblLongitudmts);
		
		lblVenenosatrueO = new JLabel("Venenosa (true o false):");
		lblVenenosatrueO.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVenenosatrueO.setBounds(42, 331, 148, 14);
		contentPane.add(lblVenenosatrueO);
		
		lblColor_1 = new JLabel("Color:");
		lblColor_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblColor_1.setBounds(43, 358, 148, 14);
		contentPane.add(lblColor_1);
		
		JRadioButton mach = new JRadioButton("macho");
		if("macho".equals(nserp.getGenero())) {
			mach.setSelected(true);
		}
		mach.setBounds(239, 131, 65, 23);
		contentPane.add(mach);
		
		JRadioButton hem = new JRadioButton("hembra");
		if("hembra".equals(nserp.getGenero())) {
			hem.setSelected(true);
		}
		hem.setBounds(319, 131, 109, 23);
		contentPane.add(hem);
		
		JRadioButton patas1 = new JRadioButton("");
		if(nserp.getPatas()==true) {
			patas1.setSelected(true);
		}
		patas1.setBounds(239, 241, 109, 23);
		contentPane.add(patas1);
		
		JRadioButton escamas1 = new JRadioButton("");
		if(nserp.getEscamas()==true) {
			escamas1.setSelected(true);
		}
		escamas1.setBounds(239, 274, 109, 23);
		contentPane.add(escamas1);
		
		JRadioButton venenosa = new JRadioButton("");
		if(nserp.getVenenosa()==true) {
			venenosa.setSelected(true);
		}
		venenosa.setBounds(239, 330, 86, 20);
		contentPane.add(venenosa);
		
		JButton btnAgregar = new JButton("Modificar");
		btnAgregar.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Serpiente te = new Serpiente();
				
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
				
				te.setNombreComun(ncom.getText());
				te.setNombreCientifico(ncien.getText());
				te.setGenero(gen);
				te.setEdad(Integer.parseInt(edad.getText()));
				te.setPeso(Double.parseDouble(peso.getText()));
				te.setPeriodoDeIncubacion(Integer.parseInt(inc.getText()));
				te.setPatas(patas1.isSelected());
				te.setEscamas(escamas1.isSelected());
				te.setLongitud(Double.parseDouble(longi.getText()));
				te.setVenenosa(venenosa.isSelected());
				te.setColor(color.getText());
				
				try
				{
				//ingresar los datos en la tabla animal
				Object[] obj = {te.getNombreComun(),te.getNombreCientifico(),te.getGenero(), te.getEdad(), te.getPeso()};
				
				DB db = DB.getInstances();
				
				db.dbPrepareStatement("UPDATE animal SET \"nombreComun\"=? , \"nombreCientifico\"=?, genero=?, edad=?, peso=? WHERE id="+id+";", obj);
				//*******
				
							
				
				
				//ingresar los datos en la tabla cocodrilo
				Object[] ste = {te.getPeriodoDeIncubacion(),te.getEscamas(),te.getPatas(), te.getLongitud(), te.getVenenosa(), te.getColor()};
				
				//DB db = DB.getInstances();
				
				db.dbPrepareStatementste("UPDATE serpiente SET \"periodoDeIncubacion\"=?, escamas=?, patas=?, longitud=?, venenosa=?, \"color\"=? WHERE id="+id+";", ste);
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
		btnAgregar.setBounds(71, 387, 141, 32);
		contentPane.add(btnAgregar);
		
		lblNewLabel_1 = new JLabel("Serpiente:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(23, 23, 121, 37);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField(String.valueOf(id));
		textField.setEditable(false);
		textField.setBounds(140, 35, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
	JButton btnNewButton = new JButton("Abortar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton.setBounds(307, 387, 121, 32);
		contentPane.add(btnNewButton);
		
			
		setVisible(true);
	}
}
