package pe.edu.upc.mindcuida.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.TipoMaterialDTO;
import pe.edu.upc.mindcuida.entities.TipoMaterial;
import pe.edu.upc.mindcuida.servicesinterfaces.ITipoMaterialService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipomaterial")
public class TipoMaterialController {
    @Autowired
    private ITipoMaterialService tmS;

    @PostMapping
    public void insertar(@RequestBody TipoMaterialDTO tipoMaterialDTO) {
        ModelMapper d = new ModelMapper();
        TipoMaterial tipoMaterial= d.map(tipoMaterialDTO,TipoMaterial.class);
        tmS.insert(tipoMaterial);
    }
    @PutMapping
    public void modificar(@RequestBody TipoMaterialDTO tipoMaterialDTO) {
        ModelMapper d = new ModelMapper();
        TipoMaterial tipoMaterial = d.map(tipoMaterialDTO, TipoMaterial.class);
        tmS.insert(tipoMaterial);
    }
    @GetMapping
    public List<TipoMaterialDTO> respuestas(){
        return tmS.list().stream().map(y-> {
            ModelMapper m=new ModelMapper();
            return m.map(y,TipoMaterialDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tmS.delete(id);
    }

    @GetMapping("/{id}")
    public TipoMaterialDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        TipoMaterialDTO dto=m.map(tmS.listId(id),TipoMaterialDTO.class);
        return  dto;
    }
}