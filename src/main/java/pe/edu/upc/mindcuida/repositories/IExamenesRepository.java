package pe.edu.upc.mindcuida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.mindcuida.entities.Examenes;

public interface IExamenesRepository extends JpaRepository<Examenes,Integer> {
}
