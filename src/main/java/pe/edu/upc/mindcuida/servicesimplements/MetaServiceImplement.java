package pe.edu.upc.mindcuida.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.mindcuida.entities.Cita;
import pe.edu.upc.mindcuida.entities.Meta;
import pe.edu.upc.mindcuida.repositories.IMetaRepository;
import pe.edu.upc.mindcuida.servicesinterfaces.IMetaService;

import java.util.List;

@Service
public class MetaServiceImplement implements IMetaService {

    @Autowired
    private IMetaRepository meR;
    @Override
    public void insert(Meta meta) {
        meR.save(meta);
    }

    @Override
    public List<Meta> list() {
        return meR.findAll();
    }
    @Override
    public void delete(int id) {
        meR.deleteById(id);
    }

    @Override
    public Meta listId(int id) {
        return meR.findById(id).orElse(new Meta());
    }

    @Override
    public List<String[]> cantidadmetas() {
        return meR.cantidadmetas();
    }

    @Override
    public List<Meta> listMeta(String nombreusuario) {
        return meR.listMeta((nombreusuario));
    }
}
