package pe.edu.upc.mindcuida.dtos;

public class UbicacionDTO {
    private int idLocation;
    private String pais;
    private String departamento;
    private String ciudad;

    public int getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
