package com.java.package1.Alonso;

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
 }
