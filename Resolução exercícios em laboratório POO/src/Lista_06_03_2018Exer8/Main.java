/**
 * autor Roberto Eugenio 
 * 8. (interface, polimorfismo) Escreva uma interface chamada FormaGeometrica, que declara os
seguintes m�todos:
Assinatura double calcularPerimetro()
Assinatura double calcularArea()

Escreva uma classe para representar ret�ngulos que implementa a interface FormaGeometrica,
com os atributos base (tipo double) e altura (tipo double). O construtor recebe o tamanho da
base e da altura e armazena nos respectivos campos. Esta classe deve implementar os m�todos
declarados na interface, usando as f�rmulas: per�metro = 2*base+2*altura e �rea=base*altura.
Escreva uma classe para representar c�rculos que implementa a interface FormaGeometrica,
com os atributos raio (tipo double). O construtor recebe o tamanho do raio e armazena no
campo. Use sempre encapsulamento. Escreva um programa com um m�todo main que cria um
ret�ngulo com base 3 e altura 4 e um c�rculo com raio 5 e armazene estes objetos em uma lista.
Em seguida, imprima os per�metros e as �reas de todas as formas usando um la�o for.
 */
package Lista_06_03_2018Exer8;

public class Main {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(3, 4);
        Circulo c1 = new Circulo(5);

        FormaGeometrica formas[] = {r1, c1};

        for (int i = 0; i < formas.length; i++) {
            System.out.printf("Perimetro: %.2f\n", formas[i].calcularPerimetro());
            System.out.printf("Area: %.2f\n", formas[i].calcularArea());
            System.out.println("-------");
        }
    }
}