package com.munilvc.core;

public class Avion {
	private String empresa;
	private String modelo;
	private String placa;

	public Avion(String empresa, String modelo, String placa) {
		this.empresa = empresa;
		this.modelo = modelo;
		this.placa = placa;
	}

	public String enviarIdentificacion() {
		return modelo + empresa + placa;
	}

}
