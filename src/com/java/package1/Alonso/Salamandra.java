package com.java.package1.Alonso;

public class Salamandra extends Anfibio{
	
	//Atributo
	private boolean venenosa;
	
	//Constructor
	public Salamandra() {super();}
	
	public Salamandra(String nombreComun, String nombreCientifico, String genero, int edad, int peso, String tipoDeAnfibio, boolean venenosa) {
	super(nombreComun, nombreCientifico, genero, edad, peso, tipoDeAnfibio); //Invocando al constructor del padre
	     this.venenosa = venenosa;
	}
		
	//Setter y getter
	public boolean getVenenosa() 
	{
	return venenosa;
	}
	public void setVenenosa(boolean venenosa) {this.venenosa = venenosa;}
		
	//del metodo abstracto
	public void nadar() {}
		
	public String toString() {return  super.toString()+ " / Venenosa:" +this.getVenenosa();}	 
}
