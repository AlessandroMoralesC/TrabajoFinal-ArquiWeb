package pe.edu.upc.mindcuida.dtos;

public class CantidadDeMaterialPorTipoDTO {
    private String tipotmaterial;
    private int cantidad;

    public String getTipotmaterial() {
        return tipotmaterial;
    }

    public void setTipotmaterial(String tipotmaterial) {
        this.tipotmaterial = tipotmaterial;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
