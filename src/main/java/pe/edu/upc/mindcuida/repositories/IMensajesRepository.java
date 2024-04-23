package pe.edu.upc.mindcuida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.mindcuida.entities.Mensajes;
@Repository
public interface IMensajesRepository extends JpaRepository<Mensajes,Integer> {
}
