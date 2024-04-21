package pe.edu.upc.mindcuida.servicesinterfaces;

import pe.edu.upc.mindcuida.entities.Examenes;

import java.util.List;

public interface IExamenesService {
    public void insert (Examenes examenes);
    public List<Examenes> list();
    public void delete(int id);
    public Examenes listId(int id);
}
