package com.example.bibliotecaduoc.controller;

import com.example.bibliotecaduoc.model.Prestamo; //Para el modelo
import com.example.bibliotecaduoc.service.PrestamoService; //Para el servicio
import org.springframework.beans.factory.annotation.Autowired; //Ver esto
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/v1/prestamos")
public class PrestamosController {

    private final PrestamoService prestamoService;
    
    public PrestamosController(PrestamoService prestamoService){
        this.prestamoService = prestamoService;
    }

    //Endpoint para obtener todos los préstamos
    @GetMapping("/listar_prestamos")
    public List<Prestamo> getPrestamos(){
        return prestamoService.getPrestamos();
    }
    

}
