package zooAnimales;

import java.util.*;

public class Mamifero extends Animal{

	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	private static ArrayList <Mamifero> listado = new ArrayList <Mamifero>();

	public Mamifero(){
		super();
		listado.add(this);
	}
	public Mamifero(String nombre, int edad,String habitat,String genero, boolean pelaje,int patas){
		super(nombre, edad, habitat, genero);
		this.setPelaje(pelaje);
		this.setPatas(patas);
		
		listado.add(this);		
	}
	
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public static ArrayList<Mamifero> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}
	
	public int cantidadMamiferos() {
		return listado.size();
	}
	
	public static Animal crearCaballo(String nombre, int edad,String genero) {
		Mamifero a = new Mamifero(nombre, edad, "pradera",genero, true ,4);
		caballos++;
		return a;
	}
	public static Animal crearLeon(String nombre, int edad,String genero) {
		Mamifero a = new Mamifero(nombre, edad, "selva",genero, true ,4);
		leones++;
		return a;
	}
}
