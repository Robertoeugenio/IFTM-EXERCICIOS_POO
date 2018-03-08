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

public abstract class Funcionario {
    private String nome;
    private String matricula;
    private double salarioBase;

    public Funcionario(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public abstract double calculaSalario();

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}