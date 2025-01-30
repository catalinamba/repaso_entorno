package practica_entornos;
/*
 * Clase Empleado (hereda de Persona) 
Atributos: sueldo (private). 
Métodos: constructores, y métodos get y set para gestionar el sueldo. 
 */
public class Empleado extends Persona {
	
	//Declaracion de variables
		private int sueldo;
		
		//Constructor
		public Empleado(String nombre, int edad, String dni, int sueldo) {
			super(nombre, edad, dni);
			this.sueldo = sueldo;
		}
		
		//Metodos getters y setters
		public int getSueldo() {
			return sueldo;
		}

		public void setSueldo(int sueldo) {
			this.sueldo = sueldo;
		}
	
	

}
