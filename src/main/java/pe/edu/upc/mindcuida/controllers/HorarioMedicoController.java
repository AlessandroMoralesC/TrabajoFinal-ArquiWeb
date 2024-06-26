package pe.edu.upc.mindcuida.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.HorarioMedicoDTO;
import pe.edu.upc.mindcuida.entities.HorarioMedico;
import pe.edu.upc.mindcuida.servicesinterfaces.IHorarioMedicoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/horariomedico")
public class HorarioMedicoController {
    @Autowired
    private IHorarioMedicoService hmS;

    @PostMapping
    @PreAuthorize("hasAuthority('PSICOLOGO') or hasAuthority('ADMINISTRADOR')")
    public void insertar(@RequestBody HorarioMedicoDTO horarioMedicoDTO) {
        ModelMapper d = new ModelMapper();
        HorarioMedico horarioMedico = d.map(horarioMedicoDTO, HorarioMedico.class);
        hmS.insert(horarioMedico);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('PSICOLOGO') or hasAuthority('ADMINISTRADOR')")
    public void modificar(@RequestBody HorarioMedicoDTO horarioMedicoDTO) {
        ModelMapper d = new ModelMapper();
        HorarioMedico horarioMedico = d.map(horarioMedicoDTO, HorarioMedico.class);
        hmS.insert(horarioMedico);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('PSICOLOGO') or hasAuthority('ADMINISTRADOR')")

    public List<HorarioMedico> listar() {
        return hmS.list().stream().map(y->{
                    ModelMapper m=new ModelMapper();
                    return m.map(y,HorarioMedico.class);
                }
        ).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public HorarioMedicoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        HorarioMedicoDTO dto=m.map(hmS.listId(id),HorarioMedicoDTO.class);
        return  dto;
    }

    @DeleteMapping("/{id}")

    @PreAuthorize("hasAuthority('PSICOLOGO') or hasAuthority('ADMINISTRADOR')")
    public void eliminar(@PathVariable("id") Integer id){
        hmS.delete(id);
    }
}
