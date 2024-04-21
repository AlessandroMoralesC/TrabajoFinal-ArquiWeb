package pe.edu.upc.mindcuida.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Recetas")

public class Recetas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecetas;
    @Column(name = "cantidadRecetas",nullable = false)
    private int cantidadRecetas;
    @Column(name = "nombreRecetas",nullable = false,length = 50)
    private String nombreRecetas;
    @Column(name = "observacionesRecetas",nullable = false,length = 200)
    private String observacionesRecetas;

    public Recetas() {
    }

    public Recetas(int idRecetas, int cantidadRecetas, String nombreRecetas, String observacionesRecetas) {
        this.idRecetas = idRecetas;
        this.cantidadRecetas = cantidadRecetas;
        this.nombreRecetas = nombreRecetas;
        this.observacionesRecetas = observacionesRecetas;
    }

    public int getIdRecetas() {
        return idRecetas;
    }

    public void setIdRecetas(int idRecetas) {
        this.idRecetas = idRecetas;
    }

    public int getCantidadRecetas() {
        return cantidadRecetas;
    }

    public void setCantidadRecetas(int cantidadRecetas) {
        this.cantidadRecetas = cantidadRecetas;
    }

    public String getNombreRecetas() {
        return nombreRecetas;
    }

    public void setNombreRecetas(String nombreRecetas) {
        this.nombreRecetas = nombreRecetas;
    }

    public String getObservacionesRecetas() {
        return observacionesRecetas;
    }

    public void setObservacionesRecetas(String observacionesRecetas) {
        this.observacionesRecetas = observacionesRecetas;
    }
}
