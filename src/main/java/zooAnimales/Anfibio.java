package zooAnimales;

import java.util.*;

public class Anfibio extends Animal{

	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	
	public Anfibio(){
		super();
		listado.add(this);

	}
	public Anfibio(String nombre, int edad,String habitat,String genero, String color, boolean veneno){
		super(nombre, edad, habitat, genero);
		this.setColorPiel(color);
		this.setVenenoso(veneno);
		listado.add(this);
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public static ArrayList<Anfibio> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}
	
	
	public int cantidadAnfibios() {
		return listado.size();
	}
	public String movimiento() {
		return "saltar";
	}
	public static Animal crearRana(String nombre, int edad,String genero) {
		Anfibio a = new Anfibio(nombre, edad, "selva",genero, "rojo" ,true);
		ranas++;
		return a;

	}
	public static Animal crearSalamandra(String nombre, int edad,String genero) {
		Anfibio a = new Anfibio(nombre, edad, "selva",genero, "negro y amarillo" ,false);
		salamandras++;
		return a;

	}
}
