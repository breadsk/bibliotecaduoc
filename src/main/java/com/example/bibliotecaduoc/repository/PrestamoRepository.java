package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.model.Prestamo;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

import java.util.Date;
import java.util.Calendar;



@Repository //Especialización de la anotación @Component
//Se usa para anotar las clases que acceden a la base de datos encapsulan el
//Almacenamiento, recuperación y búsqueda de objetos de dominio.

public class PrestamoRepository {

    //Coleccion que guardara todos los prestamos
    private List<Prestamo> listaPrestamos = new ArrayList<>();

    //Método para inicializar datos ficticios

    @PostConstruct
    public void init(){

        Calendar calendar = Calendar.getInstance();

        //Fecha Solicitud 1
        calendar.set(2025,Calendar.JANUARY,20);
        Date fecha_solicitud1 = calendar.getTime();
        //Fecha Entrega 1
        calendar.add(Calendar.DAY_OF_YEAR,3);
        Date fecha_entrega1 = calendar.getTime();

        //Fecha Solicitud 2
        calendar.set(2025,Calendar.JANUARY,21);
        Date fecha_solicitud2 = calendar.getTime();
        //Fecha Entrega 2
        calendar.add(Calendar.DAY_OF_YEAR,3);
        Date fecha_entrega2 = calendar.getTime();

        //Fecha Solicitud 3
        calendar.set(2025,Calendar.JANUARY,22);
        Date fecha_solicitud3 = calendar.getTime();
        //Fecha Entrega 3
        calendar.add(Calendar.DAY_OF_YEAR,3);
        Date fecha_entrega3 = calendar.getTime();

        //Fecha Solicitud 4
        calendar.set(2025,Calendar.JANUARY,22);
        Date fecha_solicitud4 = calendar.getTime();
        //Fecha Entrega 4
        calendar.add(Calendar.DAY_OF_YEAR,3);
        Date fecha_entrega4 = calendar.getTime();

        //listaPrestamos.add(new Prestamo(1,1,'15603403-7',fecha_solicitud1,fecha_entrega1,3,0));
        listaPrestamos.add(new Prestamo(1,1,"15603403-7", fecha_solicitud1, fecha_entrega1,3, 0));
        listaPrestamos.add(new Prestamo(2,2,"3281875-7", fecha_solicitud2, fecha_entrega2,3, 0));
        listaPrestamos.add(new Prestamo(3,3,"21308939-0", fecha_solicitud3, fecha_entrega3,3, 0));
        listaPrestamos.add(new Prestamo(4,4,"22703533-1", fecha_solicitud4, fecha_entrega4,3, 0));
        
        
    }

    public List<Prestamo> obtenerPrestamos(){
        return listaPrestamos;
    }


    //Buscar prestamo por Id
    //Buscar un libro por su ID
    public Prestamo buscarPrestamoPorId(int id_prestamo){
        for(Prestamo prestamo: listaPrestamos){
            if(prestamo.getId_prestamo() == id_prestamo){
                return prestamo;
            }
        }
        return null;
    }    


    //Buscar por rut solicitante
}
