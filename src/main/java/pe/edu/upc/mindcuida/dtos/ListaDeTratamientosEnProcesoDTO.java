package pe.edu.upc.mindcuida.dtos;

public class ListaDeTratamientosEnProcesoDTO {
    private String nombreTratamientos;
    private String estadoTratamientos;

    public String getNombreTratamientos() {
        return nombreTratamientos;
    }

    public void setNombreTratamientos(String nombreTratamientos) {
        this.nombreTratamientos = nombreTratamientos;
    }

    public String getEstadoTratamientos() {
        return estadoTratamientos;
    }

    public void setEstadoTratamientos(String estadoTratamientos) {
        this.estadoTratamientos = estadoTratamientos;
    }
}
