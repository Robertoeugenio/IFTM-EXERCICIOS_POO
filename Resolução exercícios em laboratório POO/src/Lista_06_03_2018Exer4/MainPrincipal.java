/**
 * @author Roberto Eugenio 
 *4. (herança, sobrescrita) Escreva uma classe Conta com atributo saldo (tipo double) e os
seguintes métodos
Assinatura void depositar(double valor)
Efeito Acrescentar o valor recebido como parâmetro ao atributo saldo
Assinatura void sacar(double valor)
Efeito Subtrair o valor recebido como parâmetro do atributo saldo
O atributo saldo pode ser negativo. Escreva uma subclasse de Conta chamada Poupanca. A
classe Poupanca deve ter um atributo chamado diaRendimento do tipo int que armazena o dia
do mês em que ocorre o rendimento da poupança. Use encapsulamento nas duas classes. Forneça
construtor que recebe valores para os atributos correspondentes para as duas classes. O atributo
saldo da classe Poupanca não pode ser negativo. Use esta regra no método modificador do
atributo saldo (método setSaldo):
Assinatura void setSaldo(double valor)
Efeito Atribui ao atributo saldo o valor recebido como parâmetro desde que este valor não

seja negativo. Caso seja negativo, não faz nada.

Aplique esta mesma regra e redefina (por sobreposição) o método sacar para a classe
Poupanca:
Assinatura void sacar(double valor)
Efeito Subtrair o valor recebido como parâmetro do atributo saldo desde que este valor não

seja negativo. Caso seja negativo, não faz nada.

Escreva um programa com um método main que cria um objeto do tipo Conta e outro objeto do
tipo Poupanca. Em seguida realiza um depósito na conta no valor de 10000 e depois um saque de
15000 da conta e um depósito na poupança no valor de 15000. Depois realize um saque de 20000
na poupança e imprima o saldo da conta e da poupança.
 */
package Lista_06_03_2018Exer4;

public class MainPrincipal {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Poupanca poupanca1 = new Poupanca();

        conta1.depositar(10000);
        conta1.sacar(15000);
        poupanca1.depositar(15000);
        poupanca1.sacar(20000);

        System.out.printf("Saldo conta: R$ %.2f\n", conta1.getSaldo());
        System.out.printf("Saldo poupanca: R$ %.2f\n", poupanca1.getSaldo());

    }

}