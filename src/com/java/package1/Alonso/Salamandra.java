package com.java.package1.Alonso;

import java.util.ArrayList;
import java.util.Scanner;

public class Salamandra extends Anfibio{
	
	//Atributo
	private boolean venenosa;
	
	//Constructor
	public Salamandra() {super();}
	
	public Salamandra(String nombreComun, String nombreCientifico, String genero, int edad, int peso, String tipoDeAnfibio, boolean venenosa) {
	super(nombreComun, nombreCientifico, genero, edad, peso, tipoDeAnfibio); //Invocando al constructor del padre
	     this.venenosa = venenosa;
	}
		
	//Setter y getter
	public boolean getVenenosa() 
	{
	return venenosa;
	}
	public void setVenenosa(boolean venenosa) {this.venenosa = venenosa;}
		
	//del metodo abstracto
	public void nadar() {}
		
	public String toString() {return  super.toString()+ " / Venenosa:" +this.getVenenosa();}	 
	
	//Ingresar un objeto Salamandra
    public Salamandra inSalamandra() {
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
	    
        //parametros Anfibio
	    System.out.print("Tipo de anfibio:");
	    String tipoDeAnfibio = objetoZoo.next();
		
        //parametros salamandra
	    System.out.print("Venenoso (True o False):");
	    boolean venenoso = objetoZoo.nextBoolean();
	    
	    //crear e instanciar el objeto
	    Salamandra salamandra = new Salamandra();
	    salamandra.setNombreComun(nombreComun);
	    salamandra.setNombreCientifico(nombreCientifico);
	    salamandra.setGenero(genero);
	    salamandra.setEdad(edad);
	    salamandra.setPeso(peso);
	    salamandra.setTipoDeAnfibio(tipoDeAnfibio);
	    salamandra.setVenenosa(venenoso);
	 
	  
        return salamandra;
    }
}
