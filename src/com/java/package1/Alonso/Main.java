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
					Rana ei = new Rana();
					
					Rana ou =new Rana();
					ei = ou.inRana();
										
					anfibios2.add(ei);
					objetos2.add(ei);

					int i;
				    System.out.println("\n-Lista de animales del ZOO hasta el momento:");
				    for (i=0; i<objetos2.size() ; i++) {
				    	System.out.println("Animal #"+(i+1)+"->"+objetos2.get(i));
				    }
					break;
				    
				case 2:
					
					Salamandra salm = new Salamandra();
					
					Salamandra dra = new Salamandra();
					
					salm = dra.inSalamandra();
					
					objetos2.add(salm);
					anfibios2.add(salm);
											
					    int h;
					    System.out.println("\n-Lista de animales del ZOO hasta el momento:");
					    for (h=0; h<objetos2.size() ; h++) {
					    	System.out.println("Animal #"+(h+1)+"->"+objetos2.get(h));
					    	
					    }
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
				Flamenco gg = new Flamenco();
				
				Flamenco ff = new Flamenco();
				gg = ff.inFlamenco();
				
				aves2.add(gg);
				objetos2.add(gg);

				int i;
			    System.out.println("\n-Lista de animales del ZOO hasta el momento:");
			    for (i=0; i<objetos2.size() ; i++) {
			    	System.out.println("Animal #"+(i+1)+"->"+objetos2.get(i));
			    	
			    }
				break;
			case 2:
				Avestruz uz = new Avestruz();
				
				Avestruz tr = new Avestruz();
				uz = tr.inAvestruz();
	
				aves2.add(uz);
				objetos2.add(uz);

			    int a;
			    System.out.println("\n-Lista de animales del ZOO hasta el momento:");
			    for (a=0; a<objetos2.size() ; a++) {
			    	System.out.println("Animal #"+(a+1)+"->"+objetos2.get(a));
			    }
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
				Orangutan or = new Orangutan();
				
				Orangutan tan = new Orangutan();
				or = tan.inOrangutan();
				
				
				  objetos2.add(or);
				  mamiferos2.add(or);
				  
				    int i;
				    System.out.println("\n-Lista de animales del ZOO hasta el momento:");
				    for (i=0; i<objetos2.size() ; i++) {
				    	System.out.println("Animal #"+(i+1)+"->"+objetos2.get(i));
				    }
				break;
			case 2:
				Jaguar gu = new Jaguar();
				
				Jaguar jur = new Jaguar();
				gu = jur.inJaguar();
							
			    objetos2.add(gu);
			    mamiferos2.add(gu);
			    
			    int j;
			    System.out.println("\n-Lista de animales del ZOO hasta el momento:");
			    for (j=0; j<objetos2.size() ; j++) {
			    	System.out.println("Animal #"+(j+1)+"->"+objetos2.get(j));   	
			    }
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
					Serpiente nt = new Serpiente();
					
					Serpiente ent = new Serpiente();
					nt = ent.inSerpiente();
					
				    objetos2.add(nt);
				    reptiles2.add(nt);
				    
				    int i;
				    System.out.println("\n-Lista de animales del ZOO hasta el momento:");
				    for (i=0; i<objetos2.size() ; i++) {
				    	System.out.println("Animal #"+(i+1)+"->"+objetos2.get(i)+"\n");
				    }
					
					break;
				case 2:
					Cocodrilo cd = new Cocodrilo ();
					
					Cocodrilo rl = new Cocodrilo();
					
					cd =rl.inCocodrilo();
					
				    objetos2.add(cd);
				    reptiles2.add(cd);
				    
				    int c;
				    System.out.println("\n-Lista de animales del ZOO hasta el momento:");
				    for (c=0; c<objetos2.size() ; c++) {
				    	System.out.println("Animal #"+(c+1)+"->"+objetos2.get(c));				    	
				    }			
					break;
							
				default:
				System.out.println("\n->Seleccione una opcion valida.");
			}	
			break;
			
			default:
		    System.out.println("\n->Seleccione un numero del 1 al 4.");	
		}	
	}
    
}