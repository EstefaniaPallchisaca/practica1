package com.practica1.Componente;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Componente_Implementacion implements Componente_Dependencia{
	

	@Override
	public String leer_teclado() {
		System.out.println("ingresa tu nombre");
		Scanner leer = new Scanner(System.in);
		return leer.nextLine();
	}

	@Override
	public void salida_mensaje(String mensaje) {
		System.out.println("Tu nombre es:");
		System.out.println(mensaje);
		
	}

}
