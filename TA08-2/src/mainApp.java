
public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Password password1 = new Password();
		Password password2 = new Password(3);
		
		System.out.println("Longitud: "+ password1.getLongitud() + " || Contraseña: " + password1.getConstraseña());
		System.out.println("Longitud: "+ password2.getLongitud() + " || Contraseña: " + password2.getConstraseña());

	
	}
}
