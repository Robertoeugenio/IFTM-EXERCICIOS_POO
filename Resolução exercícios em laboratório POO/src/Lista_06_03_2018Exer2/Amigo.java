/**
 * @author Roberto Eugenio 
 * 2. (heran�a) Escreva uma classe chamada Pessoa com os atributos: nome (tipo String), sexo (tipo
char), idade (tipo int). Escreva agora outra classe chamada Amigo, que � uma pessoa (estende da
classe Pessoa) de quem sabemos o dia de seu anivers�rio, atributo diaDoAniversario (tipo
String). Use encapsulamento e forne�a construtor padr�o e construtor usando todos os atributos
para as duas classes.
 *
 */

package Lista_06_03_2018Exer2;


public class Amigo extends Pessoa {
	private String diaDoAnivers�rio;
	//constutor com todos os atributos 
	public Amigo(String nome, char sexo, int idade, String diaDoAnivers�rio) {
		super(nome, sexo, idade);
		this.diaDoAnivers�rio = diaDoAnivers�rio;
	}
	//construtor padrao 
	public Amigo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
	
}
