package pe.edu.upc.mindcuida.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombreUsers",nullable = false,length = 200)
    private String nombreUsers;
    @Column(name = "apellidoUsers",nullable = false,length = 200)
    private String apellidoUsers;
    @Column(name = "fechanacimientoUsers",nullable = false)
    private LocalDate fechanaciemientoUsers;
    @Column(name = "telefonoUsers",nullable = false,length = 11)
    private String telefonoUsers;
    @Column(name = "correoUsers",nullable = false,length = 200)
    private String correoUsers;
    @Column(name = "especialidadUsers",nullable = true,length = 200)
    private String especialidadUsers;

    @Column(length = 30, unique = true)
    private String username;
    @Column(length = 200)
    private String password;


    private Boolean enabled;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Role> roles;

    public Users() {
    }

    public Users(Long id, String nombreUsers, String apellidoUsers, LocalDate fechanaciemientoUsers, String telefonoUsers, String correoUsers, String especialidadUsers, List<Role> roles) {
        this.id = id;
        this.nombreUsers = nombreUsers;
        this.apellidoUsers = apellidoUsers;
        this.fechanaciemientoUsers = fechanaciemientoUsers;
        this.telefonoUsers = telefonoUsers;
        this.correoUsers = correoUsers;
        this.especialidadUsers = especialidadUsers;
        this.roles = roles;
    }

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

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
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