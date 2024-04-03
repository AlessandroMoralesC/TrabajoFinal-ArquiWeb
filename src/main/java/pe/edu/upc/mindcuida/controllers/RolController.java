package pe.edu.upc.mindcuida.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.RolDTO;
import pe.edu.upc.mindcuida.entities.Rol;
import pe.edu.upc.mindcuida.servicesinterfaces.IRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("roles")
public class RolController {
    @Autowired
    private IRolService roS;

    @PostMapping
    public void insertar(@RequestBody RolDTO rolDTO) {
        ModelMapper d = new ModelMapper();
        Rol rol = d.map(rolDTO, Rol.class);
        roS.insert(rol);
    }

    @GetMapping
    public List<Rol> listar() {
    return roS.list().stream().map(y->{
        ModelMapper m=new ModelMapper();
        return m.map(y,Rol.class);
    }
    ).collect(Collectors.toList());
    }


}
