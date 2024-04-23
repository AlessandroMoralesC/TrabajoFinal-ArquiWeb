package pe.edu.upc.mindcuida.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Mensajes")
public class Mensajes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMensaje;
    @Column(name = "mensaje",nullable = false,length = 200)
    private String mensaje;
    @ManyToOne
    @JoinColumn(name="usuarioid")
    private Usuario usuario;

    public Mensajes() {
    }

    public Mensajes(int idMensaje, String mensaje, Usuario usuario) {
        this.idMensaje = idMensaje;
        this.mensaje = mensaje;
        this.usuario = usuario;
    }

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
