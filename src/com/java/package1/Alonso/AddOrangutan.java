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

public class AddOrangutan extends JFrame {

	private JPanel contentPane;
	private JTextField ncom;
	private JTextField ncien;
	private JTextField gen;
	private JTextField edad;
	private JTextField peso;
	private JTextField alimento;
	private JTextField lactancia;
	private JTextField celo;
	private JTextField iq;
	private JTextField pareja;
	private JLabel lblLongitudmts;
	private JLabel lblVenenosatrueO;
	private JLabel lblNewLabel_1;

	/**
	 * Create the frame.
	 */
	public AddOrangutan(ArrayList<Object> objetos1,ArrayList<Mamifero> mamiferos1) {
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 487, 449);
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
		mach.setBounds(208, 124, 86, 20);
		contentPane.add(mach);
		
		JRadioButton hem = new JRadioButton("hembra");
		hem.setBounds(304, 124, 86, 20);
		contentPane.add(hem);
		
		edad = new JTextField();
		edad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		edad.setBounds(208, 152, 86, 20);
		contentPane.add(edad);
		edad.setColumns(10);
		
		peso = new JTextField();
		peso.setFont(new Font("Tahoma", Font.PLAIN, 11));
		peso.setBounds(208, 179, 86, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		alimento = new JTextField();
		alimento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		alimento.setBounds(208, 210, 168, 20);
		contentPane.add(alimento);
		alimento.setColumns(10);
		
		lactancia = new JTextField();
		lactancia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lactancia.setBounds(208, 241, 86, 20);
		contentPane.add(lactancia);
		lactancia.setColumns(10);
		
		JRadioButton celo = new JRadioButton("");
		celo.setBounds(208, 274, 86, 20);
		contentPane.add(celo);
		
		iq = new JTextField();
		iq.setFont(new Font("Tahoma", Font.PLAIN, 11));
		iq.setColumns(10);
		iq.setBounds(208, 305, 86, 20);
		contentPane.add(iq);
		
		JRadioButton pareja = new JRadioButton("");
		pareja.setBounds(208, 336, 86, 20);
		contentPane.add(pareja);
		
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
		lblPeso.setBounds(35, 175, 148, 32);
		contentPane.add(lblPeso);
		
		JLabel lblTipoDeAnfibio = new JLabel("Alimento:");
		lblTipoDeAnfibio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDeAnfibio.setBounds(35, 213, 163, 14);
		contentPane.add(lblTipoDeAnfibio);
		
		JLabel lblColor = new JLabel("Periodo de Lactancia (dias):");
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblColor.setBounds(35, 244, 180, 14);
		contentPane.add(lblColor);
		
		JLabel lblVenenosatrueOr = new JLabel("En celo (true o false):");
		lblVenenosatrueOr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVenenosatrueOr.setBounds(35, 275, 148, 14);
		contentPane.add(lblVenenosatrueOr);
		
		lblLongitudmts = new JLabel("Coeficiente intelectual:");
		lblLongitudmts.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLongitudmts.setBounds(35, 306, 148, 14);
		contentPane.add(lblLongitudmts);
		
		lblVenenosatrueO = new JLabel("Con pareja (true o false):");
		lblVenenosatrueO.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVenenosatrueO.setBounds(35, 337, 163, 14);
		contentPane.add(lblVenenosatrueO);
		
		JButton btnAgregar = new JButton("Agregar Orangutan");
		btnAgregar.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Orangutan gut = new Orangutan();
				
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
				gut.setNombreComun(ncom.getText());
				gut.setNombreCientifico(ncien.getText());
				gut.setGenero(gen);
				gut.setEdad(Integer.parseInt(edad.getText()));
				gut.setPeso(Integer.parseInt(peso.getText()));
				gut.setAlimento((alimento.getText()));
				gut.setPeriodoDeLactancia(Integer.parseInt(lactancia.getText()));
				gut.setEnCelo(celo.isSelected());
				gut.setIq(Integer.parseInt(iq.getText()));
				gut.setConPareja(pareja.isSelected());
				
				objetos1.add(gut);
				mamiferos1.add(gut);
				JOptionPane.showMessageDialog(null, "Animal Ingresado");
				dispose();
			    }
			}
		});
		btnAgregar.setBounds(140, 365, 190, 32);
		contentPane.add(btnAgregar);
		
		lblNewLabel_1 = new JLabel("Ingresar los datos del nuevo Orangutan:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(24, 11, 437, 32);
		contentPane.add(lblNewLabel_1);
		
		}
}
