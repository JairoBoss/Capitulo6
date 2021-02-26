package GameZone4;

public class Die {
    private Integer numero;

    public Die(){
        lanzar();
    }

    public void lanzar(){
        this.numero = (int)(Math.random()*6+1);
    }

    public Integer sumaValor(Die dado){
        return (this.numero + dado.numero);
    }

    public void setNumero(int n){
        this.numero = n;
    }

    public Integer getNumero(){
        return this.numero;
    }
}
