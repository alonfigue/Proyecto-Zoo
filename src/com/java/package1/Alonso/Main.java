package com.java.package1.Alonso;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
		
		//-Introduccion de objetos y datos (animales que ya estan en el ZOO)
	    //Reptiles
	    Serpiente se = new Serpiente("Serpiente","Serpentes","Hembra",4,5,120,false,true,2,true,"marron");
	    Cocodrilo co = new Cocodrilo("Cocodrilo", "Crocodylidae", "Macho", 62, 950, 90, true,true, 1.80);
	     
	    //Aves
	    Avestruz az = new Avestruz();
		az.setNombreComun("Avestruz");
		az.setNombreCientifico("Struthio camelus");
		az.setGenero("Macho");
		az.setEdad(32);
		az.setPeso(112);
		az.setPeriodoDeIncubacion(40);
		az.setVuela(false);
	    az.setTamanoCuello(1.2);
		
		Flamenco fo = new Flamenco();
		fo.setNombreComun("Flamenco");
		fo.setNombreCientifico("Phoenicopterus");
		fo.setGenero("Hembra");
		fo.setEdad(16);
		fo.setPeso(4);
		fo.setPeriodoDeIncubacion(30);
		fo.setVuela(true);
	    fo.setNumPlumas(12);
			
		Lechuza la = new Lechuza();
		la.setNombreComun("Lechuza");
		la.setNombreCientifico("Tyto alba");
		la.setGenero("Hembra");
		la.setEdad(9);
		la.setPeso(0.8);  
		la.setPeriodoDeIncubacion(30); 
		la.setVuela(true);
	    la.setColor("Blanco");
		
		Halcon hn = new Halcon();
		hn.setNombreComun("Halcon");
		hn.setNombreCientifico("Falco");
		hn.setGenero("Macho");
		hn.setEdad(12);
		hn.setPeso(1.3);
		hn.setPeriodoDeIncubacion(30);
		hn.setVuela(true);
	    hn.setTamanoAla(0.1);
		
		Tucan tn = new Tucan();
		tn.setNombreComun("Tucan");
		tn.setNombreCientifico("Ramphastidae");
		tn.setGenero("Macho");
		tn.setEdad(7);
		tn.setPeso(1);
		tn.setPeriodoDeIncubacion(50);
		tn.setVuela(true);
		tn.setColorPico("Rojo");
				
		//Mamiferos
		Jaguar jr = new Jaguar();
		jr.setNombreComun("Jaguar");
		jr.setNombreCientifico("Panthera onca");
		jr.setGenero("Macho");
		jr.setEdad(10);
		jr.setPeso(87);
		jr.setAlimento("Carne");
		jr.setPeriodoDeLactancia(180);
		jr.setEnCelo(false);
		jr.setNumManchas(26);
		jr.setNumDientes(30);
		
		Orangutan on1 = new Orangutan();
		on1.setNombreComun("Orangutan");
		on1.setNombreCientifico("Pongo");
		on1.setGenero("Macho");
		on1.setEdad(26);
		on1.setPeso(82);
		on1.setAlimento("Vegetales, hojas e insectos");
		on1.setPeriodoDeLactancia(1800);
		on1.setEnCelo(true);
		on1.setIq(72);
		on1.setConPareja(true);
		 
		Orangutan on2 = new Orangutan();
		on2.setNombreComun("Orangutan");
		on2.setNombreCientifico("Pongo");
		on2.setGenero("Hembra");
		on2.setEdad(30);
		on2.setPeso(75);
		on2.setAlimento("Vegetales, hojas e insectos");
		on2.setPeriodoDeLactancia(1800);
		on2.setEnCelo(true);
		on2.setIq(65);
		on2.setConPareja(true);
		
		Jirafa ja = new Jirafa();
		ja.setNombreComun("Jirafa");
		ja.setNombreCientifico("Giraffa camelopardalis");
		ja.setGenero("Hembra");
		ja.setEdad(20);
		ja.setPeso(800);
		ja.setAlimento("Hojas");
		ja.setPeriodoDeLactancia(360);
		ja.setEnCelo(false);
		ja.setLargoDeCuello(2);
		ja.setNumManchas(36);
		
		Elefante ee = new Elefante();
		ee.setNombreComun("Elefante");
	    ee.setNombreCientifico("Elephantidae");
	    ee.setGenero("Macho");
		ee.setEdad(57);
		ee.setPeso(6000);
		ee.setAlimento("Frutas y plantas");
		ee.setPeriodoDeLactancia(660);
		ee.setEnCelo(false);
		ee.setLargoTrompa(2);
		
		Oso oo = new Oso();
		oo.setNombreComun("Oso");
	    oo.setNombreCientifico("Ursidae");
	    oo.setGenero("Hembra");
		oo.setEdad(12);
		oo.setPeso(500);
		oo.setAlimento("Frutas y peces");
		oo.setPeriodoDeLactancia(500);
		oo.setEnCelo(true);
		oo.setColor("Marron");
		oo.setEstatura(2.3);
		 
		//Anfibios
		Salamandra sa = new Salamandra();
		sa.setNombreComun("Salamandra");
		sa.setNombreCientifico("Urodela");
		sa.setGenero("Hembra");
		sa.setEdad(8);
		sa.setPeso(0.19);
		sa.setTipoDeAnfibio("Caudado");
		sa.setVenenosa(true);
		
		Rana ra = new Rana();
		ra.setNombreComun("Rana");
		ra.setNombreCientifico("Anura");
		ra.setGenero("Macho");
		ra.setEdad(7);
		ra.setPeso(0.22);
		ra.setTipoDeAnfibio("Anuro");
		ra.setColorDePiel("Verde manzana");
		ra.setVenenosa(true);
		
	    //Declaracion de arraylists, donde se almacenan los objetos en los arreglos. 
	    ArrayList <Object> objetos = new ArrayList<Object>();        //array de todos los animales
	    
	    ArrayList <Anfibio> anfibios = new ArrayList<Anfibio>();     //array de anfibios
	    ArrayList <Ave> aves = new ArrayList<Ave>();                 //array de aves
	    ArrayList <Mamifero> mamiferos = new ArrayList<Mamifero>();  //array de mamiferos
	    ArrayList <Reptil> reptiles = new ArrayList<Reptil>();       //array de reptiles 
	    
	    //almacenando...
    	objetos.add(oo); mamiferos.add(oo);  //oso
     	
		objetos.add(ra); anfibios.add(ra); //rana
		
		objetos.add(jr);  mamiferos.add(jr);  //jaguar
		
		objetos.add(tn); aves.add(tn);   //tucan
		
		objetos.add(co);  reptiles.add(co);  //cocodrilo
		
     	objetos.add(ee);  mamiferos.add(ee);  //elefante
		
		objetos.add(fo); aves.add(fo);   //flamenco
		
     	objetos.add(on2); mamiferos.add(on2); //orangutan 2
		
		objetos.add(la);  aves.add(la);  //lechuza
			
    	objetos.add(ja); mamiferos.add(ja);  //jirafa
     	
		objetos.add(az); aves.add(az);   ///avestruz
     		
		objetos.add(sa); anfibios.add(sa); //salamandra
		
	    objetos.add(se); reptiles.add(se);   //serpiente
		
		objetos.add(hn);  aves.add(hn);  //halcon
		
		objetos.add(on1);  mamiferos.add(on1); //orangutan 1
		
		//llamada al menu principal
		Menu1 frame = new Menu1(anfibios,objetos,aves,mamiferos,reptiles);
		frame.setVisible(true);

	}
    
}