package pe.edu.upc.mindcuida.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.mindcuida.entities.Historial;
import pe.edu.upc.mindcuida.repositories.iHistorialRepository;
import pe.edu.upc.mindcuida.servicesinterfaces.iHistorialService;

import java.util.List;

@Service
public class HistorialServiceImplement implements iHistorialService {
    @Autowired
    private iHistorialRepository hR;
    @Override
    public void insert (Historial historial) {hR.save(historial);}
    @Override
    public List<Historial> list() {return hR.findAll();}
}
