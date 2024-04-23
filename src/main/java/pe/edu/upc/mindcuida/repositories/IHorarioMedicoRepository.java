package pe.edu.upc.mindcuida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.mindcuida.entities.HorarioMedico;
@Repository
public interface IHorarioMedicoRepository extends JpaRepository<HorarioMedico,Integer> {
}
