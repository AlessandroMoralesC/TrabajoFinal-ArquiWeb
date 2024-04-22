package pe.edu.upc.mindcuida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.mindcuida.entities.Tratamientos;

public interface ITratamientosRepository extends JpaRepository<Tratamientos,Integer> {
}
