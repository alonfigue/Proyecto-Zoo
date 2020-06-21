package com.java.package1.Alonso;

public class Oso extends Mamifero implements Destruir{
	
	//Atributos 
	
	private String color;
	private double estatura;
	 
    //Constructor
    public Oso() {super();}
	
    public Oso(String nombreComun, String nombreCientifico, String genero, int edad, int peso, String alimento, 
	int periodoDeLactancia, boolean enCelo, String color, double estatura) {
	     super(nombreComun, nombreCientifico, genero, edad, peso, alimento, periodoDeLactancia, enCelo); //Invocando al constructor del padre
	     this.color = color;
		 this.estatura = estatura;	
	}
  
    //Setters y getters
    public String getColor() 
    {
	return color;
	}
	public void setColor(String color) {this.color = color;}
		
	public double getEstatura() 
	{
	return estatura;
	}
	public void setEstatura(double estatura) {this.estatura = estatura;}

		//interfaz
		public void destroy(){} 
				
		//del metodo abstracto
		public void socializar() {}
		
		public String toString() {return super.toString() +" / Celor del pelaje: "+this.getColor()+ " / Estatura:" +this.getEstatura()+ "mts";}
}
