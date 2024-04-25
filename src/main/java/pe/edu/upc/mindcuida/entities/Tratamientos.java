package pe.edu.upc.mindcuida.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Tratamientos")
public class Tratamientos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTratamientos;
    @Column(name = "nombreTratamientos", nullable = false,length = 50)
    private String nombreTratamientos;
    @Column(name = "fechainicioTratamientos", nullable = false)

    private LocalDate fechainicioTratamientos;
    @Column(name = "fechafinTratamientos", nullable = false)

    private LocalDate fechafinTratamientos;
    @Column(name = "estadoTratamientos", nullable = false,length = 50)
    private String estadoTratamientos;
    @Column(name = "descripcionTratamientos", nullable = false)

    private String descripcionTratamientos;

    public Tratamientos() {
    }

    public Tratamientos(int idTratamientos, String nombreTratamientos, LocalDate fechainicioTratamientos, LocalDate fechafinTratamientos, String estadoTratamientos, String descripcionTratamientos) {
        this.idTratamientos = idTratamientos;
        this.nombreTratamientos = nombreTratamientos;
        this.fechainicioTratamientos = fechainicioTratamientos;
        this.fechafinTratamientos = fechafinTratamientos;
        this.estadoTratamientos = estadoTratamientos;
        this.descripcionTratamientos = descripcionTratamientos;
    }

    public int getIdTratamientos() {
        return idTratamientos;
    }

    public void setIdTratamientos(int idTratamientos) {
        this.idTratamientos = idTratamientos;
    }

    public String getNombreTratamientos() {
        return nombreTratamientos;
    }

    public void setNombreTratamientos(String nombreTratamientos) {
        this.nombreTratamientos = nombreTratamientos;
    }

    public LocalDate getFechainicioTratamientos() {
        return fechainicioTratamientos;
    }

    public void setFechainicioTratamientos(LocalDate fechainicioTratamientos) {
        this.fechainicioTratamientos = fechainicioTratamientos;
    }

    public LocalDate getFechafinTratamientos() {
        return fechafinTratamientos;
    }

    public void setFechafinTratamientos(LocalDate fechafinTratamientos) {
        this.fechafinTratamientos = fechafinTratamientos;
    }

    public String getEstadoTratamientos() {
        return estadoTratamientos;
    }

    public void setEstadoTratamientos(String estadoTratamientos) {
        this.estadoTratamientos = estadoTratamientos;
    }

    public String getDescripcionTratamientos() {
        return descripcionTratamientos;
    }

    public void setDescripcionTratamientos(String descripcionTratamientos) {
        this.descripcionTratamientos = descripcionTratamientos;
    }
}
