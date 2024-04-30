package pe.edu.upc.mindcuida.dtos;

public class CantidadDeTratamientoPorEfectividadDTO {

    private String nombreTratamientos;
    private String efectividadTratamientos;
    private int cantidadDeTratamientoEfectivas;

    public String getNombreTratamientos() {
        return nombreTratamientos;
    }

    public void setNombreTratamientos(String nombreTratamientos) {
        this.nombreTratamientos = nombreTratamientos;
    }

    public String getEfectividadTratamientos() {
        return efectividadTratamientos;
    }

    public void setEfectividadTratamientos(String efectividadTratamientos) {
        this.efectividadTratamientos = efectividadTratamientos;
    }

    public int getCantidadDeTratamientoEfectivas() {
        return cantidadDeTratamientoEfectivas;
    }

    public void setCantidadDeTratamientoEfectivas(int cantidadDeTratamientoEfectivas) {
        this.cantidadDeTratamientoEfectivas = cantidadDeTratamientoEfectivas;
    }
}
