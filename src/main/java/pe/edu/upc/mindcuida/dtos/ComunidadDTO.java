package pe.edu.upc.mindcuida.dtos;

public class ComunidadDTO {
    private int IdComunidad;
    private String experienciasComunidad;
    private String aprobacionesComunidad;
    private String recomendacionesComunidad;

    public int getIdComunidad() {
        return IdComunidad;
    }

    public void setIdComunidad(int idComunidad) {
        IdComunidad = idComunidad;
    }

    public String getExperienciasComunidad() {
        return experienciasComunidad;
    }

    public void setExperienciasComunidad(String experienciasComunidad) {
        this.experienciasComunidad = experienciasComunidad;
    }

    public String getAprobacionesComunidad() {
        return aprobacionesComunidad;
    }

    public void setAprobacionesComunidad(String aprobacionesComunidad) {
        this.aprobacionesComunidad = aprobacionesComunidad;
    }

    public String getRecomendacionesComunidad() {
        return recomendacionesComunidad;
    }

    public void setRecomendacionesComunidad(String recomendacionesComunidad) {
        this.recomendacionesComunidad = recomendacionesComunidad;
    }
}
