package programajava;

import cursojava.constantes.StatusAluno;
import programajavaclasses.Aluno;
import programajavaclasses.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Programa {

    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<Aluno>();

        List<Aluno> alunosAprovados = new ArrayList<Aluno>();
        List<Aluno> alunosReprovados = new ArrayList<Aluno>();
        List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();

        for(int qtd = 1 ; qtd <= 5 ; qtd++) {

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno");
		/*String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno");
		String nomeMae = JOptionPane.showInputDialog("QQual o nome da mãe do aluno");
		String codMatricula = JOptionPane.showInputDialog("Qual o codido de matricula do aluno");*/

        Aluno aluno1 = new Aluno();

        aluno1.setNome(nome);
		/*aluno1.setCpf(cpf);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNomeMae(nomeMae);
		aluno1.setCodMatricula(codMatricula);*/

        for (int pos = 1; pos <= 1; pos++) {
            String nomeDisciplina = JOptionPane.showInputDialog("Qual a o nome da disciplina " + pos + " ?");
            String notaDisciplina = JOptionPane.showInputDialog("Qual a nota da disciplina " + pos + " ?");
           // System.out.println("------------------------------------------------------------");

            Disciplina disciplinas = new Disciplina();

            disciplinas.setDisciplina(nomeDisciplina);
            disciplinas.setNota(Double.valueOf(notaDisciplina));

            aluno1.getDisciplinas().add(disciplinas);

        }

        /* comando para remover uma disciplina/nota da lista*/

        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina");

        if (escolha == 0) {

            String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3 ou 4?");
            aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);

        }

        alunos.add(aluno1);

    }
        for(Aluno aluno : alunos){
            if (aluno.getAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)){
                alunosAprovados.add(aluno);
            } else if (aluno.getAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)){
                alunosRecuperacao.add(aluno);
            } else if (aluno.getAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)){
                alunosReprovados.add(aluno);
            }
        }

        System.out.println("--------------------------Lista Aprovados ---------------------------");
        for(Aluno aluno : alunosAprovados){
            System.out.println(aluno.getNome() + " Resultado = " + aluno.getAprovado2() + " com média de = " + aluno.getMediaNota());

        }
        System.out.println("--------------------------Lista Reprovados ---------------------------");
        for(Aluno aluno : alunosReprovados){
            System.out.println(aluno.getNome() +" Resultado = " + aluno.getAprovado2() + " com média de = " + aluno.getMediaNota());

        }
        System.out.println("--------------------------Lista Recuperacao ---------------------------");
        for(Aluno aluno : alunosRecuperacao){
            System.out.println(aluno.getNome() +" Resultado = " + aluno.getAprovado2() + " com média de = " + aluno.getMediaNota());

        }






    }

}


