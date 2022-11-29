package Exercicios.Arrays;

public class ArrayForeach {
    public static void main(String[] args) {
        double Arr[] = new double [5];

        Arr[0] = 5;
        Arr[1] = 6;
        Arr[2] = 7;
        Arr[3] = 8;
        Arr[4] = 9;

        for (double Arrs:Arr) {
            System.out.println(Arrs);
        }
    }
}
