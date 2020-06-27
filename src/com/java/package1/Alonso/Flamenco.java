package com.java.package1.Alonso;

import java.util.ArrayList;
import java.util.Scanner;

public class Flamenco extends Ave implements Volar{
	
	//Atributos
	private int numPlumas;
    
    //Constructor
	public Flamenco() {super();}
	
    public Flamenco(String nombreComun, String nombreCientifico, String genero, int edad, int peso,
  	int periodoDeIncubacion, boolean vuela, int numPlumas, double tamanoPatas) {
  	   super(nombreComun, nombreCientifico, genero, edad, peso, periodoDeIncubacion, vuela); //Invocando al constructor del padre
  	   this.numPlumas = numPlumas;
  	}
  		
    //Setters y getters
    public int getNumPlumas() 
    {
  	return numPlumas;
  	}
  	public void setNumPlumas(int numPlumas) {this.numPlumas = numPlumas;}
  		
  	//interfaz
	public void fly(){} 
  		
  	//del metodo abstracto
  	public void formaAgitarAlas() {}
  		
 	public String toString() {return super.toString() +" / Numero de plumas: "+this.getNumPlumas()+ "plumas";}
 	
 	
 	
 	//crear un flamenco
 	public Flamenco inFlamenco() {
    	System.out.println("\n\t\t->Llenar el siguiente registro del animal nuevo para el ZOO.");
	    Scanner objetoZoo = new Scanner(System.in);
	    
        //parametros Animal
	    System.out.print("\nNombre común del animal:");
 	    String nombreComun = objetoZoo.nextLine();         
		   
	    System.out.print("Nombre cientifico:");
        String nombreCientifico = objetoZoo.nextLine();
      
	    System.out.print("Genero del animal:");
	    String genero = objetoZoo.nextLine();    
		   
	    System.out.print("Edad del animal:");
	    int edad = objetoZoo.nextInt(); 
	   
	    System.out.print("Peso del animal (en Kg):");
	    int peso = objetoZoo.nextInt(); 
	    
        //parametros aves
	    System.out.print("Periodo de incubacion (en dias):");
	    int periodoDeIncubacion = objetoZoo.nextInt();
	    
	    System.out.print("Vuela (true o false):");
	    Boolean vuela = objetoZoo.nextBoolean();
	    
        //parametros flamenco
	    System.out.print("Numero de plumas:");
	    int numPlumas = objetoZoo.nextInt();
	    
	    //crear e instanciar el objeto
	    Flamenco flam = new Flamenco();
	    flam.setNombreComun(nombreComun);
	    flam.setNombreCientifico(nombreCientifico);
	    flam.setGenero(genero);
	    flam.setEdad(edad);
	    flam.setPeso(peso);
	    flam.setPeriodoDeIncubacion(periodoDeIncubacion);
	    flam.setVuela(vuela);
	    flam.setNumPlumas(numPlumas);
	    
        return flam;
    }
 	
 	
 }







