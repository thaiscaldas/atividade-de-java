
public class ContaPoupanca extends Conta {

    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.printf("O seu saldo da conta poupança é R$ %.2f \n", getSaldo());
    }
}
