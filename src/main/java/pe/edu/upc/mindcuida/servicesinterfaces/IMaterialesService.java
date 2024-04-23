package pe.edu.upc.mindcuida.servicesinterfaces;

import pe.edu.upc.mindcuida.entities.Materiales;

import java.util.List;

public interface IMaterialesService {
    public void insert (Materiales materiales);
    public List<Materiales> list();
    public Materiales listId(int id);
}
