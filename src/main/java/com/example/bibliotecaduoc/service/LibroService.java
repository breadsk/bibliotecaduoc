package com.example.bibliotecaduoc.service;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.repository.LibroRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LibroService {
    
    //@Autowired
    //Esto no tiene autowired
    //Tiene dependencia de la clase que necesita
    private LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository){
        this.libroRepository = libroRepository;
    }

    public List<Libro> getLibros(){
        return libroRepository.obtenerLibros();
    }

    public Libro saveLibro(Libro libro){
        return libroRepository.guardar(libro);
    }

    public Libro getLibroId(int id){
        return libroRepository.buscaLibroPorId(id);
    }

    public Libro getLibroIsbn(String isbn){
        return libroRepository.buscarPorIsbn(isbn);
    }

    public Libro updateLibro(Libro libro){
        return libroRepository.actualizar(libro);
    }

    public String deleLibro(int id){
        libroRepository.eliminar(id);
        return "Producto Eliminado";
    }

    public int totalLibrosV1(){
        return libroRepository.obtenerLibros().size();
    }

    public int totalLibrosV2(){
        return libroRepository.totalLibros();
    }

    public int totalLibrosPorAnio(int anio){        
        return libroRepository.totalLibros();
    }

    public Map<Integer,Long> calcularLibrosPorAnio(){

        //
        List<Libro> libros = libroRepository.obtenerLibros();

        //Usamos un mapa para almacenar los años y la cantidad de libros.
           //Año    Cantidad
        Map<Integer, Long> librosPorAnio = new HashMap<>();

        //Agrupar Libros por Año
        for(Libro libro : libros){
            int anio = libro.getFechaPublicacion();
                                                        //Clave buscada ene l mapa //Es el valor que se devuelve si la clave no existe en el mapa
            long libroPorAnio = librosPorAnio.getOrDefault(anio, 0L)+1;
            librosPorAnio.put(anio,libroPorAnio);
            
        }
        return librosPorAnio;
    }

    public Libro getLibroPorAutor(String autor){
        return libroRepository.buscarPorAutor(autor);
    }

}
