package pe.edu.upc.mindcuida.dtos;


import pe.edu.upc.mindcuida.entities.TipoMaterial;
import pe.edu.upc.mindcuida.entities.Users;

public class MaterialesDTO {
    private int idMateriales;
    private String nombreMateriales;
    private Users usuario;
    private TipoMaterial tipoMaterial;

    public int getIdMateriales() {
        return idMateriales;
    }

    public void setIdMateriales(int idMateriales) {
        this.idMateriales = idMateriales;
    }

    public String getNombreMateriales() {
        return nombreMateriales;
    }

    public void setNombreMateriales(String nombreMateriales) {
        this.nombreMateriales = nombreMateriales;
    }

    public Users getUsuario() {
        return usuario;
    }

    public void setUsuario(Users usuario) {
        this.usuario = usuario;
    }

    public TipoMaterial getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(TipoMaterial tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
}
