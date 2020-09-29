package zooAnimales;

import java.util.*;

public class Pez extends Animal {

	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	private static ArrayList<Pez> listado = new ArrayList<Pez>();

	public Pez(){
		super();
		listado.add(this);
	}
	public Pez(String nombre, int edad,String habitat,String genero, String colorEscamas, int cantidadAletas){
		super(nombre, edad, habitat, genero);
		this.setColorEscamas(colorEscamas);
		this.setCantidadAletas(cantidadAletas);
		listado.add(this);
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	public static ArrayList<Pez> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}
	
	
	public int cantidadPeces() {
		return listado.size();
	}
	public String movimiento() {
		return "nadar";
	}
	public static Animal crearSalmon(String nombre, int edad,String genero) {
		Pez a = new Pez(nombre, edad, "oceano",genero, "rojo" ,6);
		salmones++;
		return a;
	}
	public static Animal crearBacalao(String nombre, int edad,String genero) {
		Pez a = new Pez(nombre, edad, "oceano",genero, "gris" ,6);
		bacalaos++;
		return a;
	}
}


