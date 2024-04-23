package pe.edu.upc.mindcuida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.mindcuida.entities.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {
}
