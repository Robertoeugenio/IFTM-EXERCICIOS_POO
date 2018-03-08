/**
 * autor Roberto Eugenio 
 * 8. (interface, polimorfismo) Escreva uma interface chamada FormaGeometrica, que declara os
seguintes métodos:
Assinatura double calcularPerimetro()
Assinatura double calcularArea()

Escreva uma classe para representar retângulos que implementa a interface FormaGeometrica,
com os atributos base (tipo double) e altura (tipo double). O construtor recebe o tamanho da
base e da altura e armazena nos respectivos campos. Esta classe deve implementar os métodos
declarados na interface, usando as fórmulas: perímetro = 2*base+2*altura e área=base*altura.
Escreva uma classe para representar círculos que implementa a interface FormaGeometrica,
com os atributos raio (tipo double). O construtor recebe o tamanho do raio e armazena no
campo. Use sempre encapsulamento. Escreva um programa com um método main que cria um
retângulo com base 3 e altura 4 e um círculo com raio 5 e armazene estes objetos em uma lista.
Em seguida, imprima os perímetros e as áreas de todas as formas usando um laço for.
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