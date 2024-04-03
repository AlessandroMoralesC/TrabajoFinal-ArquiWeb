package pe.edu.upc.mindcuida.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Ubicacion")
public class Ubicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLocation;

    @Column(name = "pais", nullable = false, length = 25)
    private String pais;
    @Column(name = "departamento", nullable = false, length = 30)
    private String departamento;
    @Column(name = "ciudad", nullable = false, length = 25)
    private String ciudad;

    public Ubicacion() {
    }

    public Ubicacion(int idLocation, String pais, String departamento, String ciudad) {
        this.idLocation = idLocation;
        this.pais = pais;
        this.departamento = departamento;
        this.ciudad = ciudad;
    }

    public int getIdUbicacion() {
        return idLocation;
    }

    public void setIdUbicacion(int idLocation) {
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
