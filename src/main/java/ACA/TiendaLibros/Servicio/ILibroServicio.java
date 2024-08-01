package ACA.TiendaLibros.Servicio;

import ACA.TiendaLibros.Modelo.Libro;
import java.util.List;

public interface ILibroServicio {

    public List<Libro> mostrarLibros();

    public Libro buscarLibroPorID(Integer idLibro);

    public void guardarlibro(Libro libro);

    public void eliminarLibro(Libro libro);
}
