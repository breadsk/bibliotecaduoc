package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data//Es una combinación de varias anotaciones de Lombok
//Genera automaticamente los siguientes métodos para la clase:

/**
 * @Getter
 * @Setter
 * @ToString
 * @EquelasAndHashCode Genera métodos equelas y hashCode que compara los campos
 * @RequiredArgsConstructor Genera un constructor con los campos finales y
 * y los campos marcados con @NonNull
 */

@AllArgsConstructor // Genera automaticamente un constructor que incluye todos los 
 // campos de la clase como parametros
@NoArgsConstructor //Genera un constructor vacío, sin argumentos

public class Prestamo {

    private int id_prestamo;
    private int id_libro;
    private String rut_solicitante;
    private Date fecha_solicitud;
    private Date fecha_entrega;
    private int cantidad_dias;
    private int multas;

}
