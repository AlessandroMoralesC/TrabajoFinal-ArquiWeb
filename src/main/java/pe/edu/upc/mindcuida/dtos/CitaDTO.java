package pe.edu.upc.mindcuida.dtos;

import pe.edu.upc.mindcuida.entities.Usuario;

import java.time.LocalDate;
import java.time.LocalTime;

public class CitaDTO {

    private int idCita;
    private LocalDate fechaCita;
    private String motivoCita;
    private LocalTime horaCita;
    private Usuario usuario;

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
