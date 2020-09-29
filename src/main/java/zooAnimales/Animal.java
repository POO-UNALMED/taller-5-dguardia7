package zooAnimales;

import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(String nombre, int edad, String habitat, String genero){
		totalAnimales++;
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
	}
	public Animal(){}

	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
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
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Zona getZona() {
		return this.zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public String movimiento() {
		return "desplazarse";
		
	}
	public void caballos() {
		System.out.println(Mamifero.caballos);
	}
	
	public static String totalPorTipo() {
		return "Mamiferos: "+ Mamifero.getListado().size()+"\n"
		+"Aves: "+Ave.getListado().size()+"\n"
		+"Reptiles: "+Reptil.getListado().size()+"\n"
		+"Peces: "+Pez.getListado().size()+"\n"
		+"Anfibios: "+Anfibio.getListado().size();
	}
	public String toString(){
		if (this.getZona() != null){
			return "Mi nombre es "+this.getNombre()+", tengo una edad de "+this.getEdad()+", habito en "+this.getHabitat()+
					" y mi genero es "+this.getGenero()+", la zona en la que me ubico es "+this.zona.getNombre()+", en el "
					+this.zona.getZoo().getNombre();
		}
		else {
			return "Mi nombre es "+ this.getNombre()+ ", tengo una edad de "+this.getEdad()
			+", habito en "+this.getHabitat()+" y mi genero es "+ this.getGenero();
		}
			
	}
}
