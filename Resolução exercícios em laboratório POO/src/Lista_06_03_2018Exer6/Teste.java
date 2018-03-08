/**
 * autor Roberto Eugenio
 * 6. (classe abstrata, heran�a, sobrescrita, polimorfismo) Crie uma hierarquia de classes para
representar os diferentes tipos de funcion�rios de um escrit�rio que tem os seguintes cargos:
gerente, assistente, vendedor. Escreva uma classe base abstrata chamada Funcionario que
declara um m�todo abstrato:
Assinatura double calculaSalario()
Esta classe tamb�m deve definir os seguintes atributos: nome (tipo String), matricula (tipo
String) e salario_base (tipo double). Use encapsulamento e forne�a um construtor que
recebe os valores correspondentes a serem armazenados nos respectivos atributos. Esta classe
abstrata dever� ser estendida pelas outras classes representativas dos tipos de funcion�rios,

portanto devem ser escritas as classes Gerente, Assistente e Vendedor. Em cada classe deve-
se sobrescrever o m�todo calculaSalario de forma que c�lculo do sal�rio � feito assim: O

gerente recebe duas vezes o sal�rio_base, o assistente recebe o sal�rio_base e o vendedor
recebe o sal�rio_base mais uma comiss�o definida no construtor de sua classe. Crie uma
classe Teste com um m�todo main que cria um objeto de cada tipo e os armazena em uma lista e
depois calcula a folha salarial dos tr�s funcion�rios e imprime o valor total.

 */

package Lista_06_03_2018Exer6;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args){
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
        Gerente g1 = new Gerente("Gerente", "1", 1500);
        Assistente a1 = new Assistente("Assistente", "2", 1000);
        Vendedor v1 = new Vendedor("Vendedor", "3", 500, 500);

        System.out.printf("%s recebe R$ %.2f\n",g1.getNome(),g1.calculaSalario());
        System.out.printf("%s recebe R$ %.2f\n",a1.getNome(),a1.calculaSalario());
        System.out.printf("%s recebe R$ %.2f\n",v1.getNome(),v1.calculaSalario());


    }
}