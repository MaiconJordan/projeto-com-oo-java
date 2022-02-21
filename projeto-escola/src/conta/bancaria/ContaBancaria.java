package conta.bancaria;

public class ContaBancaria {

    /*principio basico de SOLID aonde a classe realiza os metodos necessarios a elas*/

    private String conta;
    private double saldo = 8000;

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "conta='" + conta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    /*Metodos*/

    public void depositarDinheiro(double deposito){
        saldo += deposito;
    }

    public void sacaDinheiro(double sacar){
        saldo -= sacar;
    }


}
