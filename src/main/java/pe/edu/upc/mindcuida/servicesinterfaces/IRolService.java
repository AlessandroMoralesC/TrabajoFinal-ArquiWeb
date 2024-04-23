package pe.edu.upc.mindcuida.servicesinterfaces;

import pe.edu.upc.mindcuida.entities.Rol;
import pe.edu.upc.mindcuida.entities.TipoMaterial;

import java.util.List;

public interface IRolService {
    public void insert (Rol rol);
    public List<Rol> list();
    public Rol listId(int id);
}
