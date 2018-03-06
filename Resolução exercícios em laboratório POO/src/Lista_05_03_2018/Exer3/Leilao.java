package Lista_05_03_2018Exer3;

import java.util.ArrayList;
import java.util.List;

public class Leilao {

    private String produtoLeiloado;
    private double valorMinimo;
    private boolean Disponivel;
    private Lance vencedor;
    private List<Lance> ConteudoLeilao = new ArrayList<>();

    public Leilao(String bem, double valorInicial) {
        this.produtoLeiloado = produtoLeiloado;
        this.valorMinimo = valorInicial;
        this.Disponivel = true;
        this.vencedor = new Lance("Inicial", valorInicial);
    }

    public void registrarLance(String nome, double valor){
        Lance lanceAtual = new Lance(nome, valor);
        if (valor > valorMinimo && valor>vencedor.getValorLance() && Disponivel == true) {
            vencedor = lanceAtual;
            ConteudoLeilao.add(lanceAtual);
        } else if(!Disponivel == true){
            System.out.println("Leilao encerrado por enquanto, aguarde para novo leil�o");
        } else{
            System.out.printf("Fa�a o seu  lance maior que: %.2f\n ", vencedor.getValorLance());
            System.out.println("\n");
        }
    }

    public void finalizar(){
        Disponivel = false;
        System.out.println("Parab�ns para o Vencedor do leilao:");
        System.out.println("\n");
        for (Lance NumeroLance: ConteudoLeilao
             ) {
            System.out.printf("Nome: %s - Lance:%.2f\n",NumeroLance.getNomePessoa(),NumeroLance.getValorLance());
        }
    }
}
