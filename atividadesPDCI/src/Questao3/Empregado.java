/*
3) (1,0) Escreva um programa que leia pelo teclado e imprima as informações (nome, ano de 
ingresso, salário, endereço) de três funcionários criando uma classe chamada 'Empregado'. Criar 
os atributos privados e os getters e setters para cada um. Inicializar os valores do objeto por meio 
dos setters. Resolver questão com ArrayList de Empregados, classe Scanner e utilizar laço for
para percorrer o ArrayList. Criar classe para teste. A saída deve ser parecida com a seguinte:

Nome          Ano de ingresso     Salário                   Endereço
Fulano        2010                R$ 4.204,23               Rua Alfa
Cicrano       2007                R$ 5.563,00               Rua Beta
Beltrano      2000                R$ 7.625,29               Rua Delta

 */
package Questao3;
/**
 * Alunos: 1 - Andrey Carlos Miranda da Silva 2 - Nalberth de Leão Castro 
 */
public class Empregado {
    
    private String nome, endereço;
    private int anoDeIngreso;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getAnoDeIngreso() {
        return anoDeIngreso;
    }

    public void setAnoDeIngreso(int anoDeIngreso) {
        this.anoDeIngreso = anoDeIngreso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
    
}
