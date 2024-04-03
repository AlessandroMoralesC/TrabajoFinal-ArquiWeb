package pe.edu.upc.mindcuida.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Comunidad")
public class Comunidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdComunidad;
    @Column(name = "experienciasComunidad", nullable = false, length = 200)
    private String experienciasComunidad;
    @Column(name = "aprobacionesComunidad", nullable = false, length = 50)
    private String aprobacionesComunidad;
    @Column(name = "recomendacionesComunidad", nullable = false, length = 50)
    private String recomendacionesComunidad;

    public Comunidad() {
    }

    public Comunidad(int idComunidad, String experienciasComunidad, String aprobacionesComunidad, String recomendacionesComunidad) {
        IdComunidad = idComunidad;
        this.experienciasComunidad = experienciasComunidad;
        this.aprobacionesComunidad = aprobacionesComunidad;
        this.recomendacionesComunidad = recomendacionesComunidad;
    }

    public int getIdComunidad() {
        return IdComunidad;
    }

    public String getExperienciasComunidad() {
        return experienciasComunidad;
    }

    public String getAprobacionesComunidad() {
        return aprobacionesComunidad;
    }

    public String getRecomendacionesComunidad() {
        return recomendacionesComunidad;
    }

    public void setIdComunidad(int idComunidad) {
        IdComunidad = idComunidad;
    }

    public void setExperienciasComunidad(String experienciasComunidad) {
        this.experienciasComunidad = experienciasComunidad;
    }

    public void setAprobacionesComunidad(String aprobacionesComunidad) {
        this.aprobacionesComunidad = aprobacionesComunidad;
    }

    public void setRecomendacionesComunidad(String recomendacionesComunidad) {
        this.recomendacionesComunidad = recomendacionesComunidad;
    }
}
