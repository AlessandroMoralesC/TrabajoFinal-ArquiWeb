package pe.edu.upc.mindcuida.dtos;

public class RecetasDTO {

    private int idRecetas;

    private int cantidadRecetas;

    private String nombreRecetas;

    private String observacionesRecetas;


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
