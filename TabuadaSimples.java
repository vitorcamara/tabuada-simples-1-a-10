package com.vitorcamara.projetos;

import java.util.Scanner;

public class TabuadaSimples {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um numero entre 1 e 10:");
		int num = scan.nextInt();

		int multi;
		System.out.println("Tabuada de " + num + ":");
		for (int i = 1; i <= 10; i++) {

			multi = num * i;
			System.out.println(num + " x " + i + " = " + multi);

		}

	}

}
