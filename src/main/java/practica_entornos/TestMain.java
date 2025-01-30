package practica_entornos;
/*
 * Método main: Pasos a seguir 
En la clase Main, implementa el método main() con los siguientes pasos guiados: 
Crea una instancia de la clase Persona: 
Usa el constructor para inicializar los valores de nombre, edad y dni. 
Muestra el nombre y la edad utilizando los métodos get. 
Accede al dni usando su método get. 
Crea una instancia de la clase Empleado: 
Usa el constructor para inicializar los valores heredados de Persona y el atributo sueldo. 
Muestra los valores de nombre, edad, dni y sueldo mediante los métodos get. 
Cambia el sueldo utilizando el método set y vuelve a mostrar el valor actualizado. 
Crea una instancia de la clase Manager: 
Usa el constructor para inicializar los valores heredados de Empleado y el atributo proyectosACargo. 
Muestra los valores de nombre, edad, dni, sueldo y proyectos a cargo mediante los métodos get. 
Cambia los proyectos a cargo utilizando el método set y vuelve a mostrar el valor actualizado. 
 */
public class TestMain {

	public static void main(String[] args) {
		
		//Instancia de la clase persona
		Persona persona = new Persona("carla", 34, "12345678A");
		
		//Datos de la persona
		System.out.println("Datos de persona");
		//Mostramos el nombre
		System.out.println("\nNombre:" + persona.getNombre());
		//Mostramos la edad
		System.out.println("Edad:" + persona.edad);
		//Mostramos el dni
		System.out.println("Dni:" + persona.getDni());
		
		//Instancia de la clase empleado
		Empleado empleado = new Empleado ("bart", 25, "87654321B" , 5000);
		
		//Datos del empleado
		System.out.println("\nDatos del empleado");
		//Mostramos el nombre
		System.out.println("\nNombre:" + empleado.getNombre());
		//Mostramos la edad
		System.out.println("Edad:" + empleado.edad);
		//Mostramos el dni
		System.out.println("Dni:" + empleado.getDni());
		//Mostramos el sueldo
		System.out.println("Sueldo:" + empleado.getSueldo());
		
		//Cambio el valor del sueldo y muestro el valor actualizado
		empleado.setSueldo(4500);
		System.out.println("Sueldo:" + empleado.getSueldo());
		
		//Instancia de la clase Manager
		Manager manager = new Manager ("Sofia", 21, "56781234C", 6600, 3);
		
		//Datos del manager
		System.out.println("\nDatos del manager");
		//Mostramos el nombre del Manager
		System.out.println("\nNombre:" + manager.getNombre());
		//Mostramos la edad del manager
		System.out.println("Edad:" + manager.edad);
		//Mostramos el dni del Manager
		System.out.println("Dni:" + manager.getDni());
		//Mostramos los proyectos
		System.out.println("Proyectos a cargo:" + manager.proyectosACargo);
		
		//Cambio el valor del proyecto y muestro el valor actualizado
		manager.setProyectosACargo(8);
		System.out.println("Proyectos a cargo:" + manager.proyectosACargo);

	}

}
