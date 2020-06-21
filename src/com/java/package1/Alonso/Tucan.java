package com.java.package1.Alonso;

public class Tucan extends Ave implements Volar{
	
	//Atributos
    private String colorPico;
		    
    //Constructor
	 public Tucan() {super();}
    
    public Tucan(String nombreComun, String nombreCientifico, String genero, int edad, int peso,
    int periodoDeIncubacion, boolean vuela, String colorPico) {
       super(nombreComun, nombreCientifico, genero, edad, peso, periodoDeIncubacion, vuela); //Invocando al constructor del padre
	   this.colorPico = colorPico;	
	}
		  		
     //Setters y getters
	 public String getColorPico()
	 {
   	 return colorPico;
     }
	 public void setColorPico(String colorPico) {this.colorPico = colorPico;}
		  		
	//interfaz
	public void fly(){ } 
		  		
	//del metodo abstracto
	public void formaAgitarAlas() {}
		  
	public String toString() {return super.toString() +" / Color de pico: "+this.getColorPico();}
}
