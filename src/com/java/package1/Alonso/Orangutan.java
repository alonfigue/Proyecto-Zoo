package com.java.package1.Alonso;

import java.util.ArrayList;
import java.util.Scanner;

public class Orangutan extends Mamifero implements Saltar{
	
	//Atributos
	private int iq;
	private boolean conPareja;
	
	//Constructor
    public Orangutan() {super();}
	
	public Orangutan(String nombreComun, String nombreCientifico, String genero, int edad, int peso, String alimento, 
	int periodoDeLactancia, boolean enCelo, int iq, boolean conPareja) {
		 super(nombreComun, nombreCientifico, genero, edad, peso, alimento, periodoDeLactancia, enCelo); //Invocando al constructor del padre
		 this.conPareja = conPareja;
		 this.iq = iq;
	}
		
	//Setters y getters
	public int getIq() 
	{
	return iq;
	}
	public void setIq(int iq) {this.iq = iq;}
		
    public boolean getConPareja() 
    {
	return conPareja;
	}
	public void setConPareja(boolean conPareja) {this.conPareja = conPareja;}
	
	//interfaz
	public void jump(){} 
		
	//del metodo abstracto
	public void socializar() {}

	public String toString() {return super.toString() +" / Coeficiente intelectual "+this.getIq()+ " / Con Pareja:" +this.getConPareja();}
	
	   //Ingresar un objeto Orangutan
    public Orangutan inOrangutan() {
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
	    
        //parametros mamiferos    
	    System.out.print("Alimento del animal:");
	    String alimento = objetoZoo.next();
		
	    System.out.print("Periodo de lactancia (en dias):");
	    int periodoDeLactancia = objetoZoo.nextInt();
		
	    System.out.print("En celo (true o false):");
	    boolean enCelo = objetoZoo.nextBoolean();
	    
        //parametros orangutan
	    System.out.print("Coeficiente intelectual del orangutan:");
	    int iq = objetoZoo.nextInt();
	    
	    System.out.print("Con pareja (true o false):");
	    boolean conPareja = objetoZoo.nextBoolean();
	    
	    //crear e instanciar el objeto
	    Orangutan otan = new Orangutan();
	    otan.setNombreComun(nombreComun);
	    otan.setNombreCientifico(nombreCientifico);
	    otan.setGenero(genero);
	    otan.setEdad(edad);
	    otan.setPeso(peso);
	    otan.setAlimento(alimento);
	    otan.setPeriodoDeLactancia(periodoDeLactancia);
	    otan.setEnCelo(enCelo);
	    otan.setIq(iq);
	    otan.setConPareja(conPareja);
	    	
	    
	return otan;    
    }
}
