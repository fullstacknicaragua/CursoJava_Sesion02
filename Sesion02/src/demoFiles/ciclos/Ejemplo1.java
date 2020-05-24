package demoFiles.ciclos;

public class Ejemplo1 {
	public static void main(String[] args) {
		//Imprimir números del 1 al 10 utilizando for
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}

		//Imprimir números del 1 al 10 utilizando while
		int i=0;
		while(i<=10) {
			System.out.println(i);
			i++;
		}

		//Imprimir números del 1 al 10 utilizando do while
		int j=0;
		do {
			System.out.println(j);
			j++;
		}
		while(j<=10);
	}
}
