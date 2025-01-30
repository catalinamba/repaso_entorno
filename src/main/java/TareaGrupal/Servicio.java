package TareaGrupal;
/*
 * (3 puntos) Crea una clase Servicio con el siguiente contenido:
Atributos minutos de duración, categoría de tipo entero e importe que puede contener
decimales.
Constantes TINTE con valor 0, CORTE con valor 1 y TRATAMIENTO con valor 2 que
identifican la categoría del servicio, estas constantes deben poder ser utilizadas por las hijas
e IMPORTE BASE con valor 15 que identifica el importe base de todos los servicios sobre
el que se calculará el importe final y que solo puede ser utilizada por esta clase. 
Métodos:
- Validar que valida que la categoría introducida esté entre 0 y 2 y de no ser así lance
IllegalArgumentException con un mensaje. También valida que el importe esté
entre 15 y 150 y de no ser así lanza Exception con mensaje. No necesita que le pasen
parámetros.
- cambiarDuracion que recibe como parámetro los nuevos minutos de duración y que
actualiza el atributo si los minutos están entre 30 y 120 y de no ser así lanza
Exception.
- DevolverNombreCategoria que devuelve el nombre de la categoría que se ha
pasado por parámetro como dato entero.
- Getter y setter
- ToString que va a mostrar los minutos de duración, nombre de la categoría e
importe del servicio.
- calcularCosteFinal que calcula el coste final del servicio según la siguiente fórmula:
Según categoría:
 Tinte --> importeBase * 1.15
 Corte --> importeBase * 1.35
 Tratamiento --> importeBase * 1.60
Según minutos de duración del servicio:
 De 30-60 + 15 euros
 De 61 a 90 +30 euros
 De 91 a 120 + 50 euros
 FORMULA ejemplo de un corte de 70 minutos de duración = (15 *1,35) + 30 euros.
Y un constructor que realiza las siguientes operaciones a partir de los minutos de duración
y la categoría.
- Guardar los minutos y categoría en su respectivo atributo
- Calcular y actualizar el importe del servicio
- Validar que la categoría y el importe son correctos, en caso de no serlo se indicará
como valor por defecto la categoría como TINTE y el importe a 50. 
 */
public class Servicio {
	
	//Declaracion de variables
	private int minutos;
	private int categoria;
	private double importe;
	
	//Constantes
	 public static final int TINTE = 0;
	 public static final int CORTE = 1;
	 public static final int TRATAMIENTO = 2;
	 private static final double IMPORTE_BASE = 15.0;
	 
	 //Constructor
	 public Servicio(int minutos, int categoria, double importe) {
		super();
		this.minutos = minutos;
		this.categoria = categoria;
		this.importe = importe;
	}


	//Metodo validar
	 public void validar() {
		 
		 //Validacion de la categoria 
		 if(categoria < 0  || categoria > 2) {
			 throw new IllegalArgumentException ("Error: Opcion no valida.La categoria deba estar entre cero y 2.");
		 }
		//Validacion del importe
		 if(importe < 15  || importe > 150) {
			 try {
			 throw new Exception ("ERROR: Opcion no valida.El importe debe estar entre 15 y 150.");
		 }catch (Exception e){
			  e.printStackTrace();
		 }
			 	 
		 }
		 
	 }
	 
	 //Metodo cambiar validacion
	 public void cambiarDuracion(int duracion) throws Exception {
		 if(minutos > 30 || minutos <120 ) {
			 minutos += duracion;
		 }else {
			 throw new Exception ("ERROR: Opcion no valida.Los minutos deben estar entre 30 y 120.");
		 }
	 }
	 
	 //Metodo devolver el nombre de la categoria
	 public int devolverNombreCategoria(int nombre) {
		 return nombre;
	 }
	 
	 //Getters y Setters
	public int getMinutos() {
		return minutos;
	}


	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}


	public int getCategoria() {
		return categoria;
	}


	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}


	public double getImporte() {
		return importe;
	}


	public void setImporte(double importe) {
		this.importe = importe;
	}


	public static int getTinte() {
		return TINTE;
	}


	public static int getCorte() {
		return CORTE;
	}


	public static int getTratamiento() {
		return TRATAMIENTO;
	}


	public static double getImporteBase() {
		return IMPORTE_BASE;
	}
	
	//El toString
	@Override
	public String toString() {
		return "Servicio [minutos=" + minutos + ", categoria=" + categoria + ", importe=" + importe + "]";
	}
	 
	
	 

}
