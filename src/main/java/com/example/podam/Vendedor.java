package com.example.podam;

import java.io.Serializable;
import java.util.ArrayList;

public class Vendedor implements Serializable {

	//Atributos
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String correo;
	private String telefono;
	private ArrayList<ArticuloUnitario> artDisponibles;
	private ArrayList<ArticuloUnitario> artVendidos;
	
	public Vendedor (String nombre, String correo, String telefono) {
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.artDisponibles = new ArrayList<ArticuloUnitario>();
		this.artVendidos = new ArrayList<ArticuloUnitario>();
	}
	
	@Override
	public String toString() {
		return "";
	}
	
	public void vender(int index) {
		artVendidos.add(artDisponibles.remove(index));
	}
	
	public void ofrecer(ArticuloUnitario articulo) {
		artDisponibles.add(articulo);
	}
}
