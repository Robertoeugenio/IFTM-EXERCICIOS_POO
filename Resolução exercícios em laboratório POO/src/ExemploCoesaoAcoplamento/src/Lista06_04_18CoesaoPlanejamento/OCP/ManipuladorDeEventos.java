package OCP;
public class ManipuladorDeEventos {

    private Veiculo veiculo;

    public ManipuladorDeEventos(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void mudarModoDirecao(ModoDirecao modoDirecao){
    	veiculo.setPotencia(modoDirecao.getPotencia());
    	veiculo.setAlturaSuspencao(modoDirecao.getAlturaSuspencao());
    }
}