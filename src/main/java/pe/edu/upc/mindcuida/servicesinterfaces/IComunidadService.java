package pe.edu.upc.mindcuida.servicesinterfaces;

import pe.edu.upc.mindcuida.entities.Cita;
import pe.edu.upc.mindcuida.entities.Comunidad;

import java.util.List;

public interface IComunidadService {
    public void insert (Comunidad comunidad);
    public List<Comunidad> list();
    public Comunidad listId(int id);
    public List<String[]> listaExp();
    public List<String[]> listaRec();
    public void delete(int id);

}
