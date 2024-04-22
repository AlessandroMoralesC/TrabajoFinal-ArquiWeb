package pe.edu.upc.mindcuida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.mindcuida.entities.TipoMaterial;

public interface ITipoMaterialRepository extends JpaRepository<TipoMaterial, Integer> {
}
