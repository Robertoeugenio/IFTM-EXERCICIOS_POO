/**
 * autor Roberto Eugenio
 * 7. (classe abstrata, sobrescrita, polimorfismo) Escreva uma classe abstrata chamada CartaoWeb.
Essa classe representa todos os tipos de cart�es web e conter� apenas um atributo: destinatario
(tipo String). Nessa classe voc� dever� tamb�m declarar o m�todo public abstract void
showMessage(). Crie classes filhas da classe CartaoWeb: DiaDosNamorados, Natal,
Aniversario. Cada uma dessas classes deve conter um m�todo construtor que receba o nome do
destinat�rio do cart�o. Cada classe tamb�m deve implementar o m�todo showMessage(),
mostrando uma mensagem ao usu�rio com seu nome e que seja espec�fica para a data de
comemorativa do cart�o. Escreva um programa e no m�todo main crie um array de CartaoWeb.
Insira inst�ncias dos 3 tipos de cart�es neste array. Ap�s, use um la�o for para exibir as mensagens
deste cart�o chamando o m�todo showMessage().Em que linha(s) acontece polimorfismo nesse
c�digo?
 * 
 */
package Lista_06_03_2018Exer7;

public abstract class CartaoWeb {
    private String destinatario;

    public abstract void showMessage();
}