package pe.edu.upc.mindcuida.dtos;


import pe.edu.upc.mindcuida.entities.Cita;

import java.time.LocalDate;

public class HorarioMedicoDTO {
    private int idHMedico;
    private LocalDate fechaHMedico;
    private String estadoHMedico;
    private Cita cita;

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
