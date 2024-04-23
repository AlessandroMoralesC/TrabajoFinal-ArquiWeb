package pe.edu.upc.mindcuida.servicesinterfaces;


import pe.edu.upc.mindcuida.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert (Usuario Usuario);
    public List<Usuario> list();
    public Usuario listId(int id);
}
