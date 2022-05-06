
public class Teste {

    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.receberSalario();
        professor.mudarSetor();
        professor.entrarDeFerias();

        Diretor diretor = new Diretor();
        diretor.receberSalario();
        diretor.mudarSetor();
        diretor.entrarDeFerias();

        Zelador zelador = new Zelador();
        zelador.receberSalario();
        zelador.mudarSetor();
        zelador.entrarDeFerias();

    }

}
