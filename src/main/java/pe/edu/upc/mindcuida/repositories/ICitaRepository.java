package pe.edu.upc.mindcuida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.mindcuida.entities.Cita;

public interface ICitaRepository extends JpaRepository<Cita,Integer> {
}
