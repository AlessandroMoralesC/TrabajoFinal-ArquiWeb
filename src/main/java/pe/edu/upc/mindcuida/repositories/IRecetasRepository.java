package pe.edu.upc.mindcuida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.mindcuida.entities.Recetas;

public interface IRecetasRepository extends JpaRepository<Recetas,Integer> {
}
