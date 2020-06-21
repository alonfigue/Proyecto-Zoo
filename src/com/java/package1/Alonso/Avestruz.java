package com.java.package1.Alonso;

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
}
