package pe.edu.upc.mindcuida.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.mindcuida.entities.TipoMaterial;

import java.util.List;

@Repository
public interface ITipoMaterialRepository extends JpaRepository<TipoMaterial, Integer> {

    @Query(value = "SELECT tematmaterial, COUNT(*) AS cantidad " +
            "FROM public.tipo_material " +
            "GROUP BY tematmaterial " +
            "ORDER BY cantidad DESC", nativeQuery = true)
    List<String[]> CantidadMaterialPorNombre();


    @Query(value = "SELECT tipotmaterial, COUNT(*) AS cantidad " +
            "FROM public.tipo_material " +
            "GROUP BY tipotmaterial " +
            "ORDER BY cantidad DESC", nativeQuery = true)
    List<String[]> CantidadDeMaterialPorTipo();

    @Query(value = " SELECT linktmaterial, tipotmaterial, tematmaterial \n" +
            "FROM tipo_material \n" +
            "WHERE tematmaterial = 'ansiedad'; ",nativeQuery = true)
    List<String[]> ListadoFiltrarMateriales();
}
