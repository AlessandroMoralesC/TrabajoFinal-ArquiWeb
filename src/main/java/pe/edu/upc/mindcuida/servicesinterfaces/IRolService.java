package pe.edu.upc.mindcuida.servicesinterfaces;

import pe.edu.upc.mindcuida.entities.Rol;

import java.util.List;

public interface IRolService {
    public void insert (Rol rol);
    public List<Rol> list();
}
