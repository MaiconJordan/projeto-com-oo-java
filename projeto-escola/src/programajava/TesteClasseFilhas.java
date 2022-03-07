package programajava;

import programajavaclasses.Aluno;
import programajavaclasses.Diretor;
import programajavaclasses.Secretario;

public class TesteClasseFilhas {

    public static void main(String[] args) {

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Maicon");
        aluno2.setIdade(22);

        Diretor diretor1 = new Diretor();
        diretor1.setTempoDirecao(120);
        diretor1.setIdade(50);

        Secretario secretario1 = new Secretario();
        secretario1.setExperiencia("Administração");
        secretario1.setIdade(18);

        System.out.println(aluno2);

        System.out.println(aluno2.pessoaMaiorIdade() +" - " + aluno2.msgMaiorIdade() );

        System.out.println("salario é" + aluno2.salario() );



    }
}
