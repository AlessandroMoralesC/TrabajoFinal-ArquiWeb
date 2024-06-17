package pe.edu.upc.mindcuida.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.mindcuida.entities.Tratamientos;
import pe.edu.upc.mindcuida.repositories.ITratamientosRepository;
import pe.edu.upc.mindcuida.servicesinterfaces.ITratamientosService;

import java.util.List;

@Service

public class TratamientosServiceImplement implements ITratamientosService {
    @Autowired
    private ITratamientosRepository trR;
    @Override
    public void insert(Tratamientos tratamientos) {
        trR.save(tratamientos);

    }
    @Override
    public void delete(int id) {
        trR.deleteById(id);
    }
    @Override
    public List<Tratamientos> list() {
        return trR.findAll();
    }

    @Override
    public Tratamientos listId(int id) {
        return trR.findById(id).orElse(new Tratamientos());
    }

    @Override
    public List<String[]> cantidadDeTratamientosPorEfectividad() {
        return trR.cantidadDeTratamientosPorEfectividad();
    }

    @Override
    public List<String[]> listaDeTratamientosEnProceso() {
        return trR.listaDeTratamientosEnProceso();
    }
}
