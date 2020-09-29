package zooAnimales;

import java.util.*;

public class Reptil extends Animal{
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();

	
	public Reptil(){
		super();
		listado.add(this);
	}
	public Reptil(String nombre, int edad,String habitat,String genero, String colorEscamas, int largoCola){
		super(nombre, edad, habitat, genero);
		this.setColorEscamas(colorEscamas);
		this.setLargoCola(largoCola);
		listado.add(this);
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public static ArrayList<Reptil> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}
	
	public int cantidadReptiles() {
		return listado.size();
	}
	public String movimiento() {
		return "reptar";
	}
	public static Animal crearIguana(String nombre, int edad,String genero) {
		Reptil r = new Reptil(nombre, edad,"humedal", genero, "verde", 3);
		iguanas++;
		return r;
	}
	public static Animal crearSerpiente(String nombre, int edad,String genero) {
		Reptil r = new Reptil(nombre, edad,"jungla", genero, "blanco", 1);
		serpientes++;
		return r;
	}
	
	
}
