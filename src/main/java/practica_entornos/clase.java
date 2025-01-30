package practica_entornos;

import java.util.Scanner;

public class clase {

	public static void main(String[] args) {
		Scanner consola = new Scanner (System.in);
		
		System.out.println("ingresa un numero");
		int num1=consola.nextInt();
				
		System.out.println("ingresa otro numero");
		int num2=consola.nextInt();
				
		try {
			
		int resultado = num1 + num2;
			System.out.println("El resultado de la suma es:"+resultado);
		}catch(Exception e) {
			System.out.println("Error:opcion no valida");
		}finally {
			consola.close();
		}
		

	}

}
