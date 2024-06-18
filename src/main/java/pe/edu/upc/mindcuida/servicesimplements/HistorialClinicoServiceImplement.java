package pe.edu.upc.mindcuida.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.mindcuida.entities.HistorialClinico;
import pe.edu.upc.mindcuida.repositories.IHistorialClinicoRepository;
import pe.edu.upc.mindcuida.servicesinterfaces.IHistorialClinicoService;

import java.util.List;

@Service
public class HistorialClinicoServiceImplement implements IHistorialClinicoService {
    @Autowired
    private IHistorialClinicoRepository hcR;
    @Override
    public void insert(HistorialClinico historialClinico) {
        hcR.save(historialClinico);

    }
    @Override
    public List<HistorialClinico> list() {
        return hcR.findAll();
    }

    @Override
    public HistorialClinico listId(int id) {
        return hcR.findById(id).orElse(new HistorialClinico());
    }

    @Override
    public void delete(int id) {
        hcR.deleteById(id);
    }
}
