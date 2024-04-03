package pe.edu.upc.mindcuida.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
}
