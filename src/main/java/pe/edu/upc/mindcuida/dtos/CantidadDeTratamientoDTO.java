package pe.edu.upc.mindcuida.dtos;

public class CantidadDeTratamientoDTO {

    private String nombreTratamientos;

    private int cantidadDeTratamientos;

    public String getNombreTratamientos() {
        return nombreTratamientos;
    }

    public void setNombreTratamientos(String nombreTratamientos) {
        this.nombreTratamientos = nombreTratamientos;
    }

    public int getCantidadDeTratamientos() {
        return cantidadDeTratamientos;
    }

    public void setCantidadDeTratamientos(int cantidadDeTratamientos) {
        this.cantidadDeTratamientos = cantidadDeTratamientos;
    }
}
