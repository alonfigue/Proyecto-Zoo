package com.java.package1.Alonso;

public abstract class Reptil extends Animal{
	
	//Atributos
	private int periodoDeIncubacion;
	private boolean patas;
	private  boolean escamas; 
	 
	//Constructor
	public Reptil() {super();}
	
	public Reptil( String nombreComun, String nombreCientifico, String genero, int edad, int peso, int periodoDeIncubacion, boolean patas, boolean escamas) {
		super(nombreComun, nombreCientifico, genero, edad, peso); //Invocando al constructor del padre
		this.periodoDeIncubacion = periodoDeIncubacion;
		this.patas = patas;
		this.escamas = escamas;
	}
	
	//Setters y getters
	public int getPeriodoDeIncubacion() 
	{
	return periodoDeIncubacion;
	}
	public void setPeriodoDeIncubacion(int periodoDeIncubacion) {this.periodoDeIncubacion = periodoDeIncubacion;}
	
	public boolean getPatas() 
	{
	return patas;
	}
	public void setPatas(boolean patas) {this.patas = patas;}
	
	public boolean getEscamas() 
	{
	return escamas;
	}
	public void setEscamas(boolean escamas) {this.escamas = escamas;}
	
	//metodo abstracto
    public abstract void arrastrarse();
  
	//del metodo abstracto
	public void comportamiento() {System.out.println("Los reptiles no son sociables");}

	public String toString() {
	return  super.toString()+ " / Periodo de Incubacion:" +this.getPeriodoDeIncubacion()+ "dias / Patas:" +this.getPatas()+"/  Escamas:" +this.getEscamas();
	}
}
