package programajavaclasses;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

        private String nome;
        private int idade;
        private String dataNascimento;
        private String cpf;
        private String nomeMae;
        private String codMatricula;


        /*Listas*/
        private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

        public void setDisciplinas(List<Disciplina> disciplinas) {
            this.disciplinas = disciplinas;
        }

        public List<Disciplina> getDisciplinas() {
            return disciplinas;
        }


        /*Construtor*/
        public Aluno () {

        }

        public Aluno(String nomePadrao) {
            nome = nomePadrao;
        }


        /* getters e setters*/



        @Override
        public String toString() {
            return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", nomeMae="
                    + nomeMae + ", codMatricula=" + codMatricula + "]";
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public String getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(String dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getNomeMae() {
            return nomeMae;
        }

        public void setNomeMae(String nomeMae) {
            this.nomeMae = nomeMae;
        }

        public String getCodMatricula() {
            return codMatricula;
        }

        public void setCodMatricula(String codMatricula) {
            this.codMatricula = codMatricula;
        }



        /*metodos*/

        /* metodo que calcula a media do aluno*/

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((codMatricula == null) ? 0 : codMatricula.hashCode());
            result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
            result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
            result = prime * result + ((disciplinas == null) ? 0 : disciplinas.hashCode());
            result = prime * result + idade;
            result = prime * result + ((nome == null) ? 0 : nome.hashCode());
            result = prime * result + ((nomeMae == null) ? 0 : nomeMae.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Aluno other = (Aluno) obj;
            if (codMatricula == null) {
                if (other.codMatricula != null)
                    return false;
            } else if (!codMatricula.equals(other.codMatricula))
                return false;
            if (cpf == null) {
                if (other.cpf != null)
                    return false;
            } else if (!cpf.equals(other.cpf))
                return false;
            if (dataNascimento == null) {
                if (other.dataNascimento != null)
                    return false;
            } else if (!dataNascimento.equals(other.dataNascimento))
                return false;
            if (disciplinas == null) {
                if (other.disciplinas != null)
                    return false;
            } else if (!disciplinas.equals(other.disciplinas))
                return false;
            if (idade != other.idade)
                return false;
            if (nome == null) {
                if (other.nome != null)
                    return false;
            } else if (!nome.equals(other.nome))
                return false;
            if (nomeMae == null) {
                if (other.nomeMae != null)
                    return false;
            } else if (!nomeMae.equals(other.nomeMae))
                return false;
            return true;
        }

        public double getMediaNota() {

            double somaNotas = 0.0;
            for (Disciplina disciplina : disciplinas) {
                somaNotas += disciplina.getNota();
            }
            return somaNotas / disciplinas.size();

        }

        /* metodo para dizer se o aluo está aprovado*/

        public boolean getAprovado() {
            double mediaNota = this.getMediaNota();
            if(mediaNota >= 70) {
                return true;
            } else {}
            return false;
        }

        /*metodo pra dizer se o aluno está aprovado com a string*/

        public String getAprovado2() {
            double mediaNota = this.getMediaNota();
            if(mediaNota >= 50) {
                if(mediaNota >= 70) {
                    return "Aluno está aprovado";
                } else {
                    return "Aluno está em recuperação";
                }
            } else {
                return "Aluno está reprovado";
            }

        }

}
