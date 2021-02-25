package GameZone1;

public class Respuesta {
    private String respuesta;
    private Boolean calificacion;

    public Respuesta(String respuesta, Boolean calificacion) {
        this.respuesta = respuesta;
        this.calificacion = calificacion;
    }

    public String getRespuesta(){
        return respuesta;
    }

    public void setRespuesta(String respuesta){
        this.respuesta = respuesta;
    }

    public Boolean getCalificacion(){
        return this.calificacion;
    }
}
