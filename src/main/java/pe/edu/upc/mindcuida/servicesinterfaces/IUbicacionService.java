package pe.edu.upc.mindcuida.servicesinterfaces;

import pe.edu.upc.mindcuida.entities.Ubicacion;

import java.util.List;

public interface IUbicacionService {
    public void insert(Ubicacion ubicacion);
    public List<Ubicacion> list();
}
