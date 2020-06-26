package com.java.package1.Alonso;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		//-Introduccion de objetos y datos (animales que ya estan en el ZOO)
	    //Reptiles
	    Serpiente se = new Serpiente("Serpiente","Serpentes","Hembra",4,5,120,false,true,2,true,"marron");
	    Cocodrilo co = new Cocodrilo("Cocodrilo", "Crocodylidae", "Macho", 62, 950, 90, true,true, 1.80);
	     
	    //Aves
	    Avestruz az = new Avestruz();
		az.setNombreComun("Avestruz");
		az.setNombreCientifico("Struthio camelus");
		az.setGenero("Macho");
		az.setEdad(32);
		az.setPeso(112);
		az.setPeriodoDeIncubacion(40);
		az.setVuela(false);
	    az.setTamanoCuello(1.2);
		
		Flamenco fo = new Flamenco();
		fo.setNombreComun("Flamenco");
		fo.setNombreCientifico("Phoenicopterus");
		fo.setGenero("Hembra");
		fo.setEdad(16);
		fo.setPeso(4);
		fo.setPeriodoDeIncubacion(30);
		fo.setVuela(true);
	    fo.setNumPlumas(12);
			
		Lechuza la = new Lechuza();
		la.setNombreComun("Lechuza");
		la.setNombreCientifico("Tyto alba");
		la.setGenero("Hembra");
		la.setEdad(9);
		la.setPeso(0.8);  
		la.setPeriodoDeIncubacion(30); 
		la.setVuela(true);
	    la.setColor("Blanco");
		
		Halcon hn = new Halcon();
		hn.setNombreComun("Halcon");
		hn.setNombreCientifico("Falco");
		hn.setGenero("Macho");
		hn.setEdad(12);
		hn.setPeso(1.3);
		hn.setPeriodoDeIncubacion(30);
		hn.setVuela(true);
	    hn.setTamanoAla(0.1);
		
		Tucan tn = new Tucan();
		tn.setNombreComun("Tucan");
		tn.setNombreCientifico("Ramphastidae");
		tn.setGenero("Macho");
		tn.setEdad(7);
		tn.setPeso(1);
		tn.setPeriodoDeIncubacion(50);
		tn.setVuela(true);
		tn.setColorPico("Rojo");
				
		//Mamiferos
		Jaguar jr = new Jaguar();
		jr.setNombreComun("Jaguar");
		jr.setNombreCientifico("Panthera onca");
		jr.setGenero("Macho");
		jr.setEdad(10);
		jr.setPeso(87);
		jr.setAlimento("Carne");
		jr.setPeriodoDeLactancia(180);
		jr.setEnCelo(false);
		jr.setNumManchas(26);
		jr.setNumDientes(30);
		
		Orangutan on1 = new Orangutan();
		on1.setNombreComun("Orangutan");
		on1.setNombreCientifico("Pongo");
		on1.setGenero("Macho");
		on1.setEdad(26);
		on1.setPeso(82);
		on1.setAlimento("Vegetales, hojas e insectos");
		on1.setPeriodoDeLactancia(1800);
		on1.setEnCelo(true);
		on1.setIq(72);
		on1.setConPareja(true);
		 
		Orangutan on2 = new Orangutan();
		on2.setNombreComun("Orangutan");
		on2.setNombreCientifico("Pongo");
		on2.setGenero("Hembra");
		on2.setEdad(30);
		on2.setPeso(75);
		on2.setAlimento("Vegetales, hojas e insectos");
		on2.setPeriodoDeLactancia(1800);
		on2.setEnCelo(true);
		on2.setIq(65);
		on2.setConPareja(true);
		
		Jirafa ja = new Jirafa();
		ja.setNombreComun("Jirafa");
		ja.setNombreCientifico("Giraffa camelopardalis");
		ja.setGenero("Hembra");
		ja.setEdad(20);
		ja.setPeso(800);
		ja.setAlimento("Hojas");
		ja.setPeriodoDeLactancia(360);
		ja.setEnCelo(false);
		ja.setLargoDeCuello(2);
		ja.setNumManchas(36);
		
		Elefante ee = new Elefante();
		ee.setNombreComun("Elefante");
	    ee.setNombreCientifico("Elephantidae");
	    ee.setGenero("Macho");
		ee.setEdad(57);
		ee.setPeso(6000);
		ee.setAlimento("Frutas y plantas");
		ee.setPeriodoDeLactancia(660);
		ee.setEnCelo(false);
		ee.setLargoTrompa(2);
		
		Oso oo = new Oso();
		oo.setNombreComun("Oso");
	    oo.setNombreCientifico("Ursidae");
	    oo.setGenero("Hembra");
		oo.setEdad(12);
		oo.setPeso(500);
		oo.setAlimento("Frutas y peces");
		oo.setPeriodoDeLactancia(500);
		oo.setEnCelo(true);
		oo.setColor("Marron");
		oo.setEstatura(2.3);
		 
		//Anfibios
		Salamandra sa = new Salamandra();
		sa.setNombreComun("Salamandra");
		sa.setNombreCientifico("Urodela");
		sa.setGenero("Hembra");
		sa.setEdad(8);
		sa.setPeso(0.19);
		sa.setTipoDeAnfibio("Caudado");
		sa.setVenenosa(true);
		
		Rana ra = new Rana();
		ra.setNombreComun("Rana");
		ra.setNombreCientifico("Anura");
		ra.setGenero("Macho");
		ra.setEdad(7);
		ra.setPeso(0.22);
		ra.setTipoDeAnfibio("Anuro");
		ra.setColorDePiel("Verde manzana");
		ra.setVenenosa(true);
		
	    //Declaracion de arraylists, donde se almacenan los objetos en los arreglos. 
	    ArrayList <Object> objetos = new ArrayList<Object>();        //array de todos los animales
	    
	    ArrayList <Anfibio> anfibios = new ArrayList<Anfibio>();     //array de anfibios
	    ArrayList <Ave> aves = new ArrayList<Ave>();                 //array de aves
	    ArrayList <Mamifero> mamiferos = new ArrayList<Mamifero>();  //array de mamiferos
	    ArrayList <Reptil> reptiles = new ArrayList<Reptil>();       //array de reptiles 
	    
	    //almacenando...
    	objetos.add(oo); mamiferos.add(oo);  //oso
     	
		objetos.add(ra); anfibios.add(ra); //rana
		
		objetos.add(jr);  mamiferos.add(jr);  //jaguar
		
		objetos.add(tn); aves.add(tn);   //tucan
		
		objetos.add(co);  reptiles.add(co);  //cocodrilo
		
     	objetos.add(ee);  mamiferos.add(ee);  //elefante
		
		objetos.add(fo); aves.add(fo);   //flamenco
		
     	objetos.add(on2); mamiferos.add(on2); //orangutan 2
		
		objetos.add(la);  aves.add(la);  //lechuza
			
    	objetos.add(ja); mamiferos.add(ja);  //jirafa
     	
		objetos.add(az); aves.add(az);   ///avestruz
     		
		objetos.add(sa); anfibios.add(sa); //salamandra
		
	    objetos.add(se); reptiles.add(se);   //serpiente
		
		objetos.add(hn);  aves.add(hn);  //halcon
		
		objetos.add(on1);  mamiferos.add(on1); //orangutan 1

			int choice;
			Scanner eleccion = new Scanner(System.in);
			
		do {
		                    //Menu principal
		System.out.println("*BIENVENIDO/A A LA APP DEL ZOO*\n\n\t\t->ELIGE UNA OPCION DEL MENU:\n1. Ver la clasificacion de los animales del ZOO\n2. Agregar un animal nuevo al ZOO");
		System.out.print("\n->Opcion:");
		
		//Lectura de la "choice" introducida. input
		choice = eleccion.nextInt(); 
        
				switch(choice) {
				case 1:
					 //metodo lista
					listaElec(anfibios,objetos,aves,mamiferos,reptiles);
					break;
				case 2:
					//metodo agregar animal nuevo
					addAnimal(anfibios,objetos,aves,mamiferos,reptiles);
					break;
					
					default:			
				}	
		}while(choice<1 || choice>2);
			
		}
	
	//Metodo ver lista por clasificacion de animales (opcion 1 del menu principal)
	public static void listaElec(ArrayList<Anfibio> anfibios1,ArrayList<Object> objetos1,ArrayList<Ave> aves1,ArrayList<Mamifero> mamiferos1,ArrayList<Reptil> reptiles1) {
		
		System.out.println("\n\t\t->Elegir la categoria para ver lista de animales en el ZOO");
		System.out.println("1. Anfibios\n2. Aves\n3. Mamiferos\n4. Reptiles\n5. Todos los animales");
		System.out.print("\n->Opcion:");
		
		Scanner objetoNuevo = new Scanner(System.in);
		int pSelect = objetoNuevo.nextInt();
		
		switch (pSelect) {
		case 1: System.out.println("-Lista de Anfibios actualmente en el ZOO:");
			//Imprime Anfibios guardados en el arraylist (a i=0 se le suma 1 para que imprima comenzando en 1 (la lista) ).
			for(int i=0; i<anfibios1.size(); i++) {
				System.out.print("Animal #"+(i+1)+"->"+anfibios1.get(i)+".\n\n");
			} 

			break;
		
		case 2: System.out.println("-Lista de Aves actualmente en el ZOO:");
			//Imprime Aves guardados en el arraylist
			for(int i=0; i<aves1.size(); i++) {
				System.out.print("Ave #"+(i+1)+"->"+aves1.get(i)+".\n\n");
			}
			
			break;
			
		case 3:System.out.println("-Lista de Mamiferos actualmente en el ZOO:");
			//Imprime Mamiferos guardados en el arraylist.
			for(int i=0; i<mamiferos1.size(); i++) {
				System.out.print("Animal #"+(i+1)+"->"+mamiferos1.get(i)+".\n\n");
			}
			break;
			
		case 4: System.out.println("-Lista de Reptiles actualmente en el ZOO:");
			//Imprime Reptiles guardados en el arraylist.
			for(int i=0; i<reptiles1.size(); i++) {
				System.out.print("Animal "+(i+1)+" "+reptiles1.get(i)+".\n\n");
			}
			break;
			
		case 5:System.out.println("-Lista de todos los animales actualmente en el ZOO:");
			//Imprime todos los objetos guardados (los animales).
			for(int i=0; i<objetos1.size(); i++) {
				System.out.print("Animal #"+(i+1)+"->"+objetos1.get(i)+".\n\n");
			}
			break;
		default:	System.out.println("\n->Elegir un numero del 1 al 5");
	   }
	}
			
	//Metodo para agregar animal
    public static void addAnimal(ArrayList<Anfibio> anfibios2,ArrayList<Object> objetos2,ArrayList<Ave> aves2,ArrayList<Mamifero> mamiferos2,ArrayList<Reptil> reptiles2) {
	  
		System.out.println("\n\t\t->Elegir la categoria del animal a ingresar:");
		System.out.println("1. Anfibio\n2. Ave\n3. Mamifero\n4. Reptil");
		System.out.print("\n->Opcion escogida:");
		
		//Lectura de la variable introducida
		Scanner objetoNuevo = new Scanner(System.in);
		int agregar = objetoNuevo.nextInt();
		
		String anf[] = { "Rana", "Salamandra"}; 
		String ave[] = {"Flamenco", "Avestruz"}; 
		String mamif[] = { "Orangutan", "Jaguar" }; 
		String rep[] = { "Serpiente", "Cocodrilo" }; 
		
		switch(agregar) {
		case 1:
			//a i=0 se le suma 1 para que la lista comience en 1 y no en 0.
			System.out.println("\n\t\t->Elegir la especie a ingresar:");
			for (int i = 0; i < anf.length; i++) {
				System.out.println((i+1)+"."+anf[i]);
			}
			System.out.print("\n->Opcion:");
			
			Scanner adda = new Scanner(System.in);
			int eSelect = adda.nextInt();
			
			String objetoAnimal = anf[eSelect-1];
			System.out.println("Se agregara una " +objetoAnimal+ " nueva al ZOO");
		
			
			switch(eSelect) {
				case 1:
					inRana(anfibios2, objetos2);
					break;
				case 2:
					inSalamandra(anfibios2, objetos2);
					break;
							
				default:
				System.out.println("->Seleccione una opcion valida.");
			}
			break;
			
		case 2:
			System.out.println("\n\t\t->Elegir la especie a ingresar:");
			for (int i = 0; i < ave.length; i++) {
				System.out.println((i+1)+"."+ave[i]);
			}
			System.out.print("\n->Opcion:");
			
			Scanner addb = new Scanner(System.in);
			eSelect = addb.nextInt();
			
			objetoAnimal = ave[eSelect-1];
			System.out.println("Se agregara un " +objetoAnimal+ " nuevo al ZOO");
	 
			switch(eSelect) {
			case 1:
				inFlamenco(aves2, objetos2);
				break;
			case 2:
				inAvestruz(aves2, objetos2);
				break;
						
			default:
			System.out.println("\n->Seleccione una opcion valida.");
		}
			
			break;
			
		case 3:
			System.out.println("\n\t\t->Elegir la especie a ingresar:");
			for (int i = 0; i < mamif.length; i++) {
				System.out.println((i+1)+"."+mamif[i]);
			}
			System.out.print("\n->Opcion:");
			
			Scanner addc = new Scanner(System.in);
			eSelect = addc.nextInt();
			
			objetoAnimal = mamif[eSelect-1];
			System.out.println("Se agregara un " +objetoAnimal+ " nuevo al ZOO");
	 
			switch(eSelect) {
			case 1:
				inOrangutan(objetos2, mamiferos2);
				
				break;
			case 2:
				inJaguar(objetos2, mamiferos2);
							
				break;
						
			default:
			System.out.println("\n->Seleccione una opcion valida.");
		}
		break;
			
		case 4:
			System.out.println("\n\t\t->Elegir la especie a ingresar:");
			for (int i = 0; i < rep.length; i++) {
				System.out.println((i+1)+"."+rep[i]);
			}
			System.out.print("\n->Opcion:");
			
			Scanner addd = new Scanner(System.in);
			eSelect = addd.nextInt();
			
			objetoAnimal = rep[eSelect-1];
			System.out.println("Se agregara un " +objetoAnimal+ " nuevo al ZOO");
			
			switch(eSelect) {
				case 1:
					inSerpiente(objetos2, reptiles2);
					
					break;
				case 2:
					
					inCocodrilo(objetos2, reptiles2);
					
					break;
							
				default:
				System.out.println("\n->Seleccione una opcion valida.");
			
			}
			
			break;
			
			default:
		    System.out.println("\n->Seleccione un numero del 1 al 4.");	
		}	
	}
    
    //Ya elegido el animal a ingresar al ZOO, se procede a almacenar los datos del mismo
    //-Anfibios
    
    //Ingresar un objeto Rana
    public static Object inRana(ArrayList<Anfibio> anfibios3,ArrayList<Object> objetos3) {
    	System.out.println("\n\t\t->Llenar el siguiente registro del animal nuevo para el ZOO.");
	    Scanner objetoZoo = new Scanner(System.in);
	    
        //parametros Animal
	    System.out.print("\nNombre común del animal:");
 	    String nombreComun = objetoZoo.nextLine();         
		   
	    System.out.print("Nombre cientifico:");
        String nombreCientifico = objetoZoo.nextLine();
      
	    System.out.print("Genero del animal:");
	    String genero = objetoZoo.nextLine();    
		   
	    System.out.print("Edad del animal:");
	    int edad = objetoZoo.nextInt(); 
	   
	    System.out.print("Peso del animal (en Kg):");
	    int peso = objetoZoo.nextInt(); 
	    
        //parametros Anfibio
	    System.out.print("Tipo de anfibio:");
	    String tipoDeAnfibio = objetoZoo.next();
		
        //parametros rana
	    System.out.print("Color de Piel:");
	    String colorDePiel = objetoZoo.next();
	    
	    System.out.print("Venenoso (True o False):");
	    boolean venenoso = objetoZoo.nextBoolean();
	    
	    //crear e instanciar el objeto
	    Rana rana = new Rana();
	    rana.setNombreComun(nombreComun);
	    rana.setNombreCientifico(nombreCientifico);
	    rana.setGenero(genero);
	    rana.setEdad(edad);
	    rana.setPeso(peso);
	    rana.setTipoDeAnfibio(tipoDeAnfibio);
	    rana.setColorDePiel(colorDePiel);
	    rana.setVenenosa(venenoso);
	 
	    objetos3.add(rana);
	    anfibios3.add(rana);
	    int i;
	    System.out.println("\n-Lista de animales del ZOO hasta el momento:");
	    for (i=0; i<objetos3.size() ; i++) {
	    	System.out.println("Animal #"+(i+1)+"->"+objetos3.get(i));
	    	
	    }
        return rana;
    }
    
  //Ingresar un objeto Salamandra
    public static Object inSalamandra(ArrayList<Anfibio> anfibios3,ArrayList<Object> objetos3) {
    	System.out.println("\n\t\t->Llenar el siguiente registro del animal nuevo para el ZOO.");
	    Scanner objetoZoo = new Scanner(System.in);
	    
        //parametros Animal
	    System.out.print("\nNombre común del animal:");
 	    String nombreComun = objetoZoo.nextLine();          
		   
	    System.out.print("Nombre cientifico:");
        String nombreCientifico = objetoZoo.nextLine();
      
	    System.out.print("Genero del animal:");
	    String genero = objetoZoo.nextLine();    
		   
	    System.out.print("Edad del animal:");
	    int edad = objetoZoo.nextInt(); 
	   
	    System.out.print("Peso del animal (en Kg):");
	    int peso = objetoZoo.nextInt(); 
	    
        //parametros Anfibio
	    System.out.print("Tipo de anfibio:");
	    String tipoDeAnfibio = objetoZoo.next();
		
        //parametros salamandra
	    System.out.print("Venenoso (True o False):");
	    boolean venenoso = objetoZoo.nextBoolean();
	    
	    //crear e instanciar el objeto
	    Salamandra salamandra = new Salamandra();
	    salamandra.setNombreComun(nombreComun);
	    salamandra.setNombreCientifico(nombreCientifico);
	    salamandra.setGenero(genero);
	    salamandra.setEdad(edad);
	    salamandra.setPeso(peso);
	    salamandra.setTipoDeAnfibio(tipoDeAnfibio);
	    salamandra.setVenenosa(venenoso);
	 
	    objetos3.add(salamandra);
	    anfibios3.add(salamandra);
	    int i;
	    System.out.println("\n-Lista de animales del ZOO hasta el momento:");
	    for (i=0; i<objetos3.size() ; i++) {
	    	System.out.println("Animal #"+(i+1)+"->"+objetos3.get(i));
	    	
	    }
        return salamandra;
    }

    //-Aves
    //Ingresar un objeto flamenco
    public static Object inFlamenco(ArrayList<Ave> aves3,ArrayList<Object> objetos3) {
    	System.out.println("\n\t\t->Llenar el siguiente registro del animal nuevo para el ZOO.");
	    Scanner objetoZoo = new Scanner(System.in);
	    
        //parametros Animal
	    System.out.print("\nNombre común del animal:");
 	    String nombreComun = objetoZoo.nextLine();         
		   
	    System.out.print("Nombre cientifico:");
        String nombreCientifico = objetoZoo.nextLine();
      
	    System.out.print("Genero del animal:");
	    String genero = objetoZoo.nextLine();    
		   
	    System.out.print("Edad del animal:");
	    int edad = objetoZoo.nextInt(); 
	   
	    System.out.print("Peso del animal (en Kg):");
	    int peso = objetoZoo.nextInt(); 
	    
        //parametros aves
	    System.out.print("Periodo de incubacion (en dias):");
	    int periodoDeIncubacion = objetoZoo.nextInt();
	    
	    System.out.print("Vuela (true o false):");
	    Boolean vuela = objetoZoo.nextBoolean();
	    
        //parametros flamenco
	    System.out.print("Numero de plumas:");
	    int numPlumas = objetoZoo.nextInt();
	    
	    //crear e instanciar el objeto
	    Flamenco flam = new Flamenco();
	    flam.setNombreComun(nombreComun);
	    flam.setNombreCientifico(nombreCientifico);
	    flam.setGenero(genero);
	    flam.setEdad(edad);
	    flam.setPeso(peso);
	    flam.setPeriodoDeIncubacion(periodoDeIncubacion);
	    flam.setVuela(vuela);
	    flam.setNumPlumas(numPlumas);
	     
	    objetos3.add(flam);
	    aves3.add(flam);
	    int i;
	    System.out.println("\n-Lista de animales del ZOO hasta el momento:");
	    for (i=0; i<objetos3.size() ; i++) {
	    	System.out.println("Animal #"+(i+1)+"->"+objetos3.get(i));
	    	
	    }
        return flam;
    }
    
  //Ingresar un objeto Avestruz
    public static Object inAvestruz(ArrayList<Ave> aves3,ArrayList<Object> objetos3) {
    	System.out.println("\n\t\t->Llenar el siguiente registro del animal nuevo para el ZOO.");
	    Scanner objetoZoo = new Scanner(System.in);
	    
        //parametros Animal
	    System.out.print("\nNombre común del animal:");
 	    String nombreComun = objetoZoo.nextLine();       
		   
	    System.out.print("Nombre cientifico:");
        String nombreCientifico = objetoZoo.nextLine();
      
	    System.out.print("Genero del animal:");
	    String genero = objetoZoo.nextLine();    
		   
	    System.out.print("Edad del animal:");
	    int edad = objetoZoo.nextInt(); 
	   
	    System.out.print("Peso del animal (en Kg):");
	    int peso = objetoZoo.nextInt(); 
	    
        //parametros Ave
	    System.out.print("Periodo de incubacion (en dias):");
	    int periodoDeIncubacion = objetoZoo.nextInt();
	    
	    System.out.print("Vuela (true o false):");
	    Boolean vuela = objetoZoo.nextBoolean();
		
        //parametros salamandra
	    System.out.print("Tamanio del cuello:");
	    double tamanoCuello = objetoZoo.nextDouble();
	    
	    //crear e instanciar el objeto
	    Avestruz avest = new Avestruz();
	    avest.setNombreComun(nombreComun);
	    avest.setNombreCientifico(nombreCientifico);
	    avest.setGenero(genero);
	    avest.setEdad(edad);
	    avest.setPeso(peso);
	    avest.setPeriodoDeIncubacion(periodoDeIncubacion);
	    avest.setVuela(vuela);
	    avest.setTamanoCuello(tamanoCuello);
	 
	    objetos3.add(avest);
	    aves3.add(avest);
	    int i;
	    System.out.println("\n-Lista de animales del ZOO hasta el momento:");
	    for (i=0; i<objetos3.size() ; i++) {
	    	System.out.println("Animal #"+(i+1)+"->"+objetos3.get(i));
	    }
        return avest;
    }
    
    //-Mamiferos
    //Ingresar un objeto Orangutan
    public static Object inOrangutan(ArrayList<Object> objetos3,ArrayList<Mamifero> mamiferos3) {
    	System.out.println("\n\t\t->Llenar el siguiente registro del animal nuevo para el ZOO.");
	    Scanner objetoZoo = new Scanner(System.in);
	    
        //parametros Animal
	    System.out.print("\nNombre común del animal:");
 	    String nombreComun = objetoZoo.nextLine();          //input
		   
	    System.out.print("Nombre cientifico:");
        String nombreCientifico = objetoZoo.nextLine();
      
	    System.out.print("Genero del animal:");
	    String genero = objetoZoo.nextLine();    
		   
	    System.out.print("Edad del animal:");
	    int edad = objetoZoo.nextInt(); 
	   
	    System.out.print("Peso del animal (en Kg):");
	    int peso = objetoZoo.nextInt(); 
	    
        //parametros mamiferos    
	    System.out.print("Alimento del animal:");
	    String alimento = objetoZoo.next();
		
	    System.out.print("Periodo de lactancia (en dias):");
	    int periodoDeLactancia = objetoZoo.nextInt();
		
	    System.out.print("En celo (true o false):");
	    boolean enCelo = objetoZoo.nextBoolean();
	    
        //parametros orangutan
	    System.out.print("Coeficiente intelectual del orangutan:");
	    int iq = objetoZoo.nextInt();
	    
	    System.out.print("Con pareja (true o false):");
	    boolean conPareja = objetoZoo.nextBoolean();
	    
	    //crear e instanciar el objeto
	    Orangutan otan = new Orangutan();
	    otan.setNombreComun(nombreComun);
	    otan.setNombreCientifico(nombreCientifico);
	    otan.setGenero(genero);
	    otan.setEdad(edad);
	    otan.setPeso(peso);
	    otan.setAlimento(alimento);
	    otan.setPeriodoDeLactancia(periodoDeLactancia);
	    otan.setEnCelo(enCelo);
	    otan.setIq(iq);
	    otan.setConPareja(conPareja);
	    
	    objetos3.add(otan);
	    mamiferos3.add(otan);
	    int i;
	    System.out.println("\n-Lista de animales del ZOO hasta el momento:");
	    for (i=0; i<objetos3.size() ; i++) {
	    	System.out.println("Animal #"+(i+1)+"->"+objetos3.get(i));
	    	
	    }
	return otan;    
    }
    
    //Ingresar un objeto Jaguar
    public static Object inJaguar(ArrayList<Object> objetos3,ArrayList<Mamifero> mamiferos3) {
    	System.out.println("\n\t\t->Llenar el siguiente registro del animal nuevo para el ZOO.");
	    Scanner objetoZoo = new Scanner(System.in);
	    
        //parametros Animal
	    System.out.print("\nNombre común del animal:");
 	    String nombreComun = objetoZoo.nextLine();          
		   
	    System.out.print("Nombre cientifico:");
        String nombreCientifico = objetoZoo.nextLine();
      
	    System.out.print("Genero del animal:");
	    String genero = objetoZoo.nextLine();    
		   
	    System.out.print("Edad del animal:");
	    int edad = objetoZoo.nextInt(); 
	   
	    System.out.print("Peso del animal (en Kg):");
	    int peso = objetoZoo.nextInt(); 
	    
        //parametros mamiferos
	    System.out.print("Alimento del animal:");
	    String alimento = objetoZoo.next();
		
	    System.out.print("Periodo de lactancia (en dias):");
	    int periodoDeLactancia = objetoZoo.nextInt();
		
	    System.out.print("En celo (true o false):");
	    boolean enCelo = objetoZoo.nextBoolean();
	    
        //parametros Jaguar
	    System.out.print("Numero de manchas del jaguar:");
	    int numManchas = objetoZoo.nextInt();
	    
	    System.out.print("Cantidad de dientes que tiene el jaguar:");
	    int numDientes = objetoZoo.nextInt();
	    
	    //crear e instanciar el objeto
	    Jaguar guar = new Jaguar();
	    guar.setNombreComun(nombreComun);
	    guar.setNombreCientifico(nombreCientifico);
	    guar.setGenero(genero);
	    guar.setEdad(edad);
	    guar.setPeso(peso);
	    guar.setAlimento(alimento);
	    guar.setPeriodoDeLactancia(periodoDeLactancia);
	    guar.setEnCelo(enCelo);
	    guar.setNumManchas(numManchas);
	    guar.setNumDientes(numDientes);
	    
	    objetos3.add(guar);
	    mamiferos3.add(guar);
	    int i;
	    System.out.println("\n-Lista de animales del ZOO hasta el momento:");
	    for (i=0; i<objetos3.size() ; i++) {
	    	System.out.println("Animal #"+(i+1)+"->"+objetos3.get(i));
	    	
	    }
	return guar;    
    }
       
      //-Reptiles
      //Ingresar un objeto Cocodrilo
    public static Object inCocodrilo(ArrayList<Object> objetos3,ArrayList<Reptil> reptiles3) {
    	System.out.println("\n\t\t->Llenar el siguiente registro del animal nuevo para el ZOO.");
   	    Scanner objetoZoo = new Scanner(System.in);
   	    
        //parametros Animal
	    System.out.print("Nombre común del animal:");
 	    String nombreComun = objetoZoo.nextLine();          
		   
	    System.out.print("Nombre cientifico:");
        String nombreCientifico = objetoZoo.nextLine();
      
	    System.out.print("Genero del animal:");
	    String genero = objetoZoo.nextLine();    
		   
	    System.out.print("Edad del animal:");
	    int edad = objetoZoo.nextInt(); 
	   
	    System.out.print("Peso del animal (en Kg):");
	    int peso = objetoZoo.nextInt(); 
	    
        //parametros Reptil    
	    System.out.print("Periodo de incubacion (en dias):");
	    int periodoDeIncubacion = objetoZoo.nextInt();
		
	    System.out.print("Patas (true o false):");
	    boolean patas = objetoZoo.nextBoolean();
		
	    System.out.print("Escamas (true o false):");
	    boolean escamas = objetoZoo.nextBoolean();
	    
        //parametros cocodrilo
	    System.out.print("Largo de cola (en mts):");
	    double largoDeCola = objetoZoo.nextDouble();
	    
	    //crear e instanciar el objeto
	    Cocodrilo coco = new Cocodrilo();
	    coco.setNombreComun(nombreComun);
	    coco.setNombreCientifico(nombreCientifico);
	    coco.setGenero(genero);
	    coco.setEdad(edad);
	    coco.setPeso(peso);
	    coco.setPeriodoDeIncubacion(periodoDeIncubacion);
	    coco.setPatas(patas);
	    coco.setEscamas(escamas);
	    coco.setLargoDeCola(largoDeCola);
	    
	    objetos3.add(coco);
	    reptiles3.add(coco);
	    int i;
	    System.out.println("\n-Lista de animales del ZOO hasta el momento:");
	    for (i=0; i<objetos3.size() ; i++) {
	    	System.out.println("Animal #"+(i+1)+"->"+objetos3.get(i));
	    	
	    }
        return coco;
    }
 
    //Ingresar un objeto Serpiente
    public static Object inSerpiente(ArrayList<Object> objetos3,ArrayList<Reptil> reptiles3) {
    	System.out.println("\n\t\t->Llenar el siguiente registro del animal nuevo para el ZOO.");
   	    Scanner objetoZoo = new Scanner(System.in);
       
   	    //parametros Animal
	    System.out.print("Nombre común del animal:");
 	    String nombreComun = objetoZoo.nextLine();          //input
		   
	    System.out.print("Nombre cientifico:");
        String nombreCientifico = objetoZoo.nextLine();
      
	    System.out.print("Genero del animal:");
	    String genero = objetoZoo.nextLine();    
		   
	    System.out.print("Edad del animal:");
	    int edad = objetoZoo.nextInt(); 
	   
	    System.out.print("Peso del animal (en Kg):");
	    int peso = objetoZoo.nextInt(); 
	    
        //parametros Reptil
	    System.out.print("Periodo de incubacion (en dias):");
	    int periodoDeIncubacion = objetoZoo.nextInt();
		
	    System.out.print("Patas (true o false):");
	    boolean patas = objetoZoo.nextBoolean();
		
	    System.out.print("Escamas (true o false):");
	    boolean escamas = objetoZoo.nextBoolean();
	    
        //parametros serpiente
	    System.out.print("Longitud de la serpiente (en metros):");
	    double longitud = objetoZoo.nextDouble();
	    
	    System.out.print("Venenosa (true o false):");
	    boolean venenosa = objetoZoo.nextBoolean();
	    
	    System.out.print("Color de la serpiente:");
	    String color = objetoZoo.next();
	    
	    //crear e instanciar el objeto
	    Serpiente serpiente = new Serpiente();
	    serpiente.setNombreComun(nombreComun);
	    serpiente.setNombreCientifico(nombreCientifico);
	    serpiente.setGenero(genero);
	    serpiente.setEdad(edad);
	    serpiente.setPeso(peso);
	    serpiente.setPeriodoDeIncubacion(periodoDeIncubacion);
	    serpiente.setPatas(patas);
	    serpiente.setEscamas(escamas);
	    serpiente.setLongitud(longitud);
	    serpiente.setVenenosa(venenosa);
	    serpiente.setColor(color);
	    
	    objetos3.add(serpiente);
	    reptiles3.add(serpiente);
	    int i;
	    System.out.println("\n-Lista de animales del ZOO hasta el momento:");
	    for (i=0; i<objetos3.size() ; i++) {
	    	System.out.println("Animal #"+(i+1)+"->"+objetos3.get(i)+"\n");
	    }
	return serpiente;    
    }
}