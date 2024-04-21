package pe.edu.upc.mindcuida.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.RecetasDTO;
import pe.edu.upc.mindcuida.entities.Recetas;
import pe.edu.upc.mindcuida.servicesinterfaces.IRecetasService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/recetas")
public class RecetasController {
    @Autowired
    private IRecetasService resS;

    @PostMapping
    public void insertar(@RequestBody RecetasDTO recetasDTO) {
        ModelMapper d=new ModelMapper();
        Recetas recetas=d.map(recetasDTO,Recetas.class);
        resS.insert(recetas);
    }
    @PutMapping
    public void modificar(@RequestBody RecetasDTO recetasDTO) {
        ModelMapper d = new ModelMapper();
        Recetas recetas = d.map(recetasDTO, Recetas.class);
        resS.insert(recetas);
    }
    @GetMapping
    public List<Recetas> listar(){
        return resS.list().stream().map(y->{
                    ModelMapper m=new ModelMapper();
                    return m.map(y,Recetas.class);
                }
        ).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        resS.delete(id);
    }

    @GetMapping("/{id}")
    public RecetasDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        RecetasDTO dto=m.map(resS.listId(id),RecetasDTO.class);
        return  dto;
    }
}
