package pe.edu.upc.mindcuida.dtos;


import pe.edu.upc.mindcuida.entities.Usuario;

public class MensajesDTO {

    private int idMensaje;
    private String mensaje;
    private Usuario usuario;

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
