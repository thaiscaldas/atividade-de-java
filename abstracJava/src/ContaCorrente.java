
public class ContaCorrente extends Conta {

    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.printf("O seu saldo de sua corrente é R$ %.2f \n", getSaldo());
    }

}
