package pe.edu.upc.mindcuida.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.MetaDTO;
import pe.edu.upc.mindcuida.entities.Meta;
import pe.edu.upc.mindcuida.servicesinterfaces.IMetaService;

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

    @GetMapping
    public List<Meta> listar(){
    return meS.list().stream().map(y->{
        ModelMapper m=new ModelMapper();
        return m.map(y,Meta.class);
    }
    ).collect(Collectors.toList());

    }


}
