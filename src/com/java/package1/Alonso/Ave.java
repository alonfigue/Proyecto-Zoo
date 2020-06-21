package com.java.package1.Alonso;

public abstract class Ave extends Animal{

	//Atributos
	private int periodoDeIncubacion;
	private boolean vuela;
	
	//Constructor
	public Ave() {super();}
	
	public Ave(String nombreComun, String nombreCientifico, String genero, int edad, int peso, int periodoDeIncubacion, boolean vuela) {
		super(nombreComun, nombreCientifico, genero, edad, peso); //Invocando al constructor del padre
		this.periodoDeIncubacion = periodoDeIncubacion;
		this.vuela = vuela;
	}
	
	//Setters y getters
	public int getPeriodoDeIncubacion() {
		return periodoDeIncubacion;
	}
	public void setPeriodoDeIncubacion(int periodoDeIncubacion) {this.periodoDeIncubacion = periodoDeIncubacion;}
		
	public boolean getVuela() {
		return vuela;
	}
	public void setVuela(boolean vuela) {this.vuela = vuela;}
	
	//metodo abstracto
   public abstract void formaAgitarAlas();
	
	//del metodo abstracto
	public void comportamiento() { System.out.println("Las aves suelen desprender sus plumas al moverse rapidamente");}
	
	public String toString() {
	return  super.toString()+ " / Periodo de Incubacion:" +this.getPeriodoDeIncubacion()+ "dias / Vuela:" +this.getVuela();
	}
}
