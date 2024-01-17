//- Crie uma classe chamada "Pessoa" com os atributos nome, idade e altura. Implemente um método para verificar se uma pessoa é maior de idade.


public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void maiorIdade(){
        if(idade>=18){
            System.out.println("Você é maior de idade! ");
        }else{
            System.out.println("Você não é maior de idade!");
        }
    }

}
