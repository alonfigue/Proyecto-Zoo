package com.java.package1.Alonso;

import java.util.ArrayList;
import java.util.Scanner;

public class Serpiente extends Reptil implements Saltar{
	
	//Atributo
	private double longitud;
	private boolean venenosa;
	private String color;

	
	//Constructor
	public Serpiente() {super();}
	
	public Serpiente( String nombreComun, String nombreCientifico, String genero, int edad, int peso, int periodoDeIncubacion, 
	boolean patas, boolean escamas, double longitud, boolean venenosa, String color){
	    super(nombreComun, nombreCientifico, genero, edad, peso, periodoDeIncubacion, patas, escamas); //Invocando al constructor del padre
		this.longitud = longitud;
		this.venenosa = venenosa;
		this.color = color;	
	}
		
	//Setters y getters
	public double getLongitud() 
	{
	return longitud;
	}
	public void setLongitud(double longitud) {this.longitud = longitud;}
		
	public boolean getVenenosa() 
	{
	return venenosa;
	}
	public void setVenenosa(boolean venenosa) {this.venenosa = venenosa;}
	
	public String getColor() 
	{
	return color;
	}
	public void setColor(String color) {this.color = color;}
		
	//interfaz
	public void jump(){} 
				
		
     //del metodo abstracto
	public void arrastrarse() {}
		
	 public String toString() {return super.toString() +" / Longitud: "+this.getLongitud()+ "mts / Venenosa: " +this.getVenenosa()+
					                                     " / Color:" +this.getColor();
		 }

	  //Ingresar un objeto Serpiente
	    public Serpiente inSerpiente() {
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
		    
	        //parametros serpiente
		    System.out.print("Longitud de la serpiente (en metros):");
		    double longitud = objetoZoo.nextDouble();
		    
		    System.out.print("Venenosa (true o false):");
		    boolean venenosa = objetoZoo.nextBoolean();
		    
		    System.out.print("Color de la serpiente:");
		    String color = objetoZoo.next();
		    
		    //crear e instanciar el objeto
		    Serpiente serpiente = new Serpiente();
		    serpiente.setNombreComun(nombreComun);
		    serpiente.setNombreCientifico(nombreCientifico);
		    serpiente.setGenero(genero);
		    serpiente.setEdad(edad);
		    serpiente.setPeso(peso);
		    serpiente.setPeriodoDeIncubacion(periodoDeIncubacion);
		    serpiente.setPatas(patas);
		    serpiente.setEscamas(escamas);
		    serpiente.setLongitud(longitud);
		    serpiente.setVenenosa(venenosa);
		    serpiente.setColor(color);
		   
		return serpiente;    
	    }
}
