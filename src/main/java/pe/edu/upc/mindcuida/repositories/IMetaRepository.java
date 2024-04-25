package pe.edu.upc.mindcuida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.mindcuida.entities.Meta;

import java.util.List;

@Repository
public interface IMetaRepository extends JpaRepository<Meta,Integer> {
    @Query(value = "select u.nombre_usuario as Usuario, count(*) as cantidad \n" +
            "from Usuario u inner join Meta m on \n" +
            "u.id_usuario=m.usuarioid \n" +
            "group by u.nombre_usuario", nativeQuery = true)
    public List<String[]> cantidadmetas();

    @Query("from Meta m where m.usuario.nombreUsuario=:nombreusuario")
    public List<Meta> listMeta(@Param("nombreusuario")String nombreusuario);
}
