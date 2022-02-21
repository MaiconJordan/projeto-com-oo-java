package conta.bancaria;

public class ProgramaBanco {

    public static void main(String[] args) {

        ContaBancaria bancario = new ContaBancaria();

        bancario.setConta("C010101 - Maicon");

        System.out.println(bancario);

        bancario.depositarDinheiro(1000);

        System.out.println(bancario);

        bancario.sacaDinheiro(2500);

        System.out.println(bancario);

    }
}
