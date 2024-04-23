package pe.edu.upc.mindcuida.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.mindcuida.entities.Usuario;
import pe.edu.upc.mindcuida.repositories.IUsuarioRepository;
import pe.edu.upc.mindcuida.servicesinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;
    @Override
    public void insert(Usuario usuario) {
        uR.save(usuario);

    }
    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public Usuario listId(int id) {
        return uR.findById(id).orElse(new Usuario());
    }
}
