/*
 2) (1,0) Crie uma classe Circulo com os atributos privados raio (do tipo double) e cor (do tipo 
String) inicializados no construtor padrão com os valores 1.0 e “azul”, respectivamente. Criar 
dois construtores – um construtor padrão sem argumento e um construtor que recebe um 
argumento double para o raio. Criar três métodos públicos getRaio(), getCor() e getArea() que 
devem retornar o raio do círculo, a cor e a área, respectivamente. Para calcular a área, utilizar a 
constante do Java Math.PI. Crie também um método para imprimir as informações do círculo.
Criar classe para teste.
 */
package questao2;

public class Teste {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        
      
        circulo.imprimirInformacao();
         
    }
    
}
