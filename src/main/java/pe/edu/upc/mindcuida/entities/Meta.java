package pe.edu.upc.mindcuida.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Meta")
public class Meta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMeta;

    @Column(name = "estadoMeta", nullable = false,length = 50)
    private String estadoMeta;
    @Column(name = "nombreMeta", nullable = false,length = 50)
    private String nombreMeta;
    @Column(name = "descripcionMeta", nullable = false,length = 200)
    private String descripcionMeta;
    @ManyToOne
    @JoinColumn(name="usuarioid")
    private Usuario usuario;

    public Meta() {
    }

    public Meta(int idMeta, String estadoMeta, String nombreMeta, String descripcionMeta, Usuario usuario) {
        this.idMeta = idMeta;
        this.estadoMeta = estadoMeta;
        this.nombreMeta = nombreMeta;
        this.descripcionMeta = descripcionMeta;
        this.usuario = usuario;
    }

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
