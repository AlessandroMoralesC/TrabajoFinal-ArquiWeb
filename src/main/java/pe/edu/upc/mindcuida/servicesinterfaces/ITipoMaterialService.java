package pe.edu.upc.mindcuida.servicesinterfaces;

import pe.edu.upc.mindcuida.entities.TipoMaterial;

import java.util.List;

public interface ITipoMaterialService {
    public void insert (TipoMaterial tipoMaterial);
    public List<TipoMaterial> list();
    public void delete(int id);
    public TipoMaterial listId(int id);

    public List<String[]> CantidadMaterialNombre();

    public List<String[]> CantidadDeMaterialPorTipo();

    public List<String[]> ListadoFiltrarMateriales();

    public List<String[]> ListadoVideosTipo();
}
