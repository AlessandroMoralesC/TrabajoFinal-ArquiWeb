package pe.edu.upc.mindcuida.dtos;


import pe.edu.upc.mindcuida.entities.Meta;

import java.time.LocalDate;

public class UsuarioDTO {
    private int idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private LocalDate nacimientoUsuario;
    private int telefonoUsuario;
    private String correoUsuario;
    private String contrasenaUsuario;
    private String especialidadUsuario;
    private Meta meta;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public LocalDate getNacimientoUsuario() {
        return nacimientoUsuario;
    }

    public void setNacimientoUsuario(LocalDate nacimientoUsuario) {
        this.nacimientoUsuario = nacimientoUsuario;
    }

    public int getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(int telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

    public String getEspecialidadUsuario() {
        return especialidadUsuario;
    }

    public void setEspecialidadUsuario(String especialidadUsuario) {
        this.especialidadUsuario = especialidadUsuario;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
