package pe.edu.upc.mindcuida.servicesinterfaces;

import pe.edu.upc.mindcuida.entities.Respuestas;

import java.util.List;

public interface IRespuestasService {

    public void insert(Respuestas respuestas);

    public List<Respuestas> list();
}
