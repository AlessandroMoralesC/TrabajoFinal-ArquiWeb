package pe.edu.upc.mindcuida.servicesinterfaces;

import pe.edu.upc.mindcuida.entities.HistorialClinico;

import java.util.List;

public interface IHistorialClinicoService {
    public void insert (HistorialClinico historialClinico);
    public List<HistorialClinico> list();
    public HistorialClinico listId(int id);
    public void delete(int id);
}
