package com.java.package1.Alonso;

public class Orangutan extends Mamifero implements Saltar{
	
	//Atributos
	private int iq;
	private boolean conPareja;
	
	//Constructor
    public Orangutan() {super();}
	
	public Orangutan(String nombreComun, String nombreCientifico, String genero, int edad, int peso, String alimento, 
	int periodoDeLactancia, boolean enCelo, int iq, boolean conPareja) {
		 super(nombreComun, nombreCientifico, genero, edad, peso, alimento, periodoDeLactancia, enCelo); //Invocando al constructor del padre
		 this.conPareja = conPareja;
		 this.iq = iq;
	}
		
	//Setters y getters
	public int getIq() 
	{
	return iq;
	}
	public void setIq(int iq) {this.iq = iq;}
		
    public boolean getConPareja() 
    {
	return conPareja;
	}
	public void setConPareja(boolean conPareja) {this.conPareja = conPareja;}
	
	//interfaz
	public void jump(){} 
		
	//del metodo abstracto
	public void socializar() {}

	public String toString() {return super.toString() +" / Coeficiente intelectual "+this.getIq()+ " / Con Pareja:" +this.getConPareja();}
}
