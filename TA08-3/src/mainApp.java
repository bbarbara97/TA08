
public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomestico ed1 = new Electrodomestico();
		Electrodomestico ed2 = new Electrodomestico(50,6.7);
		
		System.out.println("Precio base: " + ed1.getPrecioBase() + "\nColor: " + ed1.getColor() + "\nConsumo energético: " + ed1.getConsumoEnergetico() + "\nPeso: " + ed1.getPeso());
		System.out.println("-----------------");
		System.out.println("Precio base: " + ed2.getPrecioBase() + "\nColor: " + ed2.getColor() + "\nConsumo energético: " + ed2.getConsumoEnergetico() + "\nPeso: " + ed2.getPeso());
		System.out.println("-----------------");
		
		String c = "NeGrO"; //En casos así, se rellena todo por teclado si no fuese correcto ya nos lo diría el programa.
		String color = c.toLowerCase();
		
		if(color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris")) {
		Electrodomestico ed3 = new Electrodomestico(37,color,'A',50.8);
		System.out.println("Precio base: " + ed3.getPrecioBase() + "\nColor: " + ed3.getColor() + "\nConsumo energético: " + ed3.getConsumoEnergetico() + "\nPeso: " + ed3.getPeso());
		}
		else {
			System.out.println("El color escogido no está disponible.");
		}
		
		
	}

}
