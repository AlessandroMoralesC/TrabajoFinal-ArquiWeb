package pe.edu.upc.mindcuida.servicesinterfaces;

import pe.edu.upc.mindcuida.entities.Recetas;

import java.util.List;

public interface IRecetasService {
    public void insert (Recetas recetas);
    public List<Recetas> list();
    public Recetas listId(int id);
}
