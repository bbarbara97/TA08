
public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Serie serie1 = new Serie();
		Serie serie2 = new Serie("La cocinera de Castamar", "Tatiana Rodriguez");
		Serie serie3 = new Serie("The 100", 8, "Ciencia Ficción", "Krass Morgan");

		System.out.println("Título: " + serie1.getTitulo() + "\nTemporadas: "+ serie1.getnTemporadas() + "\nGenero: "+ serie1.getGenero() + "\nCreador: "+ serie1.getCreador() + "\nEntregado: " + serie1.isEntregado());
		System.out.println("------------------------------");
		System.out.println("Título: " + serie2.getTitulo() + "\nTemporadas: "+ serie2.getnTemporadas() + "\nGenero: "+ serie2.getGenero() + "\nCreador: "+ serie2.getCreador() + "\nEntregado: " + serie2.isEntregado());
		System.out.println("------------------------------");
		System.out.println("Título: " + serie3.getTitulo() + "\nTemporadas: "+ serie3.getnTemporadas() + "\nGenero: "+ serie3.getGenero() + "\nCreador: "+ serie3.getCreador() + "\nEntregado: " + serie3.isEntregado());

	
	}

}
