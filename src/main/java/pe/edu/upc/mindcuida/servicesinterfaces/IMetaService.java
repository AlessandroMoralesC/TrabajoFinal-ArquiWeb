package pe.edu.upc.mindcuida.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.mindcuida.entities.Meta;

import java.util.List;

public interface IMetaService {
    public void insert (Meta meta);
    public List<Meta> list();
    public void delete(int id);
    public Meta listId(int id);
    public List<String[]> cantidametas();
    public List<Meta> listMeta(String nombreusuario);



}
