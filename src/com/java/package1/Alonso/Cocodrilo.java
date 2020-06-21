package com.java.package1.Alonso;

public class Cocodrilo extends Reptil implements Destruir{
	
	//Atributos
	private double largoDeCola;
	
	//Constructor
	public Cocodrilo() {super();}
	
	public Cocodrilo( String nombreComun, String nombreCientifico, String genero, int edad, int peso, int periodoDeIncubacion, boolean patas,
	boolean escamas, double largoDeCola){
		super(nombreComun, nombreCientifico, genero, edad, peso, periodoDeIncubacion, patas, escamas); //Invocando al constructor del padre
		this.largoDeCola = largoDeCola;
	}
	
			
	//Setters y getters
	public double getLargoDeCola() 
	{
    return largoDeCola;
	}
	public void setLargoDeCola(double largoDeCola) {this.largoDeCola = largoDeCola;}
		
	//interfaz
	public void destroy(){} 
			
	//del metodo abstracto
	public void arrastrarse() {}
	
	public String toString() {return super.toString() +" / Longitud de la cola: "+this.getLargoDeCola()+ "mts";}
}

