//Crie uma classe chamada "Cachorro" com os atributos nome, raça e idade. Implemente um método para latir.


public class Cachorro {

    private String nome;
    private String raca;
    private int idade;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRaca(){
        return raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void latir(){
        System.out.println("Auau");
    }
}
