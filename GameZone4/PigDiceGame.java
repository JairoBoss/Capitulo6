package GameZone4;

public class PigDiceGame {
    public static void main(String[] args) {
        Jugador jairo = new Jugador();
        Jugador esteban = new Jugador();

        do {
            
            jairo.jugar();
        }while (jairo.getValor() <= 20);



    }

}
