package demoFiles.condiciones;

public class Ejemplo1 {
	public static void main(String[] arg) {
		String cadena1="", cadena2="";

		cadena1="Hola";
		cadena2="Hola";

		if(cadena1==cadena2) {
			System.out.print("Son iguales");
		}
		else {
			System.out.print("NO son iguales");
		}
		///////////////////////////////////////////////////////////////////////////////////////////////////	
		//If anidados...
		String cadena="Hola!";
		if(cadena.length()==0) {
			System.out.print("La cadena está vacía!");
		}
		else {
			if(cadena.length()>=1 && cadena.length()<=5) {
				System.out.print("La cadena tiene una longitud entre uno y cinco caracteres.");
			}
			else if(cadena.length()>5 && cadena.length()<=10) {
				System.out.print("La cadena tiene una longitud entre seis y diez caracteres.");
			}
			else {
				System.out.print("La cadena tiene una longitud mayor a diez caracteres.");
			}
			
		}
		///////////////////////////////////////////////////////////////////////////////////////////////////
		//Operador Ternario...
		String a="", b="", resul="";
		a="Hola";
		b="Hola";
		resul=(a==b)?"Son iguales":"NO son iguales";
		System.out.print(resul);

		
	}
}
