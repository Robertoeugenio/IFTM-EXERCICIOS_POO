/**
 * @author Roberto Eugenio 
 * 3. (heran�a, sobrescrita) Escreva as seguintes classes:
		a)	 Uma classe Pessoa com atributos nome (tipo String) e sobrenome (tipo String). Use
			 encapsulamento. A classe Pessoa ainda deve ter o seguinte m�todo:
			 Assinatura String getNomeCompleto()
			 Efeito Retorna a concatena��o do atributo nome com o atributo sobrenome
			 Al�m disso, a classe deve possuir um construtor sem par�metros e outro construtor que recebe
			 como par�metros o nome e o sobrenome da pessoa e armazena respectivamente nos atributos nome
			 e sobrenome.
		
		b)   Uma subclasse de Pessoa, chamada Funcionario. A classe Funcionario deve ter os
			 atributos matricula (tipo int) e salario (tipo double). Use encapsulamento. Considere a
			 seguinte regra no m�todo modificador setSalario:
			 Assinatura void setSalario(int valor)
			 Efeito Atribui ao atributo sal�rio o valor recebido como par�metro desde que este valor
		     n�o seja negativo. Caso seja negativo, n�o faz nada.

			 Todo funcion�nio recebe seu sal�rio em duas parcelas, sendo 60% na primeira parcela e 40% na
		 	 segunda parcela. Assim, escreva os m�todos:
		 	 Assinatura double getSalarioPrimeiraParcela()
			 Efeito Retorna o valor da primeira parcela do sal�rio (60%)
			 Assinatura double getSalarioSegundaParcela()
			 Efeito Retorna o valor da segunda parcela do sal�rio (40%)
		
		c)   Uma subclasse de Funcionario, chamada Professor. Todo professor recebe seu sal�rio em
			 uma �nica parcela. Assim, deve-se sobrescrever os m�todos getSalarioPrimeiraParcela e
			 getSalarioSegundaParcela.
			 Assinatura double getSalarioPrimeiraParcela()
			 Efeito Retorna o valor integral do sal�rio do professor
			 Assinatura double getSalarioSegundaParcela()
			 Efeito Retorna o valor zero.

		d)   Uma classe Programa que, no m�todo main, instancia os seguintes objetos:
			 Nome da vari�vel: pessoa1 (tipo Pessoa) nome: Jo�o obrenome: Medeiros
			 Nome da vari�vel: pessoa2 (tipo Funcionario) nome: Leonardo sobrenome: Messias
			 salario: 1000.00 matricula: 100 Nome da vari�vel: pessoa3 (tipo Professor)
    		 nome: Ant�nio sobrenome: Silva salario: 1500.00 matricula: 200
			 Depois disso, executa as seguintes opera��es na seguinte ordem:
		   - Imprime o retorno do m�todo getNomeCompleto para os 3 objetos.
		   - Imprime o retorno dos m�todos getSalarioPrimeiraParcela e
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
	//construtor sem parametros ou padr�o
	public Pessoa() {
		super();
		
	}

}
