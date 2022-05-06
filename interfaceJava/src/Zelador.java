
public class Zelador implements OperacoesFuncionarios {

    @Override
    public void receberSalario() {
        System.out.println("Zelador está recebemdo salário....");
    }

    @Override
    public void mudarSetor() {
        System.out.println("Zelador mudou de setor....");
    }

    @Override
    public void entrarDeFerias() {
        System.out.println("Zelador entrou de férias...\n");
    }

}
