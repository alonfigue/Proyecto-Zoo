package com.java.package1.Alonso;

public abstract class Anfibio extends Animal{
	
	//Atributo
	private String tipoDeAnfibio; //Existen tres tipos: Gymnophiona, Caudata (salamandras y tritones) y Anura (ranas y sapos).
	
	//Constructor
	public Anfibio() {super();}
	
	public Anfibio(String nombreComun, String nombreCientifico, String genero, int edad, int peso, String tipoDeAnfibio) {
		super(nombreComun, nombreCientifico, genero, edad, peso); //Invocando al constructor del padre
		this.tipoDeAnfibio = tipoDeAnfibio;
	}
	
	
	//Setter y getter
	public String getTipoDeAnfibio() 
	{
	return tipoDeAnfibio;
	}
	public void setTipoDeAnfibio(String tipoDeAnfibio) {this.tipoDeAnfibio = tipoDeAnfibio;}
	
	//metodo abstracto
    public abstract void nadar();
	
	//del metodo abstracto
	public void comportamiento() { System.out.println("Los anfibios son conocidos por cambiar su temperatura corporal, haciendolo a su favor");}
	
	public String toString() {return  super.toString()+ " / Tipo de Anfibio:" +this.getTipoDeAnfibio();}
}
