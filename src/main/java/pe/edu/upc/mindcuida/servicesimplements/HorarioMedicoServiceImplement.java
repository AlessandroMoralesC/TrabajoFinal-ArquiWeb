package pe.edu.upc.mindcuida.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.mindcuida.entities.HorarioMedico;
import pe.edu.upc.mindcuida.repositories.IHorarioMedicoRepository;
import pe.edu.upc.mindcuida.servicesinterfaces.IHorarioMedicoService;

import java.util.List;

@Service
public class HorarioMedicoServiceImplement implements IHorarioMedicoService {
    @Autowired
    private IHorarioMedicoRepository hmR;
    @Override
    public void insert(HorarioMedico horarioMedico) {
        hmR.save(horarioMedico);
    }
    @Override
    public void delete(int id) {
        hmR.deleteById(id);
    }
    @Override
    public List<HorarioMedico> list() {
        return hmR.findAll();
    }

    @Override
    public HorarioMedico listId(int id) {
        return hmR.findById(id).orElse(new HorarioMedico());
    }
}
