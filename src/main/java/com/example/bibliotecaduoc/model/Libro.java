package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data //Es una combinación de varias anotaciones de Lombok
//Genera automaticamente los siguientes métodos para la clase:
/**
 * @Getter
 * @Setter
 * @ToString
 * @EqualsAndHashCode Genera métodos equals y hasjCode que compara los campos
 * @RequiredArgsConstructor Genera un constructor con los campos finales (final) y los campos marcados con @NonNull
 */
@AllArgsConstructor
@NoArgsConstructor
public class Libro {

    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;
}
