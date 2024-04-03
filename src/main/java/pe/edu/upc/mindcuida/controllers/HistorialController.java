package pe.edu.upc.mindcuida.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.HistorialDTO;
import pe.edu.upc.mindcuida.entities.Historial;
import pe.edu.upc.mindcuida.servicesinterfaces.iHistorialService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/historial")
public class HistorialController {
    @Autowired
    private iHistorialService hS;
    @PostMapping
    public void insertar(@RequestBody HistorialDTO historialDTO){
        ModelMapper h=new ModelMapper();
        Historial historial=h.map(historialDTO, Historial.class);
        hS.insert(historial);
    }
    @GetMapping
    public List<HistorialDTO> listar(){
        return hS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,HistorialDTO.class);
        }).collect(Collectors.toList());
    }
}
