package pe.edu.upc.mindcuida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.mindcuida.entities.Tratamientos;

import java.util.List;

@Repository
public interface ITratamientosRepository extends JpaRepository<Tratamientos,Integer> {

    @Query(value = " SELECT nombre_tratamientos, efectividad_tratamientos AS efectividad, COUNT(*) AS cantidad \n" +
            "FROM tratamientos \n" +
            "WHERE efectividad_tratamientos = 'efectiva' \n" +
            "GROUP BY nombre_tratamientos, efectividad_tratamientos; ",nativeQuery = true)
    public List<String[]>cantidadDeTratamientosPorEfectividad();
    @Query(value = " SELECT nombre_tratamientos, estado_tratamientos \n" +
            "FROM tratamientos \n" +
            "WHERE estado_tratamientos = 'proceso'; ",nativeQuery = true)
    public List<String[]>listaDeTratamientosEnProceso();

}
