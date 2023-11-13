
public class SistemaBiblioteca {

	// Creamos objetos para los ejemplos
	private Biblioteca biblioteca1 = new Biblioteca();
	private Libro libro1 = new Libro("12", "Cien años de soledad", "Gabriel García Márquez", 1967, GeneroEnum.FICCION, 432);
	private Libro libro2 = new Libro("11", "1984", "George Orwell", 1949, GeneroEnum.CIENCIA_FICCION, 328);
	private Libro libro3 = new Libro("9", "El señor de los anillos", "J.R.R. Tolkien", 1954, GeneroEnum.POESIA, 1178);
	private Libro libro4 = new Libro("6", "Orgullo y prejuicio", "Jane Austen", 1813, GeneroEnum.ROMANCE, 432);
	private Libro libro5 = new Libro("4","Harry Potter y la piedra filosofal", "J.K. Rowling", 1997, GeneroEnum.MISTERIO, 320);
	private Persona persona1 = new Persona("Tomas", 20);
	private Persona persona2 = new Persona("Jazmin", 20);
	
	public void sistemaInicio() {
		// Añadimos los libros en la biblioteca 1
		biblioteca1.agregarLibro(libro1);
		biblioteca1.agregarLibro(libro2);
		biblioteca1.agregarLibro(libro3);
		biblioteca1.agregarLibro(libro4);
		biblioteca1.agregarLibro(libro5);
		
		System.out.print("\n");
		biblioteca1.mostrarLibrosDisponibles();
		
		// Persona 1 toma prestado 2 libros
		System.out.print("\n");
		persona1.tomarLibroPrestado(biblioteca1, libro3);
		persona1.tomarLibroPrestado(biblioteca1, libro5);
		
		// Persona 1 intenta devolver un libro que no fue prestado
		System.out.print("\n");
		persona1.devolverLibro(biblioteca1, libro1);
		
		// Persona 2 toma prestado 2 libros
		System.out.print("\n");
		persona2.tomarLibroPrestado(biblioteca1, libro4);
		persona2.tomarLibroPrestado(biblioteca1, libro5);
		
		// Mostramos los libros prestados por persona 1
		System.out.print("\n");
		persona1.mostrarLibrosPrestados();
		
		// Mostramos los libros prestados por persona 2
		System.out.print("\n");
		persona2.mostrarLibrosPrestados();
		
		// Mostramos Todos los libros prestados por la biblioteca
		System.out.print("\n");
		biblioteca1.mostrarLibrosPrestados();
	}
}
