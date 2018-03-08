/**
 * autor Roberto Eugenio
 * 6. (classe abstrata, herança, sobrescrita, polimorfismo) Crie uma hierarquia de classes para
representar os diferentes tipos de funcionários de um escritório que tem os seguintes cargos:
gerente, assistente, vendedor. Escreva uma classe base abstrata chamada Funcionario que
declara um método abstrato:
Assinatura double calculaSalario()
Esta classe também deve definir os seguintes atributos: nome (tipo String), matricula (tipo
String) e salario_base (tipo double). Use encapsulamento e forneça um construtor que
recebe os valores correspondentes a serem armazenados nos respectivos atributos. Esta classe
abstrata deverá ser estendida pelas outras classes representativas dos tipos de funcionários,

portanto devem ser escritas as classes Gerente, Assistente e Vendedor. Em cada classe deve-
se sobrescrever o método calculaSalario de forma que cálculo do salário é feito assim: O

gerente recebe duas vezes o salário_base, o assistente recebe o salário_base e o vendedor
recebe o salário_base mais uma comissão definida no construtor de sua classe. Crie uma
classe Teste com um método main que cria um objeto de cada tipo e os armazena em uma lista e
depois calcula a folha salarial dos três funcionários e imprime o valor total.

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