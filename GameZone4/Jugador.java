package GameZone4;

import java.util.ArrayList;

public class Jugador {
    private Integer valor;
    //private ArrayList<Die> dados;
    private Die dado1;
    private Die dado2;

    public Jugador(){
        this.valor = 0;
        dado1 = new Die();
        dado2 = new Die();
        //dados = new ArrayList<>();

    }

    public void jugar(){
        this.dado1.lanzar();
        System.out.println(this.dado1.getNumero());
        this.dado2.lanzar();
        System.out.println(this.dado2.getNumero());
        validar(dado1.getNumero(),dado2.getNumero());
        System.out.println(this.valor);
    }

    private void validar(int x, int y){
        if (x == 1 || y == 1){
            this.valor = this.valor;
            return;
        }if (x == 1 && y == 1){
            this.valor = 0;
            return;
        }else{
            this.valor = this.valor + x + y;
        }
    }

    public Integer getValor(){
        return this.valor;
    }

}
