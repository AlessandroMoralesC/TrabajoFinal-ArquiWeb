package pe.edu.upc.mindcuida.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.mindcuida.entities.Comunidad;
import pe.edu.upc.mindcuida.repositories.IComunidadRepository;
import pe.edu.upc.mindcuida.servicesinterfaces.IComunidadService;

import java.util.List;

@Service
public class ComunidadServiceImplement implements IComunidadService {
    @Autowired
    public IComunidadRepository cR;

    @Override
    public void insert(Comunidad comunidad) {
        cR.save(comunidad);
    }

    @Override
    public List<Comunidad> list(){return cR.findAll();}

}
