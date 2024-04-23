package pe.edu.upc.mindcuida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.mindcuida.entities.TipoMaterial;
@Repository
public interface ITipoMaterialRepository extends JpaRepository<TipoMaterial, Integer> {
}
