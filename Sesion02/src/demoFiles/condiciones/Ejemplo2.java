package demoFiles.condiciones;

public class Ejemplo2 {
	public static void main(String[] arg) {
		int mes = 4;
		switch (mes) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		default:
			System.out.println("No existe el mes.");	
		}	
		///////////////////////////////////////////////////////////////////////////////////////////////////
		int lados=0;
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
			System.out.println("Digite un n�mero mayor a cero y menor a diez.");
		}
	}	
}
