
public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona1 = new Persona("12345678U");
		Persona persona2 = new Persona("Bárbara",25,"Mujer");
		Persona persona3 = new Persona("Jose",25,"123456789U","Hombre",23.6,1.90);
		
		System.out.println("Nombre: " + persona1.getNombre() + "\nEdad: " + persona1.getEdad() + "\nDNI: " + persona1.getDNI() + "\nAltura: " + persona1.getAltura() + "\nPeso: " + persona1.getPeso() + "\nSexo: " + persona1.getSexo());
		System.out.println("-----------------");
		
		System.out.println("Nombre: " + persona2.getNombre() + "\nEdad: " + persona2.getEdad() + "\nDNI: " + persona2.getDNI() + "\nAltura: " + persona2.getAltura() + "\nPeso: " + persona2.getPeso() + "\nSexo: " + persona2.getSexo());
		System.out.println("-----------------");
		
		System.out.println("Nombre: " + persona3.getNombre() + "\nEdad: " + persona3.getEdad() + "\nDNI: " + persona3.getDNI() + "\nAltura: " + persona3.getAltura() + "\nPeso: " + persona3.getPeso() + "\nSexo: " + persona3.getSexo());
		
	}

}
