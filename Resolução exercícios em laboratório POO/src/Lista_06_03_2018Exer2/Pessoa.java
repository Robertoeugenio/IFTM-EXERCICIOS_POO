/**
 * @author Roberto Eugenio 
 * 2. (herança) Escreva uma classe chamada Pessoa com os atributos: nome (tipo String), sexo (tipo
char), idade (tipo int). Escreva agora outra classe chamada Amigo, que é uma pessoa (estende da
classe Pessoa) de quem sabemos o dia de seu aniversário, atributo diaDoAniversario (tipo
String). Use encapsulamento e forneça construtor padrão e construtor usando todos os atributos
para as duas classes.
 *
 */
package Lista_06_03_2018Exer2;

public class Pessoa {
	private String nome;
	private char sexo;
	private int idade;
		//constutor usando todos os atributos 
	public Pessoa(String nome, char sexo, int idade) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}
		//construtor padrao
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

}
