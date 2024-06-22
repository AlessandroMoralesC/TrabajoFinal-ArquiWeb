package pe.edu.upc.mindcuida.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.ComunidadDTO;
import pe.edu.upc.mindcuida.entities.Comunidad;
import pe.edu.upc.mindcuida.servicesinterfaces.IComunidadService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comunidad")
public class ComunidadController {
    @Autowired
    private IComunidadService cS;

    @PostMapping
    public void insertar(@RequestBody ComunidadDTO comunidadDTO) {
        ModelMapper d = new ModelMapper();
        Comunidad comunidad = d.map(comunidadDTO, Comunidad.class);
        cS.insert(comunidad);
    }
    @PutMapping
    public void modificar(@RequestBody ComunidadDTO comunidadDTO) {
        ModelMapper d = new ModelMapper();
        Comunidad comunidad = d.map(comunidadDTO, Comunidad.class);
        cS.insert(comunidad);
    }
    @GetMapping
    public List<Comunidad> listar() {
        return cS.list().stream().map(y -> {
                    ModelMapper c = new ModelMapper();
                    return c.map(y, Comunidad.class);
                }
        ).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public ComunidadDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        ComunidadDTO dto=m.map(cS.listId(id),ComunidadDTO.class);
        return  dto;
    }

        @GetMapping("/experiencias")
    public List<ComunidadDTO> experienciasDTOS() {
        List<String[]> filaLista = cS.listaExp();
        List<ComunidadDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            ComunidadDTO dto = new ComunidadDTO();
            dto.setExperienciasComunidad(columna[0]);
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/recomendaciones")
    public List<ComunidadDTO> recomendacionesDTOS() {
        List<String[]> filaLista = cS.listaExp();
        List<ComunidadDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            ComunidadDTO dto = new ComunidadDTO();
            dto.setRecomendacionesComunidad(columna[0]);
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
