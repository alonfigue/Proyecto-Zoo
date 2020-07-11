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

public class Modifjag extends JFrame {

	private JPanel contentPane;
	private JTextField ncom;
	private JTextField ncien;
	private JTextField gen;
	private JTextField edad;
	private JTextField peso;
	private JTextField alimento;
	private JTextField lactancia;
	private JTextField celo;
	private JTextField manchas;
	private JTextField dientes;
	private JLabel lblLongitudmts;
	private JLabel lblVenenosatrueO;
	private JLabel lblNewLabel_1;
	private JTextField textField;



	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Modifjag(ResultSet rs,int id) throws SQLException {
		
		Jaguar jag = new Jaguar();
        
		
		while (rs.next()) {
			jag.setNombreComun(rs.getString(2));
			jag.setNombreCientifico(rs.getString(3));
			jag.setGenero(rs.getString(4));
			jag.setEdad(rs.getInt(5));
			jag.setPeso(rs.getInt(6));
			jag.setAlimento(rs.getString(7));
			jag.setPeriodoDeLactancia(rs.getInt(8));
			jag.setEnCelo(rs.getBoolean(9));
			jag.setNumManchas(rs.getInt(10));
			jag.setNumDientes(rs.getInt(11));
			
						
			
		}
		
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 481, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ncom = new JTextField(jag.getNombreComun());
		ncom.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncom.setBounds(208, 56, 168, 20);
		contentPane.add(ncom);
		ncom.setColumns(10);
		
		ncien = new JTextField(jag.getNombreCientifico());
		ncien.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncien.setBounds(208, 85, 168, 20);
		contentPane.add(ncien);
		ncien.setColumns(10);
		
		JRadioButton mach = new JRadioButton("macho");
		if("macho".equals(jag.getGenero())) {
			mach.setSelected(true);
		}
		mach.setBounds(208, 118, 86, 20);
		contentPane.add(mach);
		
		JRadioButton hem = new JRadioButton("hembra");
		if("hembra".equals(jag.getGenero())) {
			hem.setSelected(true);
		}
		hem.setBounds(290, 118, 86, 20);
		contentPane.add(hem);
		
		edad = new JTextField(String.valueOf(jag.getEdad()));
		edad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		edad.setBounds(208, 148, 86, 20);
		contentPane.add(edad);
		edad.setColumns(10);
		
		peso = new JTextField(String.valueOf(jag.getPeso()));
		peso.setFont(new Font("Tahoma", Font.PLAIN, 11));
		peso.setBounds(208, 179, 86, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		alimento = new JTextField(jag.getAlimento());
		alimento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		alimento.setBounds(208, 210, 168, 20);
		contentPane.add(alimento);
		alimento.setColumns(10);
		
		lactancia = new JTextField(String.valueOf(jag.getPeriodoDeLactancia()));
		lactancia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lactancia.setBounds(208, 241, 86, 20);
		contentPane.add(lactancia);
		lactancia.setColumns(10);
		
		JRadioButton celo = new JRadioButton("");
		if(jag.getEnCelo()==true) {
			celo.setSelected(true);
		}
		celo.setBounds(208, 274, 86, 20);
		contentPane.add(celo);
		
		manchas = new JTextField(String.valueOf(jag.getNumManchas()));
		manchas.setFont(new Font("Tahoma", Font.PLAIN, 11));
		manchas.setColumns(10);
		manchas.setBounds(208, 305, 86, 20);
		contentPane.add(manchas);
		
		dientes = new JTextField(String.valueOf(jag.getNumDientes()));
		dientes.setFont(new Font("Tahoma", Font.PLAIN, 11));
		dientes.setColumns(10);
		dientes.setBounds(208, 336, 86, 20);
		contentPane.add(dientes);
		
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
		lblPeso.setBounds(35, 183, 148, 17);
		contentPane.add(lblPeso);
		
		JLabel lblTipoDeAnfibio = new JLabel("Alimento:");
		lblTipoDeAnfibio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDeAnfibio.setBounds(35, 213, 163, 14);
		contentPane.add(lblTipoDeAnfibio);
		
		JLabel lblColor = new JLabel("Periodo de Lactancia (dias):");
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblColor.setBounds(35, 242, 190, 14);
		contentPane.add(lblColor);
		
		JLabel lblVenenosatrueOr = new JLabel("En celo (true o false):");
		lblVenenosatrueOr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVenenosatrueOr.setBounds(35, 273, 148, 14);
		contentPane.add(lblVenenosatrueOr);
		
		lblLongitudmts = new JLabel("Numero de  manchas:");
		lblLongitudmts.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLongitudmts.setBounds(35, 306, 148, 14);
		contentPane.add(lblLongitudmts);
		
		lblVenenosatrueO = new JLabel("Numero de dientes:");
		lblVenenosatrueO.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVenenosatrueO.setBounds(35, 337, 148, 14);
		contentPane.add(lblVenenosatrueO);
		
		JButton btnAgregar = new JButton("Modificar");
		btnAgregar.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jaguar gur = new Jaguar();
				
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
				
				gur.setNombreComun(ncom.getText());
				gur.setNombreCientifico(ncien.getText());
				gur.setGenero(gen);
				gur.setEdad(Integer.parseInt(edad.getText()));
				gur.setPeso(Double.parseDouble(peso.getText()));
				gur.setAlimento((alimento.getText()));
				gur.setPeriodoDeLactancia(Integer.parseInt(lactancia.getText()));
				gur.setEnCelo(celo.isSelected());
				gur.setNumManchas(Integer.parseInt(manchas.getText()));
				gur.setNumDientes(Integer.parseInt(dientes.getText()));
				

				try
				{
				//ingresar los datos en la tabla animal
				Object[] obj = {gur.getNombreComun(),gur.getNombreCientifico(), gur.getGenero(), gur.getEdad(), gur.getPeso()};
				
				DB db = DB.getInstances();
				
				db.dbPrepareStatement("UPDATE animal SET \"nombreComun\"=?, \"nombreCientifico\"=?, genero=?, edad=?, peso=? WHERE id="+id+";", obj);
				//*******
				
								
				
				//ingresar los datos en la tabla jaguar
				Object[] ste = {gur.getAlimento(), gur.getPeriodoDeLactancia(),gur.getEnCelo(), gur.getNumManchas(), gur.getNumDientes()};
				
	
				
				db.dbPrepareStatementgur("UPDATE jaguar SET alimento=?, \"periodoDeLactancia\"=?, \"enCelo\"=?, \"numManchas\"=?, \"numDientes\"=? WHERE id="+id+";", ste);
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
		btnAgregar.setBounds(90, 367, 148, 32);
		contentPane.add(btnAgregar);
		
		lblNewLabel_1 = new JLabel("Jaguar:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(50, 11, 370, 32);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Abortar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton.setBounds(268, 367, 133, 30);
		contentPane.add(btnNewButton);
		
		textField = new JTextField(String.valueOf(id));
		textField.setEditable(false);
		textField.setBounds(139, 21, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		setVisible(true);
	}

}
