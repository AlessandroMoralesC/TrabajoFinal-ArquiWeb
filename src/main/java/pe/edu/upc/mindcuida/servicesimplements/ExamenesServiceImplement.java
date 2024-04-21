package pe.edu.upc.mindcuida.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.mindcuida.entities.Examenes;
import pe.edu.upc.mindcuida.repositories.IExamenesRepository;
import pe.edu.upc.mindcuida.servicesinterfaces.IExamenesService;

import java.util.List;

@Service
public class ExamenesServiceImplement implements IExamenesService {
    @Autowired
    private IExamenesRepository exR;
    @Override
    public void insert(Examenes examenes) {
        exR.save(examenes);
    }

    @Override
    public List<Examenes> list() {
        return exR.findAll();
    }
    @Override
    public void delete(int id) {
        exR.deleteById(id);
    }

    @Override
    public Examenes listId(int id) {
        return exR.findById(id).orElse(new Examenes());
    }
}
