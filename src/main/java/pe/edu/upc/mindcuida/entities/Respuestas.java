package pe.edu.upc.mindcuida.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Respuestas")
public class Respuestas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRespuesta;

    @Column(name = "pregunta",nullable = false,length = 200)
    private String pregunta;
    @Column(name = "respuestas",nullable = false,length = 200)
    private String respuestas;
    @ManyToOne
    @JoinColumn(name="usuarioid")
    private Users usuario;

    public Respuestas() {
    }

    public Respuestas(int idRespuesta, String pregunta, String respuestas, Users usuario) {
        this.idRespuesta = idRespuesta;
        this.pregunta = pregunta;
        this.respuestas = respuestas;
        this.usuario = usuario;
    }

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(String respuestas) {
        this.respuestas = respuestas;
    }

    public Users getUsuario() {
        return usuario;
    }

    public void setUsuario(Users usuario) {
        this.usuario = usuario;
    }
}
