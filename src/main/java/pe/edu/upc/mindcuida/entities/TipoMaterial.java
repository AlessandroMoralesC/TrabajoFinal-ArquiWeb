package pe.edu.upc.mindcuida.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "TipoMaterial")
public class TipoMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTMaterial;
    @Column(name = "temaTMaterial",nullable = false)
    private String temaTMaterial;
    @Column(name = "tipoTMaterial",nullable = false)
    private String tipoTMaterial;
    @Column(name = "linkTMaterial",nullable = false)
    private String linkTMaterial;

    public TipoMaterial() {
    }

    public TipoMaterial(int idTMaterial, String temaTMaterial, String tipoTMaterial, String linkTMaterial) {
        this.idTMaterial = idTMaterial;
        this.temaTMaterial = temaTMaterial;
        this.tipoTMaterial = tipoTMaterial;
        this.linkTMaterial = linkTMaterial;
    }

    public int getIdTMaterial() {
        return idTMaterial;
    }

    public void setIdTMaterial(int idTMaterial) {
        this.idTMaterial = idTMaterial;
    }

    public String getTemaTMaterial() {
        return temaTMaterial;
    }

    public void setTemaTMaterial(String temaTMaterial) {
        this.temaTMaterial = temaTMaterial;
    }

    public String getTipoTMaterial() {
        return tipoTMaterial;
    }

    public void setTipoTMaterial(String tipoTMaterial) {
        this.tipoTMaterial = tipoTMaterial;
    }

    public String getLinkTMaterial() {
        return linkTMaterial;
    }

    public void setLinkTMaterial(String linkTMaterial) {
        this.linkTMaterial = linkTMaterial;
    }
}
