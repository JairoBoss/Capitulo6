package GameZone3;
import java.util.Scanner;
public class TestDie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Die dado1 = new Die();
        Die dado2 = new Die();

        int x= dado1.sumaValor(dado2);
        int i = 0;

        Usuario jairo = new Usuario();


        for (int j = 0; j < 3; j++) {
            System.out.println(x);
            jairo.setPrediccion();
            if (x == jairo.getPrediccion()){
                System.out.printf("GANASTE");
                return;
            }else{
                dado1.lanzar();
                dado2.lanzar();
                x= dado1.sumaValor(dado2);
            }
        }
        System.out.println("GANA LA PC");
    }
}
