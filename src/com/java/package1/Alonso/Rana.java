package com.java.package1.Alonso;

public class Rana extends Anfibio implements Saltar{
	
	//Atributos
	private String colorDePiel;
    private boolean venenosa;
    
    //Constructor
    public Rana() {super();}
    
  	public Rana( String nombreComun, String nombreCientifico, String genero, int edad, int peso, String tipoDeAnfibio, String colorDePiel ,boolean venenosa) {
    super( nombreComun, nombreCientifico, genero, edad, peso, tipoDeAnfibio); //Invocando al constructor del padre
  		this.colorDePiel = colorDePiel;
  		this.venenosa = venenosa;
  	}
  		
  	
  	//Setters y getters
    public String getColorDePiel() 
    {
  	return colorDePiel;
  	}
  	public void setColorDePiel(String colorDePiel) {this.colorDePiel = colorDePiel;}
  		
    public boolean getVenenosa() 
    {
  	return venenosa;
  	}
  	public void setVenenosa(boolean venenosa) {this.venenosa = venenosa;}
  
  	//interfaz
  	public void jump(){} 
  		
  	//del metodo abstracto
  	public void nadar() {}
  		
  	public String toString() {return  super.toString()+ " / Color:" +this.getColorDePiel()+ " / Venenosa:" +this.getVenenosa();}
}
