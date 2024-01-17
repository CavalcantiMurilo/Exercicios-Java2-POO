// Crie uma classe chamada "ContaBancaria" com os atributos número da conta e saldo. Implemente os métodos para depositar e sacar dinheiro da conta.


public class ContaBancaria {

    private String numeroConta;
    private double saldo;

    public String getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double quantidade){
        this.saldo += quantidade;
    }

    public void sacar(double quantidade){
        this.saldo -= quantidade;
    }

}
