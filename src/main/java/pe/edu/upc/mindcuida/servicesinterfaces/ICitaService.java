package pe.edu.upc.mindcuida.servicesinterfaces;

import pe.edu.upc.mindcuida.entities.Cita;

import java.time.LocalDate;
import java.util.List;

public interface ICitaService {
    public void insert (Cita cita);
    public List<Cita> list();
    public void delete(int id);
    public Cita listId(int id);
    List<Cita>buscarCitaporFecha(LocalDate fecha);
}
