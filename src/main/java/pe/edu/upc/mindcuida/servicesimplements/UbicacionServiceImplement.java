package pe.edu.upc.mindcuida.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.mindcuida.entities.Ubicacion;
import pe.edu.upc.mindcuida.repositories.IUbicacionRepository;
import pe.edu.upc.mindcuida.servicesinterfaces.IUbicacionService;

import java.util.List;

@Service
public class UbicacionServiceImplement implements IUbicacionService {
    @Autowired
    private IUbicacionRepository mR;
    @Override
    public void insert(Ubicacion ubicacion) {
        mR.save(ubicacion);
    }

    @Override
    public List<Ubicacion> list() {
        return mR.findAll();
    }
}
