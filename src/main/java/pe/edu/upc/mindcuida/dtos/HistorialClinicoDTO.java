package pe.edu.upc.mindcuida.dtos;


import pe.edu.upc.mindcuida.entities.Users;

import java.time.LocalDate;

public class HistorialClinicoDTO {
    private int idHClinico;
    private LocalDate fechaperturaHClinico;
    private Users usuario;

    public int getIdHClinico() {
        return idHClinico;
    }

    public void setIdHClinico(int idHClinico) {
        this.idHClinico = idHClinico;
    }

    public LocalDate getFechaperturaHClinico() {
        return fechaperturaHClinico;
    }

    public void setFechaperturaHClinico(LocalDate fechaperturaHClinico) {
        this.fechaperturaHClinico = fechaperturaHClinico;
    }

    public Users getUsuario() {
        return usuario;
    }

    public void setUsuario(Users usuario) {
        this.usuario = usuario;
    }
}
