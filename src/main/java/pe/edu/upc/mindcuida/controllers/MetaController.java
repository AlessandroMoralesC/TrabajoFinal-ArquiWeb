package pe.edu.upc.mindcuida.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.CantidadMetasDTO;
import pe.edu.upc.mindcuida.dtos.MetaDTO;
import pe.edu.upc.mindcuida.entities.Meta;
import pe.edu.upc.mindcuida.servicesinterfaces.IMetaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/metas")
public class MetaController {
    @Autowired
    private IMetaService meS;

    @PostMapping
    public void insertar(@RequestBody MetaDTO metaDTO) {
        ModelMapper d=new ModelMapper();
        Meta meta=d.map(metaDTO,Meta.class);
        meS.insert(meta);
    }
    @PutMapping
    public void modificar(@RequestBody MetaDTO metaDTO) {
        ModelMapper d = new ModelMapper();
        Meta meta = d.map(metaDTO, Meta.class);
        meS.insert(meta);
    }
    @GetMapping
    public List<Meta> listar(){
    return meS.list().stream().map(y->{
        ModelMapper m=new ModelMapper();
        return m.map(y,Meta.class);
    }
    ).collect(Collectors.toList());

    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        meS.delete(id);
    }

    @GetMapping("/{id}")
    public MetaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        MetaDTO dto=m.map(meS.listId(id),MetaDTO.class);
        return  dto;
    }

    @GetMapping("/cantidademetas")
    public List<CantidadMetasDTO> cantidadMetasUsuarios() {
        List<String[]> filaLista = meS.cantidadmetas();
        List<CantidadMetasDTO> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            CantidadMetasDTO dto=new CantidadMetasDTO();
            dto.setUsuario(columna[0]);
            dto.setCantidadMetas(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return  dtoLista;
    }

    @GetMapping("/listarmetas")
    public List<MetaDTO> listaMetas(@RequestParam String usuario) {
        return meS.listMeta(usuario).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, MetaDTO.class);
        }).collect(Collectors.toList());
    }

}
