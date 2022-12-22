/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Momento3 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String placa;
		double pasaje, prom = 0, porce = 0, recolectado, busesg = 0;
		int tipo, pasajeros, gastos, N, contb = 0, contc = 0, acuc = 0, acud = 0, acue = 0, acup = 0;

		System.out.print("Ingresar el numero de vehicuos que va a registrar ");
		N = a.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.print("Ingresar a placa de vehiculo: ");
			placa = a.next();
			System.out.print("Ingresar tipo de vehicuo (1=colectivo, 2=microbús, 3=buseta, 4=bus ");
			tipo = a.nextInt();
			System.out.print("Ingresar la cantidad de pásajeros");
			pasajeros = a.nextInt();
			System.out.print("Ingresar el valor del pasaje");
			pasaje = a.nextDouble();
			System.out.print("Ingresar los gastos de vehiculo");
			gastos = a.nextInt();

			recolectado = (float) (pasajeros * pasaje);
			acud += gastos;

			System.out.println(
					"\n Placa:" + placa + "\n tipo : " + tipo + "\n pasajeros: " + pasajeros + "\n pasaje: "
							+ pasaje + "\n gastos: " + gastos + "\n Dinero recolectado: " + recolectado);

			// b) Cuantos de los colectivos transportaron más de 100 pasajeros.
			if (tipo == 1 && pasajeros > 100) {
				contb++;
			}

			// c) Promedio de pasajeros transportados por los microbuses.

			if (tipo == 2) {
				acuc += pasajeros;
				contc++;

			}

			// d) Total del valor de los gastos de todos los buses.
			if (tipo == 4) {
				busesg = acud += gastos;
			}

			// e) Porcentaje que representan las busetas que transportaron menos de 50
			// pasajeros respecto a todas las busetas
			if (tipo == 3) {
				acue++;
			}
			if (pasajeros < 50) {
				acup++;

			}

		}
		porce = (acue * 100) / acup;
		prom = (acuc / contc);
		System.out.println("Numero de Colectivos con mas de 100 pasajeros:" + contb);
		System.out.println("Promedio de pasajeros transportados por los microbuses:" + prom);
		System.out.println("Total de gastos de los buses:" + busesg);
		System.out.println("Porcentaje de las busetas que transportaron menos de 50 pasajeros " + porce + "%");

	}

}