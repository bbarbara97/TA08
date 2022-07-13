
public class Electrodomestico {
	
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	//Constantes
	protected final static String COLOR_D = "blanco";
	protected final static char CONSUMO_ENERGETICO_D = 'F';
	protected final static double PRECIO_BASE_D = 100;
	protected final static double PESO_D = 5; 
	
	
	//Constructor por defecto
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE_D;
		this.color = COLOR_D;
		this.consumoEnergetico = CONSUMO_ENERGETICO_D;
		this.peso = PESO_D;
	}

	//Constructor con precio y peso
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR_D;
		this.consumoEnergetico = CONSUMO_ENERGETICO_D;
		this.peso = peso;
	}
	

	//Constructor entero
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	
	
	//Getters y setters

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public static String getColorD() {
		return COLOR_D;
	}

	public static char getConsumoEnergeticoD() {
		return CONSUMO_ENERGETICO_D;
	}

	public static double getPrecioBaseD() {
		return PRECIO_BASE_D;
	}

	public static double getPesoD() {
		return PESO_D;
	}

	
	
	
	
}
