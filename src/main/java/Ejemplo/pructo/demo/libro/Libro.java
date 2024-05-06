package Ejemplo.pructo.demo.libro;

import Ejemplo.pructo.demo.categoria.Categoria;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Entity
@Data
public class Libro {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private int pages;
    private Data created;
    
    @ManyToOne 
    private Categoria categoria;


}
