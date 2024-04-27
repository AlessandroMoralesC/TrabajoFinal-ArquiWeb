package pe.edu.upc.mindcuida.dtos;

public class CantidadMaterialPorNombreDTO {
    private String tematmaterial;
    private int CantidadRegistrosTema;

    public String getTematmaterial() {
        return tematmaterial;
    }

    public void setTematmaterial(String tematmaterial) {
        this.tematmaterial = tematmaterial;
    }

    public int getCantidadRegistrosTema() {
        return CantidadRegistrosTema;
    }

    public void setCantidadRegistrosTema(int cantidadRegistrosTema) {
        CantidadRegistrosTema = cantidadRegistrosTema;
    }
}
