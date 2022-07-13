
public class Password {

	private int longitud;
	private String constraseña;
	
	
	//Constructor por defecto
	public Password() {
		this.longitud = 8;
		this.constraseña = "";
	}
	
	//Constructor con longitud por parametro
	public Password(int longitud) {
		this.longitud = longitud;
		this.constraseña = crearContraseña(longitud);
	}
	
	
	//Getters y setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getConstraseña() {
		return constraseña;
	}

	public void setConstraseña(String constraseña) {
		this.constraseña = constraseña;
	}
	
	
	
	//Metodo para crear una contraseña aleatoria según su longitud de números
	public String crearContraseña(int longitud) {
		int numAleaatorio;
		int i = 0;
		String contraseña = "";
		while(i < longitud) {
		numAleaatorio = (int) (Math.random()*9+1);
		contraseña += numAleaatorio;
		i ++;
		}
		return contraseña;
	}
}
