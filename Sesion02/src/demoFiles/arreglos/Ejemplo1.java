package demoFiles.arreglos;

public class Ejemplo1 {
	public static void main(String[] args) {
		String[] nombres;
		nombres = new String[5];
		nombres[0]="José";
		nombres[1]="María";
		nombres[2]="Gustavo";
		nombres[3]="Sofía";
		nombres[4]="Andrés";

		System.out.println(nombres[0]);
		System.out.println(nombres[1]);
		System.out.println(nombres[2]);
		System.out.println(nombres[3]);
		System.out.println(nombres[4]);
		
		nombres[4]="Édgar";
		System.out.println(nombres[4]);		
	}
}
