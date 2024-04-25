package pe.edu.upc.mindcuida.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.mindcuida.entities.Respuestas;
import pe.edu.upc.mindcuida.repositories.IRespuestasRepository;
import pe.edu.upc.mindcuida.servicesinterfaces.IRespuestasService;

import java.util.List;

@Service
public class RespuestasServiceImplement implements IRespuestasService {
    @Autowired
    private IRespuestasRepository rR;

    @Override
    public void insert(Respuestas respuestas) {
        rR.save(respuestas);
    }

    @Override
    public List<Respuestas> list() {
        return rR.findAll();
    }
    @Override
    public Respuestas listId(int id) {
        return rR.findById(id).orElse(new Respuestas());
    }
}
