package pe.edu.upc.mindcuida.servicesimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.mindcuida.entities.Recetas;
import pe.edu.upc.mindcuida.repositories.IRecetasRepository;
import pe.edu.upc.mindcuida.servicesinterfaces.IRecetasService;

import java.util.List;

@Service
public class RecetasServiceImplement implements IRecetasService {
    @Autowired
    private IRecetasRepository resR;

    @Override
    public void insert(Recetas recetas) {
        resR.save(recetas);
    }

    @Override
    public List<Recetas> list() {
        return resR.findAll();
    }

    @Override
    public Recetas listId(int id) {
        return resR.findById(id).orElse(new Recetas());
    }
}
