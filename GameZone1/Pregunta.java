package GameZone1;

import java.util.Arrays;

public class Pregunta {
    private String pregunta;
    private Respuesta[] respuestas;
    private Integer contador;

    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
        this.respuestas = new Respuesta[5];
        this.contador = 0;
    }

    public void setRespuestas(String respuesta, boolean calificacion){
         if (contador<4){
            this.respuestas[contador] = new Respuesta(respuesta,calificacion);
         }
        contador++;
    }

    public Boolean checarRespuesta(int i){
        return respuestas[i].getCalificacion();
    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "pregunta='" + pregunta + '\'' +
                ", respuestas=" + Arrays.toString(respuestas) +
                ", contador=" + contador +
                '}';
    }
}


