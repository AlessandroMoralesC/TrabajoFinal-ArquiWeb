package pe.edu.upc.mindcuida.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "DetalleHClinico")
public class DetalleHClinico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDHClinico;
    @Column(name = "descripcionDHClinico",nullable = false,length = 200)
    private String descripcionDHClinico;
    @Column(name = "fechaDHClinico",nullable = false)
    private LocalDate fechaDHClinico;
    @ManyToOne
    @JoinColumn(name="historialclinicoid")
    private HistorialClinico historialClinico;
    @ManyToOne
    @JoinColumn(name="recetasid")
    private Recetas recetas;
    @ManyToOne
    @JoinColumn(name="examenesid")
    private Examenes examenes;
    @ManyToOne
    @JoinColumn(name="tratamientosid")
    private Tratamientos tratamientos;

    public DetalleHClinico() {
    }

    public DetalleHClinico(int idDHClinico, String descripcionDHClinico, LocalDate fechaDHClinico, HistorialClinico historialClinico, Recetas recetas, Examenes examenes, Tratamientos tratamientos) {
        this.idDHClinico = idDHClinico;
        this.descripcionDHClinico = descripcionDHClinico;
        this.fechaDHClinico = fechaDHClinico;
        this.historialClinico = historialClinico;
        this.recetas = recetas;
        this.examenes = examenes;
        this.tratamientos = tratamientos;
    }

    public int getIdDHClinico() {
        return idDHClinico;
    }

    public void setIdDHClinico(int idDHClinico) {
        this.idDHClinico = idDHClinico;
    }

    public String getDescripcionDHClinico() {
        return descripcionDHClinico;
    }

    public void setDescripcionDHClinico(String descripcionDHClinico) {
        this.descripcionDHClinico = descripcionDHClinico;
    }

    public LocalDate getFechaDHClinico() {
        return fechaDHClinico;
    }

    public void setFechaDHClinico(LocalDate fechaDHClinico) {
        this.fechaDHClinico = fechaDHClinico;
    }

    public HistorialClinico getHistorialClinico() {
        return historialClinico;
    }

    public void setHistorialClinico(HistorialClinico historialClinico) {
        this.historialClinico = historialClinico;
    }

    public Recetas getRecetas() {
        return recetas;
    }

    public void setRecetas(Recetas recetas) {
        this.recetas = recetas;
    }

    public Examenes getExamenes() {
        return examenes;
    }

    public void setExamenes(Examenes examenes) {
        this.examenes = examenes;
    }

    public Tratamientos getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(Tratamientos tratamientos) {
        this.tratamientos = tratamientos;
    }
}
