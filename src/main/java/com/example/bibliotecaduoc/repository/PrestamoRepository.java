package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Prestamo;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

@Repository //Especialización de la anotación @Component
//Se usa para anotar las clases que acceden a la base de datos encapsulan el
//Almacenamiento, recuperación y búsqueda de objetos de dominio.

public class PrestamoRepository {

    //Coleccion que guardara todos los prestamos
    private List<Prestamo> listaPrestamos = new ArrayList<>();

    public List<Prestamo> obtenerPrestamos(){
        return listaPrestamos;
    }

}
