package pe.edu.upc.mindcuida.dtos;

public class CantidadDeMaterialPorTipoDTO {
    private String tipotmaterial;
    private int CantidadRegistros;

    public String getTipotmaterial() {
        return tipotmaterial;
    }

    public void setTipotmaterial(String tipotmaterial) {
        this.tipotmaterial = tipotmaterial;
    }

    public int getCantidadRegistros() {
        return CantidadRegistros;
    }

    public void setCantidadRegistros(int cantidadRegistros) {
        CantidadRegistros = cantidadRegistros;
    }
}
