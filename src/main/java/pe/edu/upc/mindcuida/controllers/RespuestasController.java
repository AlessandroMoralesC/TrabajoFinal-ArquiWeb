package pe.edu.upc.mindcuida.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.RespuestasDTO;
import pe.edu.upc.mindcuida.dtos.RolDTO;
import pe.edu.upc.mindcuida.entities.Respuestas;
import pe.edu.upc.mindcuida.servicesinterfaces.IRespuestasService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/respuestas")
public class RespuestasController {

    @Autowired
    private IRespuestasService rS;

    @PostMapping
    public void insertar(@RequestBody RespuestasDTO respuestasDTO) {
        ModelMapper d = new ModelMapper();
        Respuestas respuestas= d.map(respuestasDTO,Respuestas.class);
        rS.insert(respuestas);
    }
    @PutMapping
    public void modificar(@RequestBody RespuestasDTO respuestasDTO) {
        ModelMapper d = new ModelMapper();
        Respuestas respuestas= d.map(respuestasDTO,Respuestas.class);
        rS.insert(respuestas);
    }
    @GetMapping
    public List<RespuestasDTO> respuestas(){
        return rS.list().stream().map(y-> {
            ModelMapper m=new ModelMapper();
            return m.map(y,RespuestasDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public RespuestasDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        RespuestasDTO dto=m.map(rS.listId(id),RespuestasDTO.class);
        return  dto;
    }


}
