package com.java.package1.Alonso;

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
}

