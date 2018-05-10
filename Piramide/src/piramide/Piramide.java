/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramide;

/**
 *
 * @author madrid
 */
public class Piramide {
	
	/*
	 * Recibe un numero y letra
	 * y crea una piramide
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base=7;
		
		//Calcular el nº de filas
		
		int filas=(base+1)/2;
		
		/*
		 * Para calcular cada fila desde 0 hastla filas-1
		 * 
		 * 1. Calcular los blancos+ imprimirlos 
		 * 2. Calcular los astericos + imprimirlos
		 * 
		 */
		
		 for (int i=0;i<filas-1;i++){
			 
			 //i es el numero de fila
			 /*
			  * Hacemos una tabla con i y el nº de blancos 
			  * correspondientes a cada i.
			  * Vemos que la suma es constante, asi que 
			  * podemos formular
			  * 
			  * i+blancos=filas-1
			  * 
			  * asi que blancos=filas-1-i;
			  * 
			  */
			 
			 //Calcular e imprimir blancos
			 for(int j=filas-1-i; j>0;j--){
				 System.out.print(' ');
			 }
			 System.out.print("*");
			 //Calcular e imprimir asteriscos
			 	for(int j=0; j<2*i-1; j++){
			 		System.out.print(' ');
			 	}
			 	if(i!=0)System.out.print("*");
			 	
			 //imprimir saltos de linea
			 System.out.print('\n');
		 }//for con i
			 for(int j=0;j<base;j++)
				 System.out.print("*");
		
		//Añadido Fer
			 
			 
			 
			 
			 
		 
		
		
		
		
	}

}

