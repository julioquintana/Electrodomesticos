package com.ejercicios.electrodomesticos;

public class Electrodomesticos implements Electrodomestico {
	private String consumoEnergetico;
	private double precio;
	private String color;
	private double peso;
	
	Electrodomesticos(){
		this.precio = 0;
		this.color = COLOR_PREDETERMINADO;
		this.consumoEnergetico = CONSUMO_ENERGETICO_PREDETERMINADO;
		this.peso = PESO_PREDETERMINADO;
	}

	Electrodomesticos(double precio, double peso){
		this.precio = setPrecio(precio);
		this.color = COLOR_PREDETERMINADO;
		this.consumoEnergetico = CONSUMO_ENERGETICO_PREDETERMINADO;
		this.peso = peso;
	}
	Electrodomesticos(double precio, double peso, String color, String consuEner){
		this.precio =setPrecio(precio);
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consuEner);
		this.peso = setPeso(peso);
	}
	

	

	@Override
	public String comprobarConsumoEnergetico(String ce) {
		if(ce.toUpperCase() == "A" || ce.toUpperCase() == "B" || ce.toUpperCase() == "C" || ce.toUpperCase() == "D" || ce.toUpperCase() == "E" || ce.toUpperCase() == "F") {
			return ce;
		}
		// TODO Auto-generated method stub
		return CONSUMO_ENERGETICO_PREDETERMINADO;
	}
	@Override
	public String comprobarColor(String color) {
		if(color.toUpperCase() == "BLANCO" ||color.toUpperCase() == "AZUL" || color.toUpperCase() == "GRIS" || color.toUpperCase() == "NEGRO" || color.toUpperCase() == "ROJO"){
			return color;
		}
		// TODO Auto-generated method stub
		return COLOR_PREDETERMINADO;
	}

	@Override
	public double precioFinal() {
		double precioo = getPrecio();	
		String ce = getConsumoEnergetico();
		switch (ce) {
		case "A":
			precioo += 100;
			break;
		case "B":
			precioo += 80;
			break;
		case "C":
			precioo += 60;
			break;
		case "D":
			precioo += 50;
			break;
		case "E":
			precioo += 30;
			break;
		case "F":
			precioo += 10;
			break;
		}
		
		double pesoo = getPeso();
		if(pesoo >= 0 && pesoo <= 19) {
			precioo += 10;
		}else if(pesoo >= 20 && pesoo <= 49) {
			precioo += 50;
		}else if(pesoo >= 50 && pesoo <= 79) {
			precioo += 80;
		}else{
			precioo += 100;
		}
		return precioo;
	}
	
	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(String consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	public double getPrecio() {
		return precio;
	}
	public double setPrecio(double precio) {
		if(precio < 0 ) {
			precio = 0;
		}else {
			precio = precio;
		}
		return precio;
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPeso() {
		return peso;
	}
	public double setPeso(double peso) {
		if(peso < 0 ) {
			peso= 0;
		}else {
			peso = peso;
		}
		return peso;
	}
	public String toString() {
		return "Consumo Energetico: "+ getConsumoEnergetico() + " Color:"+ getColor()+ " Peso: "+getPeso()+" Precio: "+getPrecio();
	}
}
