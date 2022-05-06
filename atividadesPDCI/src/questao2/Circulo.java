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

/**
 * Alunos: 1 - Andrey Carlos Miranda da Silva 2 - Nalberth de Leão Castro 
 */
public class Circulo {
    
    private double raio;
    private String cor;
    
    public Circulo(){   
        raio = 1.0;
        cor = "azul";
    }
    
    public Circulo(double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    
    public String getCor() {
        return cor;
    }
    
    public double getArea(){
        double area;
        area = (Math.PI * (raio * raio));
        return area;
    }
    
    public void imprimirInformacao(){
        System.out.print("Cor do circulo: " + getCor() + "\n");
        System.out.print("Raio do circulo: " + getRaio() + "\n");
        System.out.print("Area do circulo: " + getArea() + " u.a\n");
        
    }

}
