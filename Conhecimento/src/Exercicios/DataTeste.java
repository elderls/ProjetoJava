package Exercicios;

public class DataTeste {
    public static void main(String[] args) {
        Data p1 = new Data(); 
        p1.dia = 10;
        p1.mes = 12;
        p1.ano = 1984;

        var p2 = new Data();
        p2.ano = 1984;
        p2.mes = 07;
        p2.dia = 10;


        System.out.println("data " + p1.dia +  p1.mes  + p1.ano );
        System.out.println("data " + p1.dia + "/" + p1.mes + "/" + p1.ano );
        System.out.println(p1.obterFormatacao());

    }
}
