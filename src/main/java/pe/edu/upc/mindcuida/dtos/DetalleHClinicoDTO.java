package pe.edu.upc.mindcuida.dtos;


import pe.edu.upc.mindcuida.entities.Examenes;
import pe.edu.upc.mindcuida.entities.HistorialClinico;
import pe.edu.upc.mindcuida.entities.Recetas;
import pe.edu.upc.mindcuida.entities.Tratamientos;

import java.time.LocalDate;

public class DetalleHClinicoDTO {
    private int idDHClinico;
    private String descripcionDHClinico;
    private LocalDate fechaDHClinico;
    private HistorialClinico historialClinico;
    private Recetas recetas;
    private Examenes examenes;
    private Tratamientos tratamientos;

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
