package pe.edu.upc.mindcuida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.mindcuida.entities.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {
    public Usuario findByUsername(String username);

    //BUSCAR POR NOMBRE
    @Query("select count(u.nombreUsuario) from Usuario u where u.nombreUsuario =:username")
    public int buscarUsername(@Param("nombreUsuario") String nombre);


    //INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "insert into roles (Rol, idUsuario) VALUES (:Rol, :idUsuario)", nativeQuery = true)
    public void insRol(@Param("Rol") String authority, @Param("idUsuario") Long user_id);
}
