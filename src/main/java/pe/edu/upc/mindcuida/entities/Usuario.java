package pe.edu.upc.mindcuida.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "nombreUsuario", nullable = false,length = 50)
    private String nombreUsuario;
    @Column(name = "apellidoUsuario", nullable = false,length = 50)
    private String apellidoUsuario;
    @Column(name = "nacimientoUsuario", nullable = false)
    private LocalDate nacimientoUsuario;
    @Column(name = "telefonoUsuario", nullable = false)
    private int telefonoUsuario;
    @Column(name = "correoUsuario", nullable = false)
    private String correoUsuario;
    @Column(name = "contrasenaUsuario", nullable = false,length = 50)
    private String contrasenaUsuario;
    @Column(name = "especialidadUsuario", nullable = false,length = 50)
    private String especialidadUsuario;

@ManyToOne
@JoinColumn(name="metaid")
    private Meta meta;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String apellidoUsuario, LocalDate nacimientoUsuario, int telefonoUsuario, String correoUsuario, String contrasenaUsuario, String especialidadUsuario, Meta meta) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.nacimientoUsuario = nacimientoUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.correoUsuario = correoUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        this.especialidadUsuario = especialidadUsuario;
        this.meta = meta;
    }

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
