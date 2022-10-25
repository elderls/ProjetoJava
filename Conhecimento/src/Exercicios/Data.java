package Exercicios;

public class Data {
    int dia;
    int mes;
    int ano;

    Data() {
        dia = 01;
        mes = 01;
        ano = 1970; 
     }

    Data(int dianew, int mesnew, int anonew) {
        dia = dianew;
        mes = mesnew;
        ano = anonew; 
    }

    String obterFormatacao(){

        return String.format("O dia do processamento é %d/%d/%d",dia, mes, ano) ;
    } 


}
