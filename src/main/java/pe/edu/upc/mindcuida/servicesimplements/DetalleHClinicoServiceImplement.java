package pe.edu.upc.mindcuida.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.mindcuida.entities.DetalleHClinico;
import pe.edu.upc.mindcuida.repositories.IDetalleHClinicoRepository;
import pe.edu.upc.mindcuida.servicesinterfaces.IDetalleHClinicoService;

import java.util.List;
@Service
public class DetalleHClinicoServiceImplement implements IDetalleHClinicoService {
    @Autowired
    public IDetalleHClinicoRepository dhR;

    @Override
    public void insert(DetalleHClinico detalleHClinico) {
        dhR.save(detalleHClinico);
    }

    @Override
    public List<DetalleHClinico> list(){return dhR.findAll();}

    @Override
    public DetalleHClinico listId(int id) {
        return dhR.findById(id).orElse(new DetalleHClinico());
    }
}
