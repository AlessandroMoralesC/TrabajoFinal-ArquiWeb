package pe.edu.upc.mindcuida.servicesinterfaces;

import pe.edu.upc.mindcuida.entities.Tratamientos;

import java.util.List;

public interface ITratamientosService {
    public void insert (Tratamientos tratamientos);
    public List<Tratamientos> list();
    public Tratamientos listId(int id);
    public List<String[]> cantidadDeTratamientosPorEfectividad();
    public List<String[]>listaDeTratamientosEnProceso();


}
