package pe.edu.upc.mindcuida.servicesinterfaces;

import pe.edu.upc.mindcuida.entities.Mensajes;

import java.util.List;

public interface IMensajesService {
    public void insert (Mensajes mensajes);
    public List<Mensajes> list();
    public void delete(int id);
    public Mensajes listId(int id);
}
