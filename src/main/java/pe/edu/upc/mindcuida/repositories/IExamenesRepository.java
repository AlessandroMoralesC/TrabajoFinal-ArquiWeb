package pe.edu.upc.mindcuida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.mindcuida.entities.Examenes;

import java.util.List;

@Repository

public interface IExamenesRepository extends JpaRepository<Examenes,Integer> {
    @Query("select e.resultadosExamenes FROM Examenes e where e.idExamenes=:id")
    List<Examenes> buscarResultadoPorId(@Param("id")Integer id);
}
