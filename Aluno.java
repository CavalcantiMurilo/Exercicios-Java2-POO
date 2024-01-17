//Crie uma classe chamada "Aluno" com os atributos nome e nota. Implemente um método para calcular a média das notas de um grupo de alunos.


public class Aluno {
    private String nome;
    private double nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getNota(){
        return nota;
    }

    public void setNota(double nota){
        this.nota = nota;
    }

    public double CalculaMedia(double[] notas, int contador){

        double soma =0;

        for(int i=0; i<contador; i++){

            soma += notas[i];
        }

        return (soma/contador);
    }
}


