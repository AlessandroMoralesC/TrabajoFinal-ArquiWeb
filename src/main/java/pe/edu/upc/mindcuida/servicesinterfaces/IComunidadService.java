package pe.edu.upc.mindcuida.servicesinterfaces;

import pe.edu.upc.mindcuida.entities.Comunidad;

import java.util.List;

public interface IComunidadService {
    public void insert (Comunidad comunidad);
    public List<Comunidad> list();
}
