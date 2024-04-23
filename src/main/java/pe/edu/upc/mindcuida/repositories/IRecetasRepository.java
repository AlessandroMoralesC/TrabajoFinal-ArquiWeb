package pe.edu.upc.mindcuida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.mindcuida.entities.Recetas;
@Repository
public interface IRecetasRepository extends JpaRepository<Recetas,Integer> {
}
