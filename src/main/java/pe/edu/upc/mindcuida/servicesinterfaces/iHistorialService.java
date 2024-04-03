package pe.edu.upc.mindcuida.servicesinterfaces;

import pe.edu.upc.mindcuida.entities.Historial;

import java.util.List;

public interface iHistorialService {
    public void insert(Historial historial);
    public List<Historial> list();
}
