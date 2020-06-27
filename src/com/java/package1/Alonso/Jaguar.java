package com.java.package1.Alonso;

import java.util.ArrayList;
import java.util.Scanner;

public class Jaguar extends Mamifero implements Saltar{
	
	//Atributos
	private int numManchas;
	private int numDientes;

    //Constructor
	public Jaguar() {super();}
	
	public Jaguar( String nombreComun, String nombreCientifico, String genero, int edad, int peso, String alimento,
	int periodoDeLactancia, boolean enCelo, int numManchas, int numDientes) {
	    super( nombreComun, nombreCientifico, genero, edad, peso, alimento,periodoDeLactancia, enCelo); //Invocando al constructor del padre
	    this.numManchas = numDientes;
		this.numDientes = numManchas;
		}
		
		//Setters y getters
		public int getNumManchas() 
		{
		return numManchas;
		}
		public void setNumManchas(int numManchas) {this.numManchas = numManchas;}
		
		public int getNumDientes()
		{
		return numDientes;
		}
		public void setNumDientes(int numDientes) {this.numDientes = numDientes;}
		
		//interfaz
		public void jump(){} 
		
		//del metodo abstracto
		public void socializar() {}

		 public String toString() {return super.toString() +" / Numero de manchas: "+this.getNumManchas()+ " / Numero de dientes:" + this.getNumDientes();}
		 
		 //Ingresar un objeto Jaguar
		    public Jaguar inJaguar() {
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
			    
		        //parametros Jaguar
			    System.out.print("Numero de manchas del jaguar:");
			    int numManchas = objetoZoo.nextInt();
			    
			    System.out.print("Cantidad de dientes que tiene el jaguar:");
			    int numDientes = objetoZoo.nextInt();
			    
			    //crear e instanciar el objeto
			    Jaguar guar = new Jaguar();
			    guar.setNombreComun(nombreComun);
			    guar.setNombreCientifico(nombreCientifico);
			    guar.setGenero(genero);
			    guar.setEdad(edad);
			    guar.setPeso(peso);
			    guar.setAlimento(alimento);
			    guar.setPeriodoDeLactancia(periodoDeLactancia);
			    guar.setEnCelo(enCelo);
			    guar.setNumManchas(numManchas);
			    guar.setNumDientes(numDientes);
			   
			return guar;    
		    }       
}

