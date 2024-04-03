package pe.edu.upc.mindcuida.dtos;

public class HistorialDTO {
    public int idHistorial;

    public String notasHistorial;

    public String observacionesHistorial;

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public String getNotasHistorial() {
        return notasHistorial;
    }

    public void setNotasHistorial(String notasHistorial) {
        this.notasHistorial = notasHistorial;
    }

    public String getObservacionesHistorial() {
        return observacionesHistorial;
    }

    public void setObservacionesHistorial(String observacionesHistorial) {
        this.observacionesHistorial = observacionesHistorial;
    }
}
