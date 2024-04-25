package pe.edu.upc.mindcuida.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.UsuarioDTO;
import pe.edu.upc.mindcuida.entities.Usuario;
import pe.edu.upc.mindcuida.servicesinterfaces.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    public void insertar(@RequestBody UsuarioDTO usuarioDTO) {
        ModelMapper d = new ModelMapper();
        Usuario usuario = d.map(usuarioDTO, Usuario.class);
        String encodedPassword = passwordEncoder.encode(usuario.getContrasenaUsuario());
        usuario.setContrasenaUsuario(encodedPassword);
        uS.insert(usuario);
    }
    @PutMapping
    public void modificar(@RequestBody UsuarioDTO usuarioDTO) {
        ModelMapper d = new ModelMapper();
        Usuario usuario = d.map(usuarioDTO, Usuario.class);
        uS.insert(usuario);
    }
    @GetMapping
    public List<Usuario> listar() {
        return uS.list().stream().map(y->{
                    ModelMapper m=new ModelMapper();
                    return m.map(y,Usuario.class);
                }
        ).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public UsuarioDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        UsuarioDTO dto=m.map(uS.listId(id),UsuarioDTO.class);
        return  dto;
    }
}
