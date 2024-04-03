package pe.edu.upc.mindcuida.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.UbicacionDTO;
import pe.edu.upc.mindcuida.entities.Ubicacion;
import pe.edu.upc.mindcuida.servicesinterfaces.IUbicacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ubicaciones")
public class UbicacionController {
    @Autowired
    private IUbicacionService mS;

    @PostMapping
    public void insertar(@RequestBody UbicacionDTO ubicaciondto)
    {
        ModelMapper d = new ModelMapper();
        Ubicacion ubicacion = d.map(ubicaciondto, Ubicacion.class);
        mS.insert(ubicacion);
    }
    @GetMapping
    public List<UbicacionDTO> listar()
    {
        return mS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,UbicacionDTO.class);
        }).collect(Collectors.toList());
    }
}
