// Crie uma classe chamada "Carro" com os atributos modelo, marca e ano. Implemente os métodos necessários para definir e obter os valores desses atributos.


public class Carro {

    private String modelo;
    private String marca;
    private int ano;

    public String getModelo(){

        return modelo;
    }
    public void setModelo(String modelo){

        this.modelo = modelo;
    }

    public String getMarca(){

        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){

        this.ano = ano;
    }
}
