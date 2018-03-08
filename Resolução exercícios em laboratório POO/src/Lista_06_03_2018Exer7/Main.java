/**
 * autor Roberto Eugenio
 * 7. (classe abstrata, sobrescrita, polimorfismo) Escreva uma classe abstrata chamada CartaoWeb.
Essa classe representa todos os tipos de cartões web e conterá apenas um atributo: destinatario
(tipo String). Nessa classe você deverá também declarar o método public abstract void
showMessage(). Crie classes filhas da classe CartaoWeb: DiaDosNamorados, Natal,
Aniversario. Cada uma dessas classes deve conter um método construtor que receba o nome do
destinatário do cartão. Cada classe também deve implementar o método showMessage(),
mostrando uma mensagem ao usuário com seu nome e que seja específica para a data de
comemorativa do cartão. Escreva um programa e no método main crie um array de CartaoWeb.
Insira instâncias dos 3 tipos de cartões neste array. Após, use um laço for para exibir as mensagens
deste cartão chamando o método showMessage().Em que linha(s) acontece polimorfismo nesse
código?
 * 
 */
package Lista_06_03_2018Exer7;

public class Main {
    public static void main(String[] args) {
        CartaoWeb c1 = new Natal("zé colmeia");
        CartaoWeb c2 = new Aniversario("margarida");
        CartaoWeb c3 = new DiaNamorados("guarda belo");

        CartaoWeb cartoes[] = {c1, c2, c3};

        for (int i = 0; i < cartoes.length; i++) {
            cartoes[i].showMessage();
        }


    }

}
