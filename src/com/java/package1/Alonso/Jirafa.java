package com.java.package1.Alonso;

public class Jirafa extends Mamifero{
	
	//Atributos
	
	private float largoDeCuello;
	private int numManchas;
	
	//Constructor
	public Jirafa() {super();}
	
	public Jirafa( String nombreComun, String nombreCientifico, String genero, int edad, int peso, String alimento,
	int periodoDeLactancia, boolean enCelo, float largoDeCuello, int numManchas) {
		  super( nombreComun, nombreCientifico, genero, edad, peso, alimento, periodoDeLactancia, enCelo); //Invocando al constructor del padre
		  this.largoDeCuello = largoDeCuello;
		  this.numManchas = numManchas;
	}
		
	//Setters y getters
	public float getLargoDeCuello() 
	{
	return largoDeCuello;
	}
	public void setLargoDeCuello(float largoDeCuello) {this.largoDeCuello = largoDeCuello;}
		
	public int getNumManchas()
	{
	return numManchas;
	}
	public void setNumManchas(int numManchas) {this.numManchas = numManchas;}
		
		//del metodo abstracto
	    public void socializar() {}

		public String toString() {
			 return super.toString() +" / Longitud del cuello: "+this.getLargoDeCuello()+ " / Numero de manchas:" +this.getNumManchas();}
}