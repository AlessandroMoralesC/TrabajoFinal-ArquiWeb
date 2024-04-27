package pe.edu.upc.mindcuida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.mindcuida.entities.Comunidad;

@Repository
public interface IComunidadRepository extends JpaRepository<Comunidad,Integer> {
      @Query(value = "SELECT experiencias_comunidad\n" +
            "FROM comunidad\n" +
            "WHERE experiencias_comunidad IS NOT NULL;", nativeQuery = true)
    List<String[]> identificaExp();

    @Query(value = "SELECT recomendaciones_comunidad\n" +
            "FROM comunidad\n" +
            "WHERE recomendaciones_comunidad IS NOT NULL;", nativeQuery = true)
    List<String[]> identificaRec();
}
