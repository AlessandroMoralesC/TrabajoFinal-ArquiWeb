package pe.edu.upc.mindcuida.dtos;


import pe.edu.upc.mindcuida.entities.Users;

public class MensajesDTO {

    private int idMensaje;
    private String mensaje;
    private Users usuario;

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

    public Users getUsuario() {
        return usuario;
    }

    public void setUsuario(Users usuario) {
        this.usuario = usuario;
    }
}
