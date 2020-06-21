package com.java.package1.Alonso;

public class Elefante extends Mamifero implements Destruir{
	
	//Atributos
	private float largoTrompa;
	
	//Constructor
	public Elefante() {super();}
	
	public Elefante(String nombreComun, String nombreCientifico, String genero, int edad, int peso, String alimento,
	int periodoDeLactancia, boolean enCelo, float largoTrompa) {
		super(nombreComun, nombreCientifico, genero, edad, peso, alimento,periodoDeLactancia, enCelo); //Invocando al constructor del padre
	    this.largoTrompa = largoTrompa;
	}
	
		
		//Setters y getters
		public float getLargoTrompa() {
			return largoTrompa;
		}
		public void setLargoTrompa(float largoTrompa) {this.largoTrompa = largoTrompa;}
		
		//interfaz
		public void destroy(){ } 
		
		//del metodo abstracto
		public void socializar() {}

		 public String toString() {return super.toString()+ " / Longitud de la trompa: "+this.getLargoTrompa()+ "mts";}
}
