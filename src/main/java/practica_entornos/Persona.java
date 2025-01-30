package practica_entornos;
/*
 * Crea un programa en Java que gestione datos de personas en una empresa, usando herencia y modificadores de visibilidad. Implementa las siguientes clases: 
Clase Persona 
Atributos: nombre (protected), edad (protected) y dni (private). 
Métodos: constructores, y métodos get y set para acceder y modificar los atributos. 
 */
public class Persona {
	
	//Declaracion de variables
		protected String nombre;
		protected int edad;
		private String dni;
		
		//Constructor
		public Persona(String nombre, int edad, String dni) {
			super();
			this.nombre = nombre;
			this.edad = edad;
			this.dni =dni;
		}
		
		//Metodos getters y setters
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}
		

		
	}




