package com.java.package1.Alonso;

import java.util.ArrayList;
import java.util.Scanner;

public class Cocodrilo extends Reptil implements Destruir{
	
	//Atributos
	private double largoDeCola;
	
	//Constructor
	public Cocodrilo() {super();}
	
	public Cocodrilo( String nombreComun, String nombreCientifico, String genero, int edad, int peso, int periodoDeIncubacion, boolean patas,
	boolean escamas, double largoDeCola){
		super(nombreComun, nombreCientifico, genero, edad, peso, periodoDeIncubacion, patas, escamas); //Invocando al constructor del padre
		this.largoDeCola = largoDeCola;
	}
	
			
	//Setters y getters
	public double getLargoDeCola() 
	{
    return largoDeCola;
	}
	public void setLargoDeCola(double largoDeCola) {this.largoDeCola = largoDeCola;}
		
	//interfaz
	public void destroy(){} 
			
	//del metodo abstracto
	public void arrastrarse() {}
	
	public String toString() {return super.toString() +" / Longitud de la cola: "+this.getLargoDeCola()+ "mts";}

	 //Ingresar un objeto Cocodrilo
	public Cocodrilo inCocodrilo() {
	System.out.println("\n\t\t->Llenar el siguiente registro del animal nuevo para el ZOO.");
	    Scanner objetoZoo = new Scanner(System.in);
	    
    //parametros Animal
    System.out.print("Nombre común del animal:");
    String nombreComun = objetoZoo.nextLine();          
	   
    System.out.print("Nombre cientifico:");
    String nombreCientifico = objetoZoo.nextLine();
  
    System.out.print("Genero del animal:");
    String genero = objetoZoo.nextLine();    
	   
    System.out.print("Edad del animal:");
    int edad = objetoZoo.nextInt(); 
   
    System.out.print("Peso del animal (en Kg):");
    int peso = objetoZoo.nextInt(); 
    
    //parametros Reptil    
    System.out.print("Periodo de incubacion (en dias):");
    int periodoDeIncubacion = objetoZoo.nextInt();
	
    System.out.print("Patas (true o false):");
    boolean patas = objetoZoo.nextBoolean();
	
    System.out.print("Escamas (true o false):");
    boolean escamas = objetoZoo.nextBoolean();
    
    //parametros cocodrilo
    System.out.print("Largo de cola (en mts):");
    double largoDeCola = objetoZoo.nextDouble();
    
    //crear e instanciar el objeto
    Cocodrilo coco = new Cocodrilo();
    coco.setNombreComun(nombreComun);
    coco.setNombreCientifico(nombreCientifico);
    coco.setGenero(genero);
    coco.setEdad(edad);
    coco.setPeso(peso);
    coco.setPeriodoDeIncubacion(periodoDeIncubacion);
    coco.setPatas(patas);
    coco.setEscamas(escamas);
    coco.setLargoDeCola(largoDeCola);
    
    return coco;
	}

}

