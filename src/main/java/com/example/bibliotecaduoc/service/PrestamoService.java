package com.example.bibliotecaduoc.service;

import com.example.bibliotecaduoc.model.Prestamo;
import com.example.bibliotecaduoc.repository.PrestamoRepository;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrestamoService {

    //@Autowired
    //Esto no tiene autowired
    //Tiene dependencia de la clase que necesita
    private PrestamoRepository prestamoRepository;

    public PrestamoService(PrestamoRepository prestamoRepository){
        this.prestamoRepository = prestamoRepository;
    }

    public List<Prestamo> getPrestamos(){
        return prestamoRepository.obtenerPrestamos();
    }

}
