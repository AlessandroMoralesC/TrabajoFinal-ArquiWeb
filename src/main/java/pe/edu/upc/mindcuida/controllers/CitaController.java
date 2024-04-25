package pe.edu.upc.mindcuida.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.CitaDTO;
import pe.edu.upc.mindcuida.entities.Cita;
import pe.edu.upc.mindcuida.servicesinterfaces.ICitaService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/citas")
public class CitaController {
    @Autowired
    private ICitaService ciS;

    @PostMapping
    public void insertar(@RequestBody CitaDTO citaDTO) {
        ModelMapper d = new ModelMapper();
        Cita cita = d.map(citaDTO, Cita.class);
        ciS.insert(cita);
    }
    @PutMapping
    public void modificar(@RequestBody CitaDTO citaDTO) {
        ModelMapper d = new ModelMapper();
        Cita cita = d.map(citaDTO, Cita.class);
        ciS.insert(cita);
    }
    @GetMapping
    public List<Cita> listar() {
        return ciS.list().stream().map(y -> {
                    ModelMapper c = new ModelMapper();
                    return c.map(y, Cita.class);
                }
        ).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        ciS.delete(id);
    }

    @GetMapping("/{id}")
    public CitaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        CitaDTO dto=m.map(ciS.listId(id),CitaDTO.class);
        return  dto;
    }

    @GetMapping("/buscarcitaporFecha")
    public List<CitaDTO> buscarcitaporFecha(@RequestParam LocalDate fecha) {
        return ciS.buscarCitaporFecha(fecha).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CitaDTO.class);
        }).collect(Collectors.toList());
    }
}
