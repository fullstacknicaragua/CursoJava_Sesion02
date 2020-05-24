package demoFiles.condiciones;

import java.util.Scanner;

public class Ejemplo3 {
	public static void main(String[] arg) {
		Scanner entrada=new Scanner(System.in);
		int lados=0;

		do {
			System.out.print("Digite la cantidad de lados del pol�gono. Presione cero para salir: ");
			lados=entrada.nextInt();

			if(lados < 0 || lados > 10) {
				System.out.println("Digite un n�mero mayor a cero y menor a diez.");
			}
			else if(lados==0) {
				System.out.println("Fin de la consulta.");
			}
			else {
				System.out.print("El pol�gono con " + lados + " lados es: ");
				switch (lados)
				{
				case 10:
					System.out.println("Dec�gono.");
					break;
				case 9:
					System.out.println("En�agono.");
					break;
				case 8:
					System.out.println("Oct�gono.");
					break;
				case 7:
					System.out.println("Hept�gono.");
					break;
				case 6:
					System.out.println("Hex�gono.");
					break;
				case 5:
					System.out.println("Pent�gono.");
					break;
				case 4: 
					System.out.println("Cuadrado.");
					break;
				case 3:
					System.out.println("Tri�ngulo.");
					break;
				case 2: case 1: 
					System.out.println("No existe pol�gono de " + lados + " lado(s).");
					break;
				default:
					System.out.println("");
					System.out.println("Por favor digite un n�mero menor a diez");
				}
			}
		}
		while(lados!=0);	
		entrada.close();
	}
}