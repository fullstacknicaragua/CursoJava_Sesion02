package demoFiles.clases;

public class Persona {
	public String nombre, apellido;
	public int anioNacimiento;
	char sexo;
	float estatura;
	
	public Persona() {}
	public Persona(char psexo) {sexo=psexo;}
	
//	public float getEstatura() {
//		return estatura;		
//	}
	public String getEstatura() {
		String descripcionEstatura="";
		if (estatura<1.65) {descripcionEstatura="Estatura Baja.";}
		else if (estatura>1.65 && estatura>1.80) {descripcionEstatura="Estatura Promedio.";}
		else {descripcionEstatura="Estatura Alta.";}
		
		return descripcionEstatura;
		
	}
	public void setEstatura(float pestatura) {estatura=pestatura;}
	
	public String retornarNombreCompleto() {
		return nombre + " " + apellido;
	}
	public int retornarEdad() {
		return calcularEdad();
	}
	private int calcularEdad() {
		return 2020 - anioNacimiento;
	}
	public String retornarDescripcionSexo() {
		String descSexo="";
		switch (sexo) { case 'm': descSexo="Masculino"; break; case 'f': descSexo="Femenino"; break; default: descSexo="";};
		return descSexo;
	}
}
