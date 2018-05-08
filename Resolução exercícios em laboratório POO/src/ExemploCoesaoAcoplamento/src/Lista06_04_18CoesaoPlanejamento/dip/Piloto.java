package dip;

public class Piloto {

    private Veiculo carro;

    public Piloto(){
        this.carro = new CarroDeCorrida(100);
    }

    public void aumentaVelocidade(){
        carro.acelerar();
    }
}