package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Libro;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //Especialización de la anotación @Component
//Se usa para anotar clases que acceden a la base de datos, encapsulan el
//Almacenamiento, recuperación y búsqueda de objetos de dominio.
public class LibroRepository {
    
    //Arreglo que guardara todos los libros
    private List<Libro> listaLibros = new ArrayList<>();

    // Método para inicializar datos ficticios

    @PostConstruct
    public void init(){

        listaLibros.add(new Libro(1, "978-0134685991", "Effective Java", "Addison-Wesley", 2018, "Joshua Bloch"));
        listaLibros.add(new Libro(2, "978-1617294945", "Spring in Action", "Manning", 2020, "Craig Walls"));
        listaLibros.add(new Libro(3, "978-1491950357", "Designing Data-Intensive Applications", "O'Reilly Media", 2017, "Martin Kleppmann"));
        listaLibros.add(new Libro(4, "978-0132350884", "Clean Code", "Prentice Hall", 2008, "Robert C. Martin"));
    }

    //Metodo que retorna todos los libros
    public List<Libro> obtenerLibros(){
        return listaLibros;        
    }

    //Buscar un libro por su ID
    public Libro buscaLibroPorId(int id){
        for(Libro libro: listaLibros){
            if(libro.getId() == id){
                return libro;
            }
        }
        return null;
    }

    //Buscar un libro por su isbn
    public Libro buscarPorIsbn(String isbn){
        for(Libro libro : listaLibros){
            if(libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
        return null;
    }

    //Buscar por Autor
    public Libro buscarPorAutor(String autor){

        for(Libro libro : listaLibros){
            if(libro.getAutor().equals(autor)){
                return libro;
            }
        }
        return null;
    }


    //Guardar Libro
    public Libro guardar(Libro lib){
        listaLibros.add(lib);
        return lib;
    }

    //Actualizar Libro
    public Libro actualizar(Libro lib){
        int id = 0;
        int idPosicion = 0;

        for(int i = 0;i<listaLibros.size();i++){
            if (listaLibros.get(i).getId() == lib.getId()) {
                id = lib.getId();
                idPosicion = i;
            }
        }

        Libro libro1 = new Libro();
        libro1.setId(id);
        libro1.setTitulo(lib.getTitulo());
        libro1.setAutor(lib.getAutor());
        libro1.setFechaPublicacion(lib.getFechaPublicacion());
        libro1.setEditorial(lib.getEditorial());
        libro1.setIsbn(lib.getIsbn());

        listaLibros.set(idPosicion, libro1);
        return libro1;
    }

    //Metodo que elimina el libro mediante su Id
    //Los 3 métodos son utilizados para eliminar un ítem en un arreglo.
    public void eliminar(int id){
        //Alternativa 1
        Libro libro = buscaLibroPorId(id);
        if (libro != null) {
            listaLibros.remove(libro);
        }
        //Alternativa 2
        int idPosicion = 0;
        for(int i = 0;i<listaLibros.size();i++){
            if (listaLibros.get(i).getId() == id) {
                idPosicion = i;
                break;//Con esto salgo inmediatamente del bucle
            }
        }
        if (idPosicion > 0) {
            listaLibros.remove(idPosicion);
        }
        // Otra alternativa
        listaLibros.removeIf((x) -> x.getId() == id);
    }

    public int totalLibros(){
        return listaLibros.size();
    }
    
}
