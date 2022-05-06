
public class Professor implements OperacoesFuncionarios {

    @Override
    public void receberSalario() {
        System.out.println("Professor está recebemdo salário...");
    }

    @Override
    public void mudarSetor() {
        System.out.println("Professor mudou de setor...");
    }

    @Override
    public void entrarDeFerias() {
        System.out.println("Professor esté entrando de férias..\n");
    }

}
