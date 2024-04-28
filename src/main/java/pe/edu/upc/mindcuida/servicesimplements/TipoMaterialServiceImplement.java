package pe.edu.upc.mindcuida.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.mindcuida.entities.TipoMaterial;
import pe.edu.upc.mindcuida.repositories.ITipoMaterialRepository;
import pe.edu.upc.mindcuida.servicesinterfaces.ITipoMaterialService;

import java.util.List;

@Service
public class TipoMaterialServiceImplement implements ITipoMaterialService {
    @Autowired
    private ITipoMaterialRepository tmR;


    @Override
    public void insert(TipoMaterial tipoMaterial) {
        tmR.save(tipoMaterial);
    }

    @Override
    public List<TipoMaterial> list() {
        return tmR.findAll();
    }

    @Override
    public void delete(int id) {
       tmR.deleteById(id);
    }

    @Override
    public TipoMaterial listId(int id) {
        return tmR.findById(id).orElse(new TipoMaterial());
    }

    @Override
    public List<String[]> CantidadDeMaterialPorTipo() {
        return tmR.CantidadDeMaterialPorTipo();
    }

    @Override
    public List<String[]> ListadoFiltrarMateriales() {
        return tmR.ListadoFiltrarMateriales();
    }

    @Override
    public List<String[]> CantidadMaterialNombre() {
        return tmR.CantidadMaterialPorNombre();
    }

    @Override
    public List<String[]> ListadoVideosTipo() {
        return tmR.ListadoVideosTipo();
    }

}
