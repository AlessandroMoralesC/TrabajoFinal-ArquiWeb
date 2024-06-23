package pe.edu.upc.mindcuida.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.HistorialClinicoDTO;
import pe.edu.upc.mindcuida.entities.HistorialClinico;
import pe.edu.upc.mindcuida.servicesinterfaces.IHistorialClinicoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/historialclinico")
public class HistorialClinicoController {
    @Autowired
    private IHistorialClinicoService hcS;

    @PostMapping
    @PreAuthorize("hasAuthority('PSICOLOGO') or hasAuthority('ADMINISTRADOR')")
    public void insertar(@RequestBody HistorialClinicoDTO historialClinicoDTO) {
        ModelMapper d = new ModelMapper();
        HistorialClinico historialClinico = d.map(historialClinicoDTO, HistorialClinico.class);
        hcS.insert(historialClinico);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('PSICOLOGO') or hasAuthority('ADMINISTRADOR')")
    public void modificar(@RequestBody HistorialClinicoDTO historialClinicoDTO) {
        ModelMapper d = new ModelMapper();
        HistorialClinico historialClinico = d.map(historialClinicoDTO, HistorialClinico.class);
        hcS.insert(historialClinico);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('PSICOLOGO') or hasAuthority('ADMINISTRADOR')")

    public List<HistorialClinico> listar() {
        return hcS.list().stream().map(y->{
                    ModelMapper m=new ModelMapper();
                    return m.map(y,HistorialClinico.class);
                }
        ).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('PSICOLOGO') or hasAuthority('ADMINISTRADOR')")

    public void eliminar(@PathVariable("id") Integer id){
        hcS.delete(id);
    }

    @GetMapping("/{id}")

    public HistorialClinicoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        HistorialClinicoDTO dto=m.map(hcS.listId(id),HistorialClinicoDTO.class);
        return  dto;
    }
}
