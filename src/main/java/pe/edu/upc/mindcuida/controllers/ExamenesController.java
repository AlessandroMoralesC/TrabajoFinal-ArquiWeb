package pe.edu.upc.mindcuida.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.ExamenesDTO;
import pe.edu.upc.mindcuida.entities.Examenes;
import pe.edu.upc.mindcuida.servicesinterfaces.IExamenesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/examan")
public class ExamenesController {
    @Autowired
    private IExamenesService exS;

    @PostMapping
    public void insertar(@RequestBody ExamenesDTO examenesDTO) {
        ModelMapper d = new ModelMapper();
        Examenes examenes = d.map(examenesDTO, Examenes.class);
        exS.insert(examenes);
    }

    @GetMapping
    public List<Examenes> listar() {
        return exS.list().stream().map(y -> {
                    ModelMapper c = new ModelMapper();
                    return c.map(y, Examenes.class);
                }
        ).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ExamenesDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        ExamenesDTO dto=m.map(exS.listId(id),ExamenesDTO.class);
        return  dto;
    }
}
