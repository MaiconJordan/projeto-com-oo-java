package programajava;

import programajavaclasses.Aluno;
import programajavaclasses.Diretor;
import programajavaclasses.Secretario;

public class TesteClasseFilhas {

    public static void main(String[] args) {

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Maicon");

        Diretor diretor1 = new Diretor();
        diretor1.setTempoDirecao(120);

        Secretario secretario1 = new Secretario();
        secretario1.setExperiencia("Administração");

        System.out.println(aluno2);

    }
}
