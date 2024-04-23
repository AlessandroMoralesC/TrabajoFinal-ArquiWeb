package pe.edu.upc.mindcuida.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.mindcuida.entities.Rol;
import pe.edu.upc.mindcuida.repositories.IRolRepository;
import pe.edu.upc.mindcuida.servicesinterfaces.IRolService;

import java.util.List;

@Service
public class RolServiceImplement implements IRolService {
    @Autowired
    private IRolRepository roR;
    @Override
    public void insert(Rol rol) {
        roR.save(rol);

    }
    @Override
    public List<Rol> list() {
        return roR.findAll();
    }
    @Override
    public Rol listId(int id) {
        return roR.findById(id).orElse(new Rol());
    }
}
