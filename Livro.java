// Crie uma classe chamada "Livro" com os atributos título, autor e ano de publicação. Implemente um método para exibir as informações do livro.


public class Livro {

    private String titulo;
    private String autor;
    private int ano;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano= ano;
    }

    public String toString(){
        return "INFORMAÇÕES: Titulo - "
                + titulo
                + "| Autor - "
                + autor
                + "| Publicação - "
                + ano;
    }
}
