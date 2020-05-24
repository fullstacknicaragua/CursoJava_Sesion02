package demoFiles.condiciones;

import java.util.Scanner;

public class Ejemplo3 {
	public static void main(String[] arg) {
		Scanner entrada=new Scanner(System.in);
		int lados=0;

		do {
			System.out.print("Digite la cantidad de lados del polígono. Presione cero para salir: ");
			lados=entrada.nextInt();

			if(lados < 0 || lados > 10) {
				System.out.println("Digite un número mayor a cero y menor a diez.");
			}
			else if(lados==0) {
				System.out.println("Fin de la consulta.");
			}
			else {
				System.out.print("El polígono con " + lados + " lados es: ");
				switch (lados)
				{
				case 10:
					System.out.println("Decágono.");
					break;
				case 9:
					System.out.println("Enéagono.");
					break;
				case 8:
					System.out.println("Octágono.");
					break;
				case 7:
					System.out.println("Heptágono.");
					break;
				case 6:
					System.out.println("Hexágono.");
					break;
				case 5:
					System.out.println("Pentágono.");
					break;
				case 4: 
					System.out.println("Cuadrado.");
					break;
				case 3:
					System.out.println("Triángulo.");
					break;
				case 2: case 1: 
					System.out.println("No existe polígono de " + lados + " lado(s).");
					break;
				default:
					System.out.println("");
					System.out.println("Por favor digite un número menor a diez");
				}
			}
		}
		while(lados!=0);	
		entrada.close();
	}
}