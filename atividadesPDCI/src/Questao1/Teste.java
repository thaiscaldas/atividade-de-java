/*
 01 - Escreva um programa para imprimir a área de um retângulo criando uma classe chamada 
Area com dois métodos. O primeiro método chamado setDim() recebe comprimento e largura do 
retângulo como parâmetros e o segundo método chamado getArea() retorna a área do retângulo. 
O comprimento e a largura do retângulo são inseridos através do teclado e por meio de uma 
classe teste.

 */
package Questao1;

import java.util.Scanner; 

public class Teste {
    public static void main(String[] args) {
        Area retangulo = new Area();
        Scanner sc = new Scanner(System.in);
        int comprimento,largura;
        
        System.out.print("Digite o comprimento do Retângulo: ");
        comprimento = sc.nextInt();
        
        System.out.print("Digite a largura do triângulo: ");
        largura = sc.nextInt();
       
        retangulo.setDim(comprimento, largura);
        
        System.out.print("\nArea do retangulo igual: " +  retangulo.getArea() + " u.a \n");
        
    }
}


