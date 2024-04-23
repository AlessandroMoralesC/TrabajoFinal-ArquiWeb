package pe.edu.upc.mindcuida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.mindcuida.entities.Tratamientos;

import java.util.List;

@Repository
public interface ITratamientosRepository extends JpaRepository<Tratamientos,Integer> {

    @Query(value = "SELECT nombre_tratamientos, COUNT(*) AS cantidad_repetidos \n" +
            "FROM tratamientos \n" +
            "GROUP BY nombre_tratamientos; ",nativeQuery = true)
    public List<String[]>cantidadDeTratamiento();
}
