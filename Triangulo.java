// Crie uma classe chamada "Triangulo" com os atributos lado1, lado2 e lado3. Implemente um método para verificar se os lados formam um triângulo válido.


public class Triangulo {

    private double lado1;
    private double lado2;
    private double lado3;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public void Validacao(){
        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2){
            System.out.println("Os três lados formam um triângulo válido!");
        }else{
            System.out.println("Os lados não formam um triângulo válido!");
        }
    }
}
