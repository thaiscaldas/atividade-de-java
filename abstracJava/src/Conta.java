
abstract class Conta {

    private double saldo;

    public abstract void imprimirExtrato();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
