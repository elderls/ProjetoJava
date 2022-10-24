package Exercicios;

public class Data {
    int dia;
    int mes;
    int ano;


    String obterFormatacao(){

        return String.format("O dia do processamento é %d/%d/%d",dia, mes, ano) ;
    } 
}
