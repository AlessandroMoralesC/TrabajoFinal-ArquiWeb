package pe.edu.upc.mindcuida.dtos;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class UserDTO {
    private Long id;
    private String nombreUsers;
    private String apellidoUsers;
    private LocalDate fechanaciemientoUsers;
    private String telefonoUsers;
    private String correoUsers;
    private String especialidadUsers;
    private String username;
    private String password;
    private Boolean enabled;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getNombreUsers() {
        return nombreUsers;
    }

    public void setNombreUsers(String nombreUsers) {
        this.nombreUsers = nombreUsers;
    }

    public String getApellidoUsers() {
        return apellidoUsers;
    }

    public void setApellidoUsers(String apellidoUsers) {
        this.apellidoUsers = apellidoUsers;
    }

    public LocalDate getFechanaciemientoUsers() {
        return fechanaciemientoUsers;
    }

    public void setFechanaciemientoUsers(LocalDate fechanaciemientoUsers) {
        this.fechanaciemientoUsers = fechanaciemientoUsers;
    }

    public String getTelefonoUsers() {
        return telefonoUsers;
    }

    public void setTelefonoUsers(String telefonoUsers) {
        this.telefonoUsers = telefonoUsers;
    }

    public String getCorreoUsers() {
        return correoUsers;
    }

    public void setCorreoUsers(String correoUsers) {
        this.correoUsers = correoUsers;
    }

    public String getEspecialidadUsers() {
        return especialidadUsers;
    }

    public void setEspecialidadUsers(String especialidadUsers) {
        this.especialidadUsers = especialidadUsers;
    }
}
