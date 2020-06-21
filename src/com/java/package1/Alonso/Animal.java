package com.java.package1.Alonso;

public abstract class Animal {

	//Atributos de Animal
	private String nombreComun;
	private String nombreCientifico;
	private String genero;
	private int edad;
	private double peso;
	
	//Constructor
	public Animal() {}
	
	public Animal(String nombreComun, String nombreCientifico, String genero, int edad, double peso)
	 {
		this.nombreComun = nombreComun;
		this.nombreCientifico = nombreCientifico;
		this.genero = genero;
		this.edad = edad;
		this.peso = peso;	
	 }
	
	
	//metodos getters y setters
	 public String getNombreComun()
	 {
	 return nombreComun;
	 }
	 public void setNombreComun(String nombreComun){ this.nombreComun = nombreComun;}
	 
	 public String getNombreCientifico()
	 {
	 return nombreCientifico;
	 } 
	 public void setNombreCientifico(String nombreCientifico){this.nombreCientifico = nombreCientifico;}
	 
	 public String getGenero()
	 {
	 return genero;
	 } 
	 public void setGenero(String genero) { this.genero = genero; }
	 
     public int getEdad()
	 { 
     return edad;
     }
     public void setEdad(int edad){this.edad = edad;}
 	  
     public double getPeso()
     {
     return peso;
     }
	 public void setPeso(double peso){this.peso = peso;}
		
	//metodo abstracto
    public abstract void comportamiento();
	
    //Imprimir en pantalla
    public String toString() {
	 return "Nombre:" +nombreComun+ " / Nombre cientifico:"+nombreCientifico+ " / Genero:" +genero+ 
		 " / Edad:" +edad+ "anios / Peso:" +peso+ "Kg"; }
}