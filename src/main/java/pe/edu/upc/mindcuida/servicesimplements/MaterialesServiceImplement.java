package pe.edu.upc.mindcuida.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.mindcuida.entities.Materiales;
import pe.edu.upc.mindcuida.repositories.IMaterialesRepository;
import pe.edu.upc.mindcuida.servicesinterfaces.IMaterialesService;

import java.util.List;
@Service
public class MaterialesServiceImplement implements IMaterialesService {
    @Autowired
    private IMaterialesRepository maR;
    @Override
    public void insert(Materiales materiales) {
        maR.save(materiales);

    }
    @Override
    public List<Materiales> list() {
        return maR.findAll();
    }

    @Override
    public Materiales listId(int id) {
        return maR.findById(id).orElse(new Materiales());
    }
}
