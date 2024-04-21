package pe.edu.upc.mindcuida.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Examenes")
public class Examenes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExamenes;
    @Column(name = "nombreExamenes",nullable = false,length = 200)
    private String nombreExamenes;
    @Column(name = "fechaExamenes",nullable = false)
    private LocalDate fechaExamenes;
    @Column(name = "resultadosExamenes",nullable = false,length = 200)
    private String resultadosExamenes;
    @Column(name = "observacionesExamenes",nullable = false,length = 200)
    private String observacionesExamenes;

    public Examenes() {
    }

    public Examenes(int idExamenes, String nombreExamenes, LocalDate fechaExamenes, String resultadosExamenes, String observacionesExamenes) {
        this.idExamenes = idExamenes;
        this.nombreExamenes = nombreExamenes;
        this.fechaExamenes = fechaExamenes;
        this.resultadosExamenes = resultadosExamenes;
        this.observacionesExamenes = observacionesExamenes;
    }

    public int getIdExamenes() {
        return idExamenes;
    }

    public void setIdExamenes(int idExamenes) {
        this.idExamenes = idExamenes;
    }

    public String getNombreExamenes() {
        return nombreExamenes;
    }

    public void setNombreExamenes(String nombreExamenes) {
        this.nombreExamenes = nombreExamenes;
    }

    public LocalDate getFechaExamenes() {
        return fechaExamenes;
    }

    public void setFechaExamenes(LocalDate fechaExamenes) {
        this.fechaExamenes = fechaExamenes;
    }

    public String getResultadosExamenes() {
        return resultadosExamenes;
    }

    public void setResultadosExamenes(String resultadosExamenes) {
        this.resultadosExamenes = resultadosExamenes;
    }

    public String getObservacionesExamenes() {
        return observacionesExamenes;
    }

    public void setObservacionesExamenes(String observacionesExamenes) {
        this.observacionesExamenes = observacionesExamenes;
    }
}
