import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	// Atributos
	private List<Libro> librosDisponibles = new ArrayList<>();
	private List<Libro> librosPrestados = new ArrayList<>(); 
	
	// Metodos
	
	private boolean buscarLibro(List<Libro> libros, Libro libroExt) {
		for (Libro libro : libros) {
			if(libroExt.equals(libro)) {
				return true;
			}
		}
		return false;
	}
	
	public void agregarLibro(Libro libro1) {
		
		// Buscamos si el libro a agregar, ya se encuentra en la lista, para que no hayan duplicados
		if(!buscarLibro(librosDisponibles, libro1)) {
			libro1.setPrestado(false);
			librosDisponibles.add(libro1);
			System.out.println("Libro agregado a la biblioteca: " + libro1.getTitulo());
		} else {
			System.out.println("El libro ya se encuentra en la biblioteca!");
		}
		
	}
	
	public boolean prestarLibro(Libro libro) {
		if(librosDisponibles.contains(libro)) {
			librosDisponibles.remove(libro);
			librosPrestados.add(libro);
			
			// verificamos si el estado del libro coincide con la lista donde se encuentra
			if(libro.prestarLibro()) {
				// System.out.println("Libro prestado correctamente!");
				return true;
			} else {
				// System.out.println("El libro ya se encuentra prestado anteriormente");
				return false;
			}
			
		} else {
			// System.out.println("El libro ya se encuentra prestado!");
			return false;
		}
	}
	
	public boolean devolverLibro(Libro libro) {
		if(librosPrestados.contains(libro)) {
			librosPrestados.remove(libro);
			librosDisponibles.add(libro);
			
			// verificamos si el estado del libro coincide con la lista donde se encuentra
			if(libro.devolverLibro()) {
				// System.out.println("Libro fue devuelto correctamente!");
				return true;
			} else {
				// System.out.println("El libro no se encontraba prestado");
				return false;
			}
		} else {
			// System.out.println("El libro no se encontraba prestado");
			return false;
		}
	}
	
	public void mostrarLibrosDisponibles() {
		System.out.println("Libros Disponibles: \n");
		for (Libro libro : librosDisponibles) {
			System.out.println(libro);
		}
	}
	
	public void mostrarLibrosPrestados() {
		System.out.println("Libros Prestados: \n");
		for (Libro libro : librosPrestados) {
			System.out.println(libro);
		}
	}
}
