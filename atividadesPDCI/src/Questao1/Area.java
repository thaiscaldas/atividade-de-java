/* 
01 - Escreva um programa para imprimir a área de um retângulo criando uma classe chamada 
Area com dois métodos. O primeiro método chamado setDim() recebe comprimento e largura do 
retângulo como parâmetros e o segundo método chamado getArea() retorna a área do retângulo. 
O comprimento e a largura do retângulo são inseridos através do teclado e por meio de uma 
classe teste.

 */
package Questao1;

/**
 * Alunos: 1 - Andrey Carlos Miranda da Silva 2 - Nalberth de Leão Castro
 */
public class Area {

    int comprimento, largura, area;

    public void setDim(int comprimento, int largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int getArea() {
        area = comprimento * largura;
        return area;
    }
}
