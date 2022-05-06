
public class Diretor implements OperacoesFuncionarios {

    @Override
    public void receberSalario() {
        System.out.println("Diretor está recebendo salário...");
    }

    @Override
    public void mudarSetor() {
        System.out.println("Diretor mudou de setor....");
    }

    @Override
    public void entrarDeFerias() {
        System.out.println("Diretor entrou de férias....\n");
    }

}
