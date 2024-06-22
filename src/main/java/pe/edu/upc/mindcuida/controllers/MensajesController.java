package pe.edu.upc.mindcuida.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.MensajesDTO;
import pe.edu.upc.mindcuida.entities.Mensajes;
import pe.edu.upc.mindcuida.servicesinterfaces.IMensajesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mensajes")

public class MensajesController {
    @Autowired
    private IMensajesService mnsS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void insertar(@RequestBody MensajesDTO mensajesDTO) {
        ModelMapper d=new ModelMapper();
        Mensajes mensajes=d.map(mensajesDTO, Mensajes.class);
        mnsS.insert(mensajes);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void modificar(@RequestBody MensajesDTO mensajesDTO) {
        ModelMapper d = new ModelMapper();
        Mensajes mensajes = d.map(mensajesDTO, Mensajes.class);
        mnsS.insert(mensajes);
    }
    @GetMapping
    public List<Mensajes> listar(){
        return mnsS.list().stream().map(y->{
                    ModelMapper m=new ModelMapper();
                    return m.map(y,Mensajes.class);
                }
        ).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        mnsS.delete(id);
    }

    @GetMapping("/{id}")
    public MensajesDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        MensajesDTO dto=m.map(mnsS.listId(id),MensajesDTO.class);
        return  dto;
    }
}
