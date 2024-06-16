package pe.edu.upc.mindcuida.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.DetalleHClinicoDTO;
import pe.edu.upc.mindcuida.entities.DetalleHClinico;
import pe.edu.upc.mindcuida.servicesinterfaces.IDetalleHClinicoService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/detalleclinico")
public class DetalleHClinicoController {
    @Autowired
    private IDetalleHClinicoService dhS;

    @PostMapping
    @PreAuthorize("hasAuthority('PSICOLOGO')")
    public void insertar(@RequestBody DetalleHClinicoDTO detalleHClinicoDTO) {
        ModelMapper d = new ModelMapper();
        DetalleHClinico detalleHClinico = d.map(detalleHClinicoDTO, DetalleHClinico.class);
        dhS.insert(detalleHClinico);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('PSICOLOGO')")
    public void modificar(@RequestBody DetalleHClinicoDTO detalleHClinicoDTO) {
        ModelMapper d = new ModelMapper();
        DetalleHClinico detalleHClinico = d.map(detalleHClinicoDTO, DetalleHClinico.class);
        dhS.insert(detalleHClinico);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('PSICOLOGO')")
    public List<DetalleHClinico> listar() {
        return dhS.list().stream().map(y->{
                    ModelMapper m=new ModelMapper();
                    return m.map(y,DetalleHClinico.class);
                }
        ).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public DetalleHClinicoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        DetalleHClinicoDTO dto=m.map(dhS.listId(id),DetalleHClinicoDTO.class);
        return  dto;
    }
}
