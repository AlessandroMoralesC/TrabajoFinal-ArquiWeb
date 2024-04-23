package pe.edu.upc.mindcuida.entities;

import jakarta.persistence.*;

import java.sql.Time;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Cita")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCita;
    @Column(name = "fechaCita", nullable = false, length = 50)
    private LocalDate fechaCita;
    @Column(name = "motivoCita", nullable = false, length = 200)
    private String motivoCita;
    @Column(name = "horaCita", nullable = false)
    private LocalTime horaCita;
    @ManyToOne
    @JoinColumn(name="usuarioid")
    private Usuario usuario;

    public Cita() {
    }

    public Cita(int idCita, LocalDate fechaCita, String motivoCita, LocalTime horaCita, Usuario usuario) {
        this.idCita = idCita;
        this.fechaCita = fechaCita;
        this.motivoCita = motivoCita;
        this.horaCita = horaCita;
        this.usuario = usuario;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getMotivoCita() {
        return motivoCita;
    }

    public void setMotivoCita(String motivoCita) {
        this.motivoCita = motivoCita;
    }

    public LocalTime getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(LocalTime horaCita) {
        this.horaCita = horaCita;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}