package gestion;
import zooAnimales.Animal;

import java.util.*;


public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList <Animal> animales = new ArrayList <Animal> ();

	public Zona(){
		
	}
	public Zona(String name, Zoologico zoo){
		this.setNombre(name);
		this.setZoo(zoo);
	}
	
	
	public void agregarAnimales(Animal a1) {
		animales.add(a1);
		a1.setZona(this);
	}
	public int cantidadAnimales() {
		return animales.size();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
		
	}
}
