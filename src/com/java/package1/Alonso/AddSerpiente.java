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

public class AddSerpiente extends JFrame {


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

	/**
	 * Create the frame.
	 */
	public AddSerpiente(ArrayList<Object> objetos1,ArrayList<Reptil> reptiles1) {
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 494, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ncom = new JTextField();
		ncom.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncom.setBounds(239, 74, 168, 20);
		contentPane.add(ncom);
		ncom.setColumns(10);
		
		ncien = new JTextField();
		ncien.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncien.setBounds(240, 99, 168, 20);
		contentPane.add(ncien);
		ncien.setColumns(10);
		
		edad = new JTextField();
		edad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		edad.setBounds(239, 161, 86, 20);
		contentPane.add(edad);
		edad.setColumns(10);
		
		peso = new JTextField();
		peso.setFont(new Font("Tahoma", Font.PLAIN, 11));
		peso.setBounds(239, 189, 86, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		inc = new JTextField();
		inc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		inc.setBounds(239, 214, 86, 20);
		contentPane.add(inc);
		inc.setColumns(10);
		
		
		longi = new JTextField();
		longi.setFont(new Font("Tahoma", Font.PLAIN, 11));
		longi.setColumns(10);
		longi.setBounds(239, 304, 86, 20);
		contentPane.add(longi);
		
		color = new JTextField();
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
		mach.setBounds(239, 131, 65, 23);
		contentPane.add(mach);
		
		JRadioButton hem = new JRadioButton("hembra");
		hem.setBounds(319, 131, 109, 23);
		contentPane.add(hem);
		
		JRadioButton patas1 = new JRadioButton("");
		patas1.setBounds(239, 241, 109, 23);
		contentPane.add(patas1);
		
		JRadioButton escamas1 = new JRadioButton("");
		escamas1.setBounds(239, 274, 109, 23);
		contentPane.add(escamas1);
		
		JRadioButton venenosa = new JRadioButton("");
		venenosa.setBounds(239, 330, 86, 20);
		contentPane.add(venenosa);
		
		JButton btnAgregar = new JButton("Agregar Serpiente");
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
				te.setPeso(Integer.parseInt(peso.getText()));
				te.setPeriodoDeIncubacion(Integer.parseInt(inc.getText()));
				te.setPatas(patas1.isSelected());
				te.setEscamas(escamas1.isSelected());
				te.setLongitud(Double.parseDouble(longi.getText()));
				te.setVenenosa(venenosa.isSelected());
				te.setColor(color.getText());
				
				objetos1.add(te);
				reptiles1.add(te);
				JOptionPane.showMessageDialog(null, "Animal Ingresado");
				dispose();
			    }
			}
		});
		btnAgregar.setBounds(151, 385, 190, 32);
		contentPane.add(btnAgregar);
		
		lblNewLabel_1 = new JLabel("Ingresar los datos de la nueva Serpiente:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(23, 23, 445, 37);
		contentPane.add(lblNewLabel_1);
		
		}
}
