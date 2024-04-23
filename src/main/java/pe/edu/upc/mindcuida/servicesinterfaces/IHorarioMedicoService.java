package pe.edu.upc.mindcuida.servicesinterfaces;

import pe.edu.upc.mindcuida.entities.HorarioMedico;
import java.util.List;

public interface IHorarioMedicoService {
    public void insert (HorarioMedico horarioMedico);
    public List<HorarioMedico> list();
    public HorarioMedico listId(int id);
}
