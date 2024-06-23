package pe.edu.upc.mindcuida.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.mindcuida.dtos.*;
import pe.edu.upc.mindcuida.entities.TipoMaterial;
import pe.edu.upc.mindcuida.servicesinterfaces.ITipoMaterialService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipomaterial")
public class TipoMaterialController {
    @Autowired
    private ITipoMaterialService tmS;

    @PostMapping
    @PreAuthorize("hasAuthority('PSICOLOGO') or hasAuthority('ADMINISTRADOR')")

    public void insertar(@RequestBody TipoMaterialDTO tipoMaterialDTO) {
        ModelMapper d = new ModelMapper();
        TipoMaterial tipoMaterial= d.map(tipoMaterialDTO,TipoMaterial.class);
        tmS.insert(tipoMaterial);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('PSICOLOGO') or hasAuthority('ADMINISTRADOR')")

    public void modificar(@RequestBody TipoMaterialDTO tipoMaterialDTO) {
        ModelMapper d = new ModelMapper();
        TipoMaterial tipoMaterial = d.map(tipoMaterialDTO, TipoMaterial.class);
        tmS.insert(tipoMaterial);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('PSICOLOGO') or hasAuthority('ADMINISTRADOR')")

    public List<TipoMaterialDTO> respuestas(){
        return tmS.list().stream().map(y-> {
            ModelMapper m=new ModelMapper();
            return m.map(y,TipoMaterialDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('PSICOLOGO') or hasAuthority('ADMINISTRADOR')")

    public void eliminar(@PathVariable("id") Integer id){
        tmS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('PSICOLOGO') or hasAuthority('ADMINISTRADOR')")

    public TipoMaterialDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        TipoMaterialDTO dto=m.map(tmS.listId(id),TipoMaterialDTO.class);
        return  dto;
    }
    @GetMapping("/CantidadMaterialPorNombreDTO")
    @PreAuthorize("hasAuthority('PSICOLOGO') or hasAuthority('ADMINISTRADOR')")

    public List<CantidadMaterialPorNombreDTO> cantidadmaterialPorNombre(){
        List<String[]> filaLista=tmS.CantidadMaterialNombre();
        List<CantidadMaterialPorNombreDTO> dtoLista=new ArrayList<>();
        for (String[] columna:filaLista){
            CantidadMaterialPorNombreDTO dto=new CantidadMaterialPorNombreDTO();
            dto.setTematmaterial(columna[0]);
            dto.setCantidadRegistrosTema(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
    @GetMapping("/CantidadMaterialPorTipoDTO")
    public List<CantidadDeMaterialPorTipoDTO> cantidadDeMaterialPorTipo(){
        List<String[]> filaLista=tmS.CantidadDeMaterialPorTipo();
        List<CantidadDeMaterialPorTipoDTO> dtoLista=new ArrayList<>();
        for (String[] columna:filaLista){
            CantidadDeMaterialPorTipoDTO dto=new CantidadDeMaterialPorTipoDTO();
            dto.setTipotmaterial(columna[0]);
            dto.setCantidadRegistros(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/ListadoFiltrarMateriales")
    public List<ListadoFiltrarMaterialesDTO> listadofiltrarMateriales() {
        List<String[]> filaLista = tmS.ListadoFiltrarMateriales();
        List<ListadoFiltrarMaterialesDTO> dtoLista = new ArrayList<>();
        for (String[] columna : filaLista) {
            ListadoFiltrarMaterialesDTO dto = new ListadoFiltrarMaterialesDTO();
            dto.setEnlaceMaterial(columna[0]);
            dto.setMaterialFormato(columna[1]);
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/ListadoVideosTipo")
    public List<ListadoVideosTipoDTO> ListadoVideosTipo() {
        List<String[]> filaLista = tmS.ListadoVideosTipo();
        List<ListadoVideosTipoDTO> dtoLista = new ArrayList<>();
        for (String[] columna : filaLista) {
            ListadoVideosTipoDTO dto = new ListadoVideosTipoDTO();
            dto.setTipoTMaterial(columna[0]);
            dto.setLinkTMaterial(columna[1]);
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}