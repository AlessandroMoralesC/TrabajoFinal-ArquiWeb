package pe.edu.upc.mindcuida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.mindcuida.entities.Mensajes;

public interface IMensajesRepository extends JpaRepository<Mensajes,Integer> {
}
