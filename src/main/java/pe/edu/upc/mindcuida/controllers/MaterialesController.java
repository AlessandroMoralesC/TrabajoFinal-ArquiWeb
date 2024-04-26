package pe.edu.upc.mindcuida.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.MaterialesDTO;
import pe.edu.upc.mindcuida.entities.Materiales;
import pe.edu.upc.mindcuida.servicesinterfaces.IMaterialesService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/materiales")
public class MaterialesController {
    @Autowired
    private IMaterialesService maS;

    @PostMapping
    @PreAuthorize("hasAuthority('psicologo')")
    public void insertar(@RequestBody MaterialesDTO materialesDTO) {
        ModelMapper d = new ModelMapper();
        Materiales materiales = d.map(materialesDTO, Materiales.class);
        maS.insert(materiales);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('psicologo')")
    public void modificar(@RequestBody MaterialesDTO materialesDTO) {
        ModelMapper d = new ModelMapper();
        Materiales materiales = d.map(materialesDTO, Materiales.class);
        maS.insert(materiales);
    }
    @GetMapping
    public List<Materiales> listar() {
        return maS.list().stream().map(y->{
                    ModelMapper m=new ModelMapper();
                    return m.map(y,Materiales.class);
                }
        ).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public MaterialesDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        MaterialesDTO dto=m.map(maS.listId(id),MaterialesDTO.class);
        return  dto;
    }
}
