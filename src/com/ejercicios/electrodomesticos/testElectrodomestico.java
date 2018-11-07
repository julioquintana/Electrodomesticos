package com.ejercicios.electrodomesticos;

public class testElectrodomestico {

	public static void main(String[] args) {
		//Electrodomesticos eld01 = new Electrodomesticos();
		//System.out.println(eld01);
		//Electrodomesticos eld02 = new Electrodomesticos(139.0, 50.0);
		//System.out.println(eld02);
		
		Lavadora elec01 = new Lavadora(139.0, 50.0);
		System.out.println(elec01 );
		Lavadora elec02 = new Lavadora(139.0, 50.0,"ROJO","C",65);
		System.out.println(elec02 );
		
		
		
		
	}

}
