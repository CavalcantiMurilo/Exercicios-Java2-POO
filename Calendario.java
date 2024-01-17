import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendario {
    private String dia;
    private String mes;
    private String ano;

    public String getDia(){
        return dia;
    }

    public void setDia(String dia){
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void validaData(){

        String juncao = dia + "/" + mes + "/" + ano;

        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyy");
        formatador.setLenient(false);

        try {
            formatador.parse(juncao);
            System.out.println("Data válida!");
            System.out.println(dia + "/" + mes + "/" + ano);

        } catch (Exception ex) {
            System.out.println("Data inválida!");
            System.out.println(dia + "/" + mes + "/" + ano);
        }

    }
}


//---------------------------------------
//Exemplo de uso

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Calendario objeto = new Calendario();

        Scanner sc = new Scanner(System.in);

        objeto.setDia("1");
        objeto.setMes("2");
        objeto.setAno("2030");

        objeto.validaData();

        sc.close();
    }
}



