package com.java.package1.Alonso;

public class Lechuza extends Ave implements Volar{
	   
    //Atributos
	private String color;
	
    //Constructor
	public Lechuza() {super();}
	
	public Lechuza( String nombreComun, String nombreCientifico, String genero, int edad, int peso,
	int periodoDeIncubacion, boolean vuela, String color) {
	  super(nombreComun, nombreCientifico, genero, edad, peso, periodoDeIncubacion, vuela); //Invocando al constructor del padre
	  this.color = color;
	 }
	  	

	//Setters y getters
	public String getColor() 
	{
	return color;
	}
	public void setColor(String color) {this.color = color;}
	  		
	//interfaz
    public void fly(){} 
	  		
	//del metodo abstracto
	public void formaAgitarAlas() {}
	  		
	public String toString() {return super.toString() +" / Color de plumaje: "+this.getColor();}
}
