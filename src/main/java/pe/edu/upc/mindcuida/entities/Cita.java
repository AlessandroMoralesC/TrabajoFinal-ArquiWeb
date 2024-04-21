package pe.edu.upc.mindcuida.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

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

    public Cita() {
    }

    public Cita(int idCita, LocalDate fechaCita, String motivoCita) {
        this.idCita = idCita;
        this.fechaCita = fechaCita;
        this.motivoCita = motivoCita;
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
}