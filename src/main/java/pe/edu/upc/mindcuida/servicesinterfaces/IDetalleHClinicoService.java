package pe.edu.upc.mindcuida.servicesinterfaces;

import pe.edu.upc.mindcuida.entities.DetalleHClinico;

import java.util.List;

public interface IDetalleHClinicoService {
    public void insert (DetalleHClinico detalleHClinico);
    public List<DetalleHClinico> list();
    public DetalleHClinico listId(int id);
}
