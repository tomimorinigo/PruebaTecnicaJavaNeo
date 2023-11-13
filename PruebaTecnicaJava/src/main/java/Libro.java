
public class Libro {

	// Atributos
	private String id;
	private String titulo;
	private String autor;
	private int anioPublicacion;
	private GeneroEnum genero;
	private int numPaginas;
	private boolean prestado;
	
	// Constructor
	public Libro(String id, String titulo, String autor, int añoPublicacion, GeneroEnum genero, int numeroPaginas) {
	        this.id = id;
		 	this.titulo = titulo;
	        this.autor = autor;
	        this.anioPublicacion = añoPublicacion;
	        this.genero = genero;
	        this.numPaginas = numeroPaginas;
	        this.prestado = false; // Inicialmente, el libro no está prestado
	    }
	
	// Getters y Setters
	public String getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	public GeneroEnum getGenero() {
		return genero;
	}
	public void setGenero(GeneroEnum genero) {
		this.genero = genero;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	

	@Override
	public String toString() {
		String condicion = "Disponible";
		
		if (prestado) {
			condicion = "Prestado";
		}
		
		return "Libro --> ID: " + id + " | Titulo: " + titulo + " | Autor: " + autor + " | Año de Publicacion: " 
		+ anioPublicacion + " | Genero: " + genero + " | Numero de Paginas:" + numPaginas + " | Condicion: " 
		+ condicion;
	}
	
	// Metodos extras
	public boolean equals(Libro libro) {
		if(libro.getId().equals(id)) {
			return true;
		} else {
			return false;
		}
	}
	
	// Prestar libro
    public boolean prestarLibro() {
        if (!prestado) {
            prestado = true;
            return true;
        } else {
            return false;
        }
    }

    // Devolver libro
    public boolean devolverLibro() {
        if (prestado) {
            prestado = false;
            return true;
        } else {
            return false;
        }
    }
	
	
	
}
