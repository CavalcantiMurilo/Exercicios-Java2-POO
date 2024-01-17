// Crie uma classe chamada "Retangulo" com os atributos comprimento e largura. Implemente um método para calcular a área do retângulo.


public class Retangulo {

    private double comprimento;
    private double largura;

    public double getComprimento(){
        return comprimento;
    }

    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }

    public double getLargura(){
        return largura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public double areaRetangulo(){
        return largura * comprimento;
    }

}
