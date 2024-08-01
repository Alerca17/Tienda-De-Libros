package ACA.TiendaLibros.Servicio;

import ACA.TiendaLibros.Modelo.Libro;
import ACA.TiendaLibros.Repositorio.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServicio implements ILibroServicio{

    @Autowired
    private LibroRepositorio libroRepositorio;

    @Override
    public List<Libro> mostrarLibros() {

        return libroRepositorio.findAll();
    }

    @Override
    public Libro buscarLibroPorID(Integer idLibro) {

        Libro libro = libroRepositorio.findById(idLibro).orElse(null);
        return libro;
    }

    @Override
    public void guardarlibro(Libro libro) {

        libroRepositorio.save(libro);

    }

    @Override
    public void eliminarLibro(Libro libro) {

        libroRepositorio.delete(libro);

    }
}
