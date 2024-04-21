package pe.edu.upc.mindcuida.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.mindcuida.entities.Mensajes;
import pe.edu.upc.mindcuida.repositories.IMensajesRepository;
import pe.edu.upc.mindcuida.servicesinterfaces.IMensajesService;

import java.util.List;

@Service
public class IMensajesServiceImplement implements IMensajesService {
    @Autowired
    private IMensajesRepository mnsR;
    @Override
    public void insert(Mensajes mensajes) {
        mnsR.save(mensajes);
    }

    @Override
    public List<Mensajes> list() {
        return mnsR.findAll();
    }
    @Override
    public void delete(int id) {
        mnsR.deleteById(id);
    }

    @Override
    public Mensajes listId(int id) {
        return mnsR.findById(id).orElse(new Mensajes());
    }
}
