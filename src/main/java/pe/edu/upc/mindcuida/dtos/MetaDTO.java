package pe.edu.upc.mindcuida.dtos;

import pe.edu.upc.mindcuida.entities.Usuario;

public class MetaDTO {

    private int idMeta;
    private String estadoMeta;
    private String nombreMeta;
    private String descripcionMeta;
    private Usuario usuario;

    public int getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(int idMeta) {
        this.idMeta = idMeta;
    }

    public String getEstadoMeta() {
        return estadoMeta;
    }

    public void setEstadoMeta(String estadoMeta) {
        this.estadoMeta = estadoMeta;
    }

    public String getNombreMeta() {
        return nombreMeta;
    }

    public void setNombreMeta(String nombreMeta) {
        this.nombreMeta = nombreMeta;
    }

    public String getDescripcionMeta() {
        return descripcionMeta;
    }

    public void setDescripcionMeta(String descripcionMeta) {
        this.descripcionMeta = descripcionMeta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
