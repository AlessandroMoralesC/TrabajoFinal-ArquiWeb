package pe.edu.upc.mindcuida.dtos;

import java.time.LocalDate;

public class ExamenesDTO {
    private int idExamenes;
    private String nombreExamenes;
    private LocalDate fechaExamenes;
    private String resultadosExamenes;
    private String observacionesExamenes;

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
