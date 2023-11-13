import java.util.ArrayList;
import java.util.List;

public class Persona {
	
	// Atributos
	private String nombre;
	private int Edad;
	private List<Libro> librosPrestados = new ArrayList<>();
	
	// Constructor
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		Edad = edad;
	}
	
	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}
	
	// Metodos
	public void tomarLibroPrestado(Biblioteca biblioteca, Libro libro) {
		if(biblioteca.prestarLibro(libro)) {
			librosPrestados.add(libro);
			System.out.println("El libro (" + libro.getTitulo() + ") fue prestado correctamente a " + nombre);
		} else {
			System.out.println("El libro (" + libro.getTitulo() + ") no se encuentra disponible!");
		}
	}
	
	public void devolverLibro(Biblioteca biblioteca, Libro libro) {
		if(biblioteca.devolverLibro(libro)) {
			librosPrestados.remove(libro);
			System.out.println("Libro (" + libro.getTitulo() + ") devuelto correctamente!");
		} else {
			System.out.println("El libro (" + libro.getTitulo() + ") no estaba prestado, no se puede devolver");
		}
	}
	
	public void mostrarLibrosPrestados() {
		System.out.println("Libros Prestados a nombre de " + nombre + ": \n");
		for (Libro libro : librosPrestados) {
			System.out.println(libro);
		}
	}

	
}
