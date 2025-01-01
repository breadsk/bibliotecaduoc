package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {
    
    //Arreglo que guardara todos los libros
    private List<Libro> listaLibros = new ArrayList<>();

    //Metodo que retorna todos los libros
    public List<Libro> obtenerLibros(){
        return listaLibros;        
    }

}
