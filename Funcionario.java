//Crie uma classe chamada "Funcionario" com os atributos nome, cargo e salário. Implemente um método para aumentar o salário do funcionário em uma determinada
porcentagem

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double aumentaSalario(double porcentagem){
        return (this.salario + (this.salario * porcentagem / 100));
    }
}
