package com.ejercicios.electrodomesticos;

public interface Electrodomestico {
	final String CONSUMO_ENERGETICO_PREDETERMINADO = "F";
	final String COLOR_PREDETERMINADO = "BLANCO";
	final double PESO_PREDETERMINADO = 5;
	
	String comprobarConsumoEnergetico(String ce);
	String comprobarColor(String color);
	double precioFinal();
}
