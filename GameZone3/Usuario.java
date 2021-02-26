package GameZone3;
import java.util.Scanner;
public class Usuario {
    Scanner sc;
    private Integer prediccion;

    public Usuario(){
        sc = new Scanner(System.in);
    }

    public void setPrediccion(){
        this.prediccion = sc.nextInt();
    }

    public Integer getPrediccion(){
        return this.prediccion;
    }

}
