package pe.edu.upc.mindcuida.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.mindcuida.entities.Cita;
import pe.edu.upc.mindcuida.repositories.ICitaRepository;
import pe.edu.upc.mindcuida.servicesinterfaces.ICitaService;

import java.util.List;

@Service

public class CitaServiceImplement implements ICitaService {
    @Autowired
    public ICitaRepository ciR;

    @Override
    public void insert(Cita cita) {
        ciR.save(cita);
    }

    @Override
    public List<Cita> list(){return ciR.findAll();}
    @Override
    public void delete(int id) {
        ciR.deleteById(id);
    }

    @Override
    public Cita listId(int id) {
        return ciR.findById(id).orElse(new Cita());
    }
}
