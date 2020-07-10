package com.java.package1.Alonso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;

public class AddCocodrilo extends JFrame {


	private JPanel contentPane;
	private JTextField ncom;
	private JTextField ncien;
	private JTextField gen;
	private JTextField edad;
	private JTextField peso;
	private JTextField inc;
	private JTextField patas;
	private JTextField escamas;
	private JTextField cola;
	private JTextField venenosa;
	private JTextField color;
	private JLabel lblLongitudmts;
	private JLabel lblVenenosatrueO;
	private JLabel lblColor_1;
	private JLabel lblNewLabel_1;

	/**
	 * Create the frame.
	 */
	public AddCocodrilo() {
		setTitle("APP Zoo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 491, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ncom = new JTextField();
		ncom.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncom.setBounds(221, 55, 168, 20);
		contentPane.add(ncom);
		ncom.setColumns(10);
		
		ncien = new JTextField();
		ncien.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ncien.setBounds(221, 86, 168, 20);
		contentPane.add(ncien);
		ncien.setColumns(10);
		
			
		edad = new JTextField();
		edad.setFont(new Font("Tahoma", Font.PLAIN, 11));
		edad.setBounds(221, 148, 86, 20);
		contentPane.add(edad);
		edad.setColumns(10);
		
		peso = new JTextField();
		peso.setFont(new Font("Tahoma", Font.PLAIN, 11));
		peso.setBounds(221, 179, 86, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		inc = new JTextField();
		inc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		inc.setBounds(221, 210, 86, 20);
		contentPane.add(inc);
		inc.setColumns(10);
		
				
		cola = new JTextField();
		cola.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cola.setColumns(10);
		cola.setBounds(221, 299, 86, 20);
		contentPane.add(cola);
		
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
		lblPeso.setBounds(35, 182, 148, 17);
		contentPane.add(lblPeso);
		
		JLabel lblTipoDeAnfibio = new JLabel("Periodo de incubacion (dias):");
		lblTipoDeAnfibio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDeAnfibio.setBounds(35, 211, 199, 14);
		contentPane.add(lblTipoDeAnfibio);
		
		JLabel lblColor = new JLabel("Patas (true o false):");
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblColor.setBounds(35, 242, 148, 14);
		contentPane.add(lblColor);
		
		JLabel lblVenenosatrueOr = new JLabel("Escamas (true o false):");
		lblVenenosatrueOr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVenenosatrueOr.setBounds(35, 273, 148, 14);
		contentPane.add(lblVenenosatrueOr);
		
		lblLongitudmts = new JLabel("Largo de la cola (mts):");
		lblLongitudmts.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLongitudmts.setBounds(35, 298, 148, 19);
		contentPane.add(lblLongitudmts);
		
		JRadioButton patas1 = new JRadioButton("");
		patas1.setBounds(221, 237, 109, 23);
		contentPane.add(patas1);
		
		JRadioButton escamas1 = new JRadioButton("");
		escamas1.setBounds(221, 273, 109, 23);
		contentPane.add(escamas1);
		
		JRadioButton mach = new JRadioButton("macho");
		mach.setBounds(221, 113, 65, 23);
		contentPane.add(mach);
		
		JRadioButton hem = new JRadioButton("hembra");
		hem.setBounds(293, 113, 109, 23);
		contentPane.add(hem);
		
		
		JButton btnAgregar = new JButton("Agregar Cocodrilo");
		btnAgregar.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cocodrilo drilo = new Cocodrilo();
				
				
				
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
				
				drilo.setNombreComun(ncom.getText());
				drilo.setNombreCientifico(ncien.getText());
				drilo.setGenero(gen);
				drilo.setEdad(Integer.parseInt(edad.getText()));
				drilo.setPeso(Double.parseDouble(peso.getText()));
				drilo.setPeriodoDeIncubacion(Integer.parseInt(inc.getText()));
				drilo.setPatas(patas1.isSelected());
				drilo.setEscamas(escamas1.isSelected());
				drilo.setLargoDeCola(Double.parseDouble(cola.getText()));
				
				try
				{
				//ingresar los datos en la tabla animal
				Object[] obj = {drilo.getNombreComun(),drilo.getNombreCientifico(),drilo.getGenero(), drilo.getEdad(), drilo.getPeso()};
				
				DB db = DB.getInstances();
				
				db.dbPrepareStatement("insert into animal(\"nombreComun\", \"nombreCientifico\", genero, edad, peso, id_clase, id_tipo) values( ?, ?, ? , ?, ?,4,12)", obj);
				//*******
				
				//obetener el id del animal
				
				int result;
				String qr = "SELECT id FROM animal WHERE id=(SELECT max(id) FROM animal)";
				result= db.dbStatementid(qr);
				
				
				
				//ingresar los datos en la tabla cocodrilo
				Object[] coc = {drilo.getPeriodoDeIncubacion(),drilo.getEscamas(),drilo.getPatas(), drilo.getLargoDeCola()};
				
				
				
				db.dbPrepareStatementcoc("insert into cocodrilo(\"periodoDeIncubacion\", escamas, patas, \"largoDeCola\", id) values( ?, ?, ? , ?,"+result+")", coc);
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
		btnAgregar.setBounds(131, 339, 190, 32);
		contentPane.add(btnAgregar);
		
		lblNewLabel_1 = new JLabel("Ingresar los datos del nuevo Cocodrilo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(35, 11, 409, 33);
		contentPane.add(lblNewLabel_1);
		}
}

