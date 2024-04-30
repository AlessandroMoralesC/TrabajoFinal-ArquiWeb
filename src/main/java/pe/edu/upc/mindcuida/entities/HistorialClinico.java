package pe.edu.upc.mindcuida.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "HistorialClinico")
public class HistorialClinico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHClinico;
    @Column(name = "fechaHMedico",nullable = false)
    private LocalDate fechaperturaHClinico;
    @ManyToOne
    @JoinColumn(name="usuarioid")
    private Users usuario;

    public HistorialClinico() {
    }

    public HistorialClinico(int idHClinico, LocalDate fechaperturaHClinico, Users usuario) {
        this.idHClinico = idHClinico;
        this.fechaperturaHClinico = fechaperturaHClinico;
        this.usuario = usuario;
    }

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
