package practica_entornos;
/*Clase Manager (hereda de Empleado) 
Atributos: proyectosACargo (protected). 
Métodos: constructores, y métodos get y set para gestionar los proyectos a cargo. 
 */
public class Manager extends Empleado {
	
	//Declaracion de variables
		protected int proyectosACargo;
		
		//Constructor
		public Manager(String nombre, int edad, String dni, int sueldo, int proyectosACargo) {
			super(nombre, edad, dni, sueldo);
			this.proyectosACargo = proyectosACargo;
		}
		
		//Metodos getters y setters
		public int getProyectosACargo() {
			return proyectosACargo;
		}

		public void setProyectosACargo(int proyectosACargo) {
			this.proyectosACargo = proyectosACargo;
		}
		
		

}
