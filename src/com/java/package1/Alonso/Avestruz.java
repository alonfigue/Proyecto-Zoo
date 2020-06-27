package com.java.package1.Alonso;

import java.util.Scanner;

public class Avestruz extends Ave{
	
	//Atributos
    private double tamanoCuello;
    
    //Constructor
	public Avestruz() {super();}
	
  	public Avestruz(String nombreComun, String nombreCientifico, String genero, int edad, int peso,
    int periodoDeIncubacion, boolean vuela, double tamanoCuello) {
  	   super (nombreComun, nombreCientifico, genero, edad, peso, periodoDeIncubacion, vuela); //Invocando al constructor del padre
  	   this.tamanoCuello = tamanoCuello;
  	}
  		
  		
  	//Setters y getters
  	public double getTamanoCuello() 
  	{
  	return tamanoCuello;
  	}
  	public void setTamanoCuello(double tamanoCuello) {this.tamanoCuello = tamanoCuello;}
  		
    //del metodo abstracto
    public void formaAgitarAlas() {}
  		
    public String toString() {return super.toString() +" / Longitud del cuello: "+this.getTamanoCuello()+ "mts";}
    
  //Ingresar un objeto Avestruz
    public Avestruz inAvestruz() {
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
	    
        //parametros Ave
	    System.out.print("Periodo de incubacion (en dias):");
	    int periodoDeIncubacion = objetoZoo.nextInt();
	    
	    System.out.print("Vuela (true o false):");
	    Boolean vuela = objetoZoo.nextBoolean();
		
        //parametros avestruz
	    System.out.print("Tamanio del cuello (en metros):");
	    double tamanoCuello = objetoZoo.nextDouble();
	    
	    //crear e instanciar el objeto
	    Avestruz avest = new Avestruz();
	    avest.setNombreComun(nombreComun);
	    avest.setNombreCientifico(nombreCientifico);
	    avest.setGenero(genero);
	    avest.setEdad(edad);
	    avest.setPeso(peso);
	    avest.setPeriodoDeIncubacion(periodoDeIncubacion);
	    avest.setVuela(vuela);
	    avest.setTamanoCuello(tamanoCuello);
	 
        return avest;
    }
    
}
