package pe.edu.upc.mindcuida.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "HorarioMedico")
public class HorarioMedico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHMedico;
    @Column(name = "fechaHMedico",nullable = false)
    private LocalDate fechaHMedico;
    @Column(name = "estadoHMedico",nullable = false,length = 200)
    private String estadoHMedico;
    @ManyToOne
    @JoinColumn(name="citaid")
    private Cita cita;

    public HorarioMedico() {
    }

    public HorarioMedico(int idHMedico, LocalDate fechaHMedico, String estadoHMedico, Cita cita) {
        this.idHMedico = idHMedico;
        this.fechaHMedico = fechaHMedico;
        this.estadoHMedico = estadoHMedico;
        this.cita = cita;
    }

    public int getIdHMedico() {
        return idHMedico;
    }

    public void setIdHMedico(int idHMedico) {
        this.idHMedico = idHMedico;
    }

    public LocalDate getFechaHMedico() {
        return fechaHMedico;
    }

    public void setFechaHMedico(LocalDate fechaHMedico) {
        this.fechaHMedico = fechaHMedico;
    }

    public String getEstadoHMedico() {
        return estadoHMedico;
    }

    public void setEstadoHMedico(String estadoHMedico) {
        this.estadoHMedico = estadoHMedico;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }
}
