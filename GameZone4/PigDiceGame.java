package GameZone4;

public class PigDiceGame {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();

        do {
            System.out.println("Jugador1");
            jugador1.jugar();
            System.out.println("Jugador2");
            jugador2.jugar();
        }while (jugador1.getValor() <= 10 || jugador2.getValor() <= 10);
    }

}
