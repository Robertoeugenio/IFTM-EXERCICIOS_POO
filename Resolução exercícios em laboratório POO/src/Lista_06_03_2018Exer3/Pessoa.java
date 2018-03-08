/**
 * @author Roberto Eugenio 
 * 3. (herança, sobrescrita) Escreva as seguintes classes:
		a)	 Uma classe Pessoa com atributos nome (tipo String) e sobrenome (tipo String). Use
			 encapsulamento. A classe Pessoa ainda deve ter o seguinte método:
			 Assinatura String getNomeCompleto()
			 Efeito Retorna a concatenação do atributo nome com o atributo sobrenome
			 Além disso, a classe deve possuir um construtor sem parâmetros e outro construtor que recebe
			 como parâmetros o nome e o sobrenome da pessoa e armazena respectivamente nos atributos nome
			 e sobrenome.
		
		b)   Uma subclasse de Pessoa, chamada Funcionario. A classe Funcionario deve ter os
			 atributos matricula (tipo int) e salario (tipo double). Use encapsulamento. Considere a
			 seguinte regra no método modificador setSalario:
			 Assinatura void setSalario(int valor)
			 Efeito Atribui ao atributo salário o valor recebido como parâmetro desde que este valor
		     não seja negativo. Caso seja negativo, não faz nada.

			 Todo funcionánio recebe seu salário em duas parcelas, sendo 60% na primeira parcela e 40% na
		 	 segunda parcela. Assim, escreva os métodos:
		 	 Assinatura double getSalarioPrimeiraParcela()
			 Efeito Retorna o valor da primeira parcela do salário (60%)
			 Assinatura double getSalarioSegundaParcela()
			 Efeito Retorna o valor da segunda parcela do salário (40%)
		
		c)   Uma subclasse de Funcionario, chamada Professor. Todo professor recebe seu salário em
			 uma única parcela. Assim, deve-se sobrescrever os métodos getSalarioPrimeiraParcela e
			 getSalarioSegundaParcela.
			 Assinatura double getSalarioPrimeiraParcela()
			 Efeito Retorna o valor integral do salário do professor
			 Assinatura double getSalarioSegundaParcela()
			 Efeito Retorna o valor zero.

		d)   Uma classe Programa que, no método main, instancia os seguintes objetos:
			 Nome da variável: pessoa1 (tipo Pessoa) nome: João obrenome: Medeiros
			 Nome da variável: pessoa2 (tipo Funcionario) nome: Leonardo sobrenome: Messias
			 salario: 1000.00 matricula: 100 Nome da variável: pessoa3 (tipo Professor)
    		 nome: Antônio sobrenome: Silva salario: 1500.00 matricula: 200
			 Depois disso, executa as seguintes operações na seguinte ordem:
		   - Imprime o retorno do método getNomeCompleto para os 3 objetos.
		   - Imprime o retorno dos métodos getSalarioPrimeiraParcela e
			 getSalarioSEgundaParcela para os objetos pessoa2 e pessoa3.
 *
 */
package Lista_06_03_2018Exer3;

public class Pessoa {
	private String nome;
	private String sobreNome;
	//assinatura 
	public String getNomeCompleto() {
	return sobreNome + " " + sobreNome;
		
	}
	//construtor com parametros 
	public Pessoa(String nome, String sobreNome) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
	}
	//construtor sem parametros ou padrão
	public Pessoa() {
		super();
		
	}

}
