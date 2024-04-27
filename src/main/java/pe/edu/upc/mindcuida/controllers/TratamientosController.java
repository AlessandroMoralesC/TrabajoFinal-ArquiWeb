package pe.edu.upc.mindcuida.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.CantidadDeTratamientoPorEfectividadDTO;
import pe.edu.upc.mindcuida.dtos.ListaDeTratamientosEnProcesoDTO;
import pe.edu.upc.mindcuida.dtos.TratamientosDTO;
import pe.edu.upc.mindcuida.entities.Tratamientos;
import pe.edu.upc.mindcuida.servicesinterfaces.ITratamientosService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tratamientos")
public class TratamientosController {
    @Autowired
    private ITratamientosService trS;

    @PostMapping
    @PreAuthorize("hasAuthority('psicologo')")
    public void insertar(@RequestBody TratamientosDTO tratamientosDTO) {
        ModelMapper d = new ModelMapper();
        Tratamientos tratamientos = d.map(tratamientosDTO, Tratamientos.class);
        trS.insert(tratamientos);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('psicologo')")
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

    @GetMapping("/cantidadtratamientoefectividad")
    public List<CantidadDeTratamientoPorEfectividadDTO> cantidadTratamientoPorEfectividad(){
        List<String[]> filaLista=trS.cantidadDeTratamientosPorEfectividad();
        List<CantidadDeTratamientoPorEfectividadDTO> dtoLista=new ArrayList<>();
        for (String[] columna:filaLista){
            CantidadDeTratamientoPorEfectividadDTO dto=new CantidadDeTratamientoPorEfectividadDTO();
            dto.setNombreTratamientos(columna[0]);
            dto.setEfectividadTratamientos(columna[1]);
            dto.setCantidadDeTratamientoEfectivas(Integer.parseInt(columna[2]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/listatratamientoproceso")
    public List<ListaDeTratamientosEnProcesoDTO> listaDeTratamientosEnProceos(){
        List<String[]> filaLista=trS.listaDeTratamientosEnProceso();
        List<ListaDeTratamientosEnProcesoDTO> dtoLista=new ArrayList<>();
        for (String[] columna:filaLista){
            ListaDeTratamientosEnProcesoDTO dto=new ListaDeTratamientosEnProcesoDTO();
            dto.setNombreTratamientos(columna[0]);
            dto.setEstadoTratamientos(columna[1]);
            dtoLista.add(dto);
        }
        return dtoLista;
    }





}
