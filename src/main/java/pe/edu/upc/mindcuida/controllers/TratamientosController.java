package pe.edu.upc.mindcuida.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.TratamientosDTO;
import pe.edu.upc.mindcuida.entities.Tratamientos;
import pe.edu.upc.mindcuida.servicesinterfaces.ITratamientosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("tratamientos")
public class TratamientosController {
    @Autowired
    private ITratamientosService trS;

    @PostMapping
    public void insertar(@RequestBody TratamientosDTO tratamientosDTO) {
        ModelMapper d = new ModelMapper();
        Tratamientos tratamientos = d.map(tratamientosDTO, Tratamientos.class);
        trS.insert(tratamientos);
    }
    @PutMapping
    public void modificar(@RequestBody TratamientosDTO tratamientosDTO) {
        ModelMapper d = new ModelMapper();
        Tratamientos tratamientos = d.map(tratamientosDTO, Tratamientos.class);
        trS.insert(tratamientos);
    }
    @GetMapping
    public List<Tratamientos> listar() {
        return trS.list().stream().map(y->{
                    ModelMapper m=new ModelMapper();
                    return m.map(y,Tratamientos.class);
                }
        ).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public TratamientosDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        TratamientosDTO dto=m.map(trS.listId(id),TratamientosDTO.class);
        return  dto;
    }
}
