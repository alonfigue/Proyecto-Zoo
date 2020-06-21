package com.java.package1.Alonso;

public class Serpiente extends Reptil implements Saltar{
	
	//Atributo
	private double longitud;
	private boolean venenosa;
	private String color;

	
	//Constructor
	public Serpiente() {super();}
	
	public Serpiente( String nombreComun, String nombreCientifico, String genero, int edad, int peso, int periodoDeIncubacion, 
	boolean patas, boolean escamas, double longitud, boolean venenosa, String color){
	    super(nombreComun, nombreCientifico, genero, edad, peso, periodoDeIncubacion, patas, escamas); //Invocando al constructor del padre
		this.longitud = longitud;
		this.venenosa = venenosa;
		this.color = color;	
	}
		
	//Setters y getters
	public double getLongitud() 
	{
	return longitud;
	}
	public void setLongitud(double longitud) {this.longitud = longitud;}
		
	public boolean getVenenosa() 
	{
	return venenosa;
	}
	public void setVenenosa(boolean venenosa) {this.venenosa = venenosa;}
	
	public String getColor() 
	{
	return color;
	}
	public void setColor(String color) {this.color = color;}
		
	//interfaz
	public void jump(){} 
				
		
     //del metodo abstracto
	public void arrastrarse() {}
		
	 public String toString() {return super.toString() +" / Longitud: "+this.getLongitud()+ "mts / Venenosa: " +this.getVenenosa()+
					                                     " / Color:" +this.getColor();
		 }
}
