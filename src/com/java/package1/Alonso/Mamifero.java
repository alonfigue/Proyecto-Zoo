package com.java.package1.Alonso;

public abstract class Mamifero extends Animal {
	
    //Atributos
	private String alimento;
	private int periodoDeLactancia;
    private boolean enCelo;
	        
	//Constructor
    public Mamifero() {super();}
    
    public Mamifero( String nombreComun, String nombreCientifico, String genero, int edad, int peso, String alimento, 
	int periodoDeLactancia, boolean enCelo) {
		super(nombreComun, nombreCientifico, genero, edad, peso); //Invocando al constructor del padre
		this.alimento = alimento;
		this.periodoDeLactancia = periodoDeLactancia;
		this.enCelo = enCelo;
	}
					
	//Setters y getters
    public String getAlimento() 
    {
	return alimento;
	}
	public void setAlimento(String alimento) {this.alimento = alimento;}
					
	public int getPeriodoDeLactancia() 
	{
	return periodoDeLactancia;
	}
	public void setPeriodoDeLactancia(int periodoDeLactancia) {this.periodoDeLactancia = periodoDeLactancia;}
			
	public boolean getEnCelo() 
	{
	return enCelo;
	}
	public void setEnCelo(boolean enCelo) {this.enCelo = enCelo;}
			
	//metodo abstracto
    public abstract void socializar();
			
	//del metodo abstracto
	public void comportamiento() { System.out.println("Normalmente los mamiferos hacen manadas");}
			
	//Imprimir en pantalla
	public String toString() {
	return  super.toString()+ " / Alimento:" +this.getAlimento()+ " / Periodo de Lactancia:" +this.getPeriodoDeLactancia()+"dias / En celo:" +this.getEnCelo();
	}
}


	
