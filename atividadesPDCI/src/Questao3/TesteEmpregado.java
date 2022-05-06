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

import java.util.ArrayList;
import java.util.Scanner;

public class TesteEmpregado {

    public static void main(String[] args) {
        ArrayList<Empregado> empregados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Empregado empregado = new Empregado();
            System.out.print("Digite o nome: ");
            empregado.setNome(sc.nextLine());
            System.out.print("Ano de ingresso: ");
            empregado.setAnoDeIngreso(sc.nextInt());
            System.out.print("Salário: ");
            empregado.setSalario(sc.nextDouble());
            sc.nextLine();
            System.out.print("Endereço: ");
            empregado.setEndereço(sc.nextLine());
            System.out.println();
            empregados.add(empregado);
        }
        
        

        System.out.printf("Nome:               \tAno de Ingreso:        \tSalario:  \tEndereco:\n");
        for(int i = 0; i < empregados.size(); i++) {  
            System.out.printf("%s   ",empregados.get(i).getNome());
            System.out.printf("        \t%d",empregados.get(i).getAnoDeIngreso());
            System.out.printf("                \tR$ %.2f", empregados.get(i).getSalario());
            System.out.printf("\t%s\n",empregados.get(i).getEndereço());           
        }

    }
}
