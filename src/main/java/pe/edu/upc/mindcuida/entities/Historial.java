package pe.edu.upc.mindcuida.entities;

import jakarta.persistence.*;

@Entity
@Table (name="Historial")
public class Historial {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idHistorial;
    @Column(name="notasHistorial",nullable = false,length = 100)
    public String notasHistorial;
    @Column(name="observacionesHistorial",nullable = false,length = 100)
    public String observacionesHistorial;

    public Historial() {
    }

    public Historial(int idHistorial, String notasHistorial, String observacionesHistorial) {
        this.idHistorial = idHistorial;
        this.notasHistorial = notasHistorial;
        this.observacionesHistorial = observacionesHistorial;
    }

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
