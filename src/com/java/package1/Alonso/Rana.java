package com.java.package1.Alonso;

import java.util.ArrayList;
import java.util.Scanner;

public class Rana extends Anfibio implements Saltar{
	
	//Atributos
	private String colorDePiel;
    private boolean venenosa;
    
    //Constructor
    public Rana() {super();}
    
  	public Rana( String nombreComun, String nombreCientifico, String genero, int edad, int peso, String tipoDeAnfibio, String colorDePiel ,boolean venenosa) {
    super( nombreComun, nombreCientifico, genero, edad, peso, tipoDeAnfibio); //Invocando al constructor del padre
  		this.colorDePiel = colorDePiel;
  		this.venenosa = venenosa;
  	}
  		
  	
  	//Setters y getters
    public String getColorDePiel() 
    {
  	return colorDePiel;
  	}
  	public void setColorDePiel(String colorDePiel) {this.colorDePiel = colorDePiel;}
  		
    public boolean getVenenosa() 
    {
  	return venenosa;
  	}
  	public void setVenenosa(boolean venenosa) {this.venenosa = venenosa;}
  
  	//interfaz
  	public void jump(){} 
  		
  	//del metodo abstracto
  	public void nadar() {}
  		
  	public String toString() {return  super.toString()+ " / Color:" +this.getColorDePiel()+ " / Venenosa:" +this.getVenenosa();}
  	
  	 //Ingresar un objeto Rana
    public Rana inRana() {
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
		
        //parametros rana
	    System.out.print("Color de Piel:");
	    String colorDePiel = objetoZoo.next();
	    
	    System.out.print("Venenoso (True o False):");
	    boolean venenoso = objetoZoo.nextBoolean();
	    
	    //crear e instanciar el objeto
	    Rana rana = new Rana();
	    rana.setNombreComun(nombreComun);
	    rana.setNombreCientifico(nombreCientifico);
	    rana.setGenero(genero);
	    rana.setEdad(edad);
	    rana.setPeso(peso);
	    rana.setTipoDeAnfibio(tipoDeAnfibio);
	    rana.setColorDePiel(colorDePiel);
	    rana.setVenenosa(venenoso);
	 
        return rana;
    }
    
}
