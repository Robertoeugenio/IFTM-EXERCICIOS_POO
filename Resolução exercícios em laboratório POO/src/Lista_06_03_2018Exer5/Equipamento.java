/**
 * autor Roberto Eugenio 
 * 5. (heran�a, sobrescrita) Escreva as seguintes classes:
Uma classe Equipamento com o atributo ligado (tipo boolean) e com os m�todos:
Assinatura void liga()
Efeito Torna o atributo ligado true
Assinatura void desliga()
Efeito Torna atributo ligado false

Use encapsulamento.
Uma classe EquipamentoSonoro que herda as caracter�sticas de Equipamento e que possui
os atributos volume (tipo int) e stereo (tipo boolean). Use encapsulamento. A classe deve
possuir os m�todos:
Assinatura void mono()
Efeito Torna o atributo stereo falso
Assinatura void stereo()
Efeito Torna o atributo stereo verdadeiro
Assinatura void liga()
Efeito Sobrescreve o m�todo liga da superclasse. Este m�todo deve chamar o m�todo

liga da superclasse e ajustar o atributo volume para 5
 */
package Lista_06_03_2018Exer5;

public class Equipamento {
    private boolean ligado;


    public void liga(){
        ligado = true;
    }

    public void desliga(){
        ligado = false;
    }

}
