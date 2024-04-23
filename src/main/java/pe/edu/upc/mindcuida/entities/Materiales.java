package pe.edu.upc.mindcuida.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Materiales")
public class Materiales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMateriales;
    @Column(name = "nombreMateriales",nullable = false,length = 200)
    private String nombreMateriales;
    @ManyToOne
    @JoinColumn(name="usuarioid")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name="tipomaterialtid")
    private TipoMaterial tipoMaterial;

    public Materiales() {
    }

    public Materiales(int idMateriales, String nombreMateriales, Usuario usuario, TipoMaterial tipoMaterial) {
        this.idMateriales = idMateriales;
        this.nombreMateriales = nombreMateriales;
        this.usuario = usuario;
        this.tipoMaterial = tipoMaterial;
    }

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoMaterial getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(TipoMaterial tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
}

