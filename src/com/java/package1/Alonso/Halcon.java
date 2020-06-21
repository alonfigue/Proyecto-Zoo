package com.java.package1.Alonso;

public class Halcon extends Ave implements Volar{
	
	//Atributos
	private double tamanoAla;
    
    //Constructor
	 public Halcon() {super();}
	
	public Halcon( String nombreComun, String nombreCientifico, String genero, int edad, int peso, float tamañoAla,
    int periodoDeIncubacion, boolean vuela) {
  	  super(nombreComun, nombreCientifico, genero, edad, peso, periodoDeIncubacion, vuela); //Invocando al constructor del padre
  	  this.tamanoAla = tamañoAla;
    }
  		
  		
  	//Setters y getters
  	public double getTamanoAla() 
  	{
  	return tamanoAla;
  	}
  	public void setTamanoAla(double tamanoAla) {this.tamanoAla = tamanoAla;}
  		
  	//interfaz
	public void fly(){} 
  		
    //del metodo abstracto
    public void formaAgitarAlas() {}
  		
  	public String toString() {return super.toString() +" / Tamanio de alas: "+this.getTamanoAla()+ "mts";}
}
