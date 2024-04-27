package pe.edu.upc.mindcuida.dtos;

import java.time.LocalDate;

public class TratamientosDTO {
    private int idTratamientos;
    private String nombreTratamientos;

    private LocalDate fechainicioTratamientos;

    private LocalDate fechafinTratamientos;
    private String estadoTratamientos;

    private String descripcionTratamientos;

    private String efectividadTratamientos;

    public int getIdTratamientos() {
        return idTratamientos;
    }

    public void setIdTratamientos(int idTratamientos) {
        this.idTratamientos = idTratamientos;
    }

    public String getNombreTratamientos() {
        return nombreTratamientos;
    }

    public void setNombreTratamientos(String nombreTratamientos) {
        this.nombreTratamientos = nombreTratamientos;
    }

    public LocalDate getFechainicioTratamientos() {
        return fechainicioTratamientos;
    }

    public void setFechainicioTratamientos(LocalDate fechainicioTratamientos) {
        this.fechainicioTratamientos = fechainicioTratamientos;
    }

    public LocalDate getFechafinTratamientos() {
        return fechafinTratamientos;
    }

    public void setFechafinTratamientos(LocalDate fechafinTratamientos) {
        this.fechafinTratamientos = fechafinTratamientos;
    }

    public String getEstadoTratamientos() {
        return estadoTratamientos;
    }

    public void setEstadoTratamientos(String estadoTratamientos) {
        this.estadoTratamientos = estadoTratamientos;
    }

    public String getDescripcionTratamientos() {
        return descripcionTratamientos;
    }

    public void setDescripcionTratamientos(String descripcionTratamientos) {
        this.descripcionTratamientos = descripcionTratamientos;
    }

    public String getEfectividadTratamientos() {
        return efectividadTratamientos;
    }

    public void setEfectividadTratamientos(String efectividadTratamientos) {
        this.efectividadTratamientos = efectividadTratamientos;
    }
}