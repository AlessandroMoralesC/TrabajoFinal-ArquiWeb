package pe.edu.upc.mindcuida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.mindcuida.entities.Meta;

import java.util.List;

@Repository
public interface IMetaRepository extends JpaRepository<Meta,Integer> {

    @Query(value = "select u.username as Usuario, count(*) as cantidad \n" +
            "from Users u inner join Meta m on \n" +
            "u.id=m.usuarioid \n" +
            "group by u.username",nativeQuery = true)
    public List<String[]> cantidametas();

    @Query("from Meta m where m.usuario.username=:nombreusuario")
    public List<Meta> listMeta(@Param("nombreusuario")String nombreusuario);

}
