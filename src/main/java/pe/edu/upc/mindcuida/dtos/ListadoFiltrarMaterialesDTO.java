package pe.edu.upc.mindcuida.dtos;

public class ListadoFiltrarMaterialesDTO {
    private String EnlaceMaterial;

    private String MaterialFormato;

    public String getEnlaceMaterial() {
        return EnlaceMaterial;
    }

    public void setEnlaceMaterial(String enlaceMaterial) {
        EnlaceMaterial = enlaceMaterial;
    }

    public String getMaterialFormato() {
        return MaterialFormato;
    }

    public void setMaterialFormato(String materialFormato) {
        MaterialFormato = materialFormato;
    }
}
