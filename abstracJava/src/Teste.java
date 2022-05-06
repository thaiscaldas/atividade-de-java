
import java.util.Scanner;


public class Teste {
    
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do depósito : ");
        cc.depositar(sc.nextDouble());
        cc.imprimirExtrato();
        
        ContaPoupanca cp = new ContaPoupanca();
        System.out.print("Digite o valor do depósito: ");
        cp.depositar(sc.nextDouble());
        cp.imprimirExtrato();
        
        
    }

}
