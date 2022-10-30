package com.generation;

//Se importan las paqueterias
import java.util.Scanner;
import java.util.*;

public class Codigo4 {
	
	//Se agrega el main
	public static void main(String[] args) {
    Scanner s = new Scanner();
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    Scanner s2 = new Scanner();
    String j2 = s.nextLine();
    
	    if (j1 == j2)) {
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	      
	        case "piedra":
	          if (j2 == "tijeras") {
	            g = 1;
	          }break //Se agrega el break para no pasar al siguiente case
	
	        case "papel":
	          if (j2 == "piedra") {
	            g = 1;
	          }break //Se agrega el break para no pasar al siguiente
	          
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }break;
	        default:
	      } System.out.println("Gana el jugador " + g);
	      }
	    }
	}
