package pe.edu.upc.mindcuida.servicesinterfaces;

import pe.edu.upc.mindcuida.entities.Meta;

import java.util.List;

public interface IMetaService {
    public void insert (Meta meta);
    public List<Meta> list();
}
