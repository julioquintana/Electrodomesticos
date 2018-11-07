package com.ejercicios.electrodomesticos;

public class Lavadora extends Electrodomesticos {
	final int CARGA_PREDETERMINADA = 5;
	 int carga;
	 
	 Lavadora(){
		 super();
		 this.carga= CARGA_PREDETERMINADA;
	 }
	 
	 Lavadora(double precio, double peso){
		 super(precio, peso);
		 this.carga= CARGA_PREDETERMINADA;
	 }
	 Lavadora(double precio, double peso, String color, String consuEner, int carga){
		 super(precio, peso, color, consuEner);
		 this.carga = validarCarga(carga);
	 }
	 
		@Override
		public double precioFinal() {
			double preciofinall= super.precioFinal();
			double xcarga = getCarga();
			if(xcarga>=50) {
				preciofinall += 50;
			}
			return preciofinall;
		}
	 
	 
	public int getCarga() {
		return carga;
	}
	int validarCarga(int carga) {
		if(carga<0) {
			carga=0;
		}
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public int getCARGA_PREDETERMINADA() {
		return CARGA_PREDETERMINADA;
	}
	 
	public String toString() {
		return super.toString()+" Carga:"+getCarga()+" Precio Final: "+ precioFinal();
	}
}
