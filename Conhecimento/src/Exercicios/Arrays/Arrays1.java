package Exercicios.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {

        double[] Arr = new double[5];

        Arr[0] = 1.5;
        Arr[1] = 7.5;
        Arr[2] = 9.5;
        Arr[3] = 5.5;
        Arr[4] = 2.5;

        System.out.println(Arr[0]);
        System.out.println(Arrays.toString(Arr));

        double totalA = 0;

        for (int i = 0; i < Arr.length; i++) {
            totalA += Arr[i];
        }

        System.out.println("O valor total do Array é " + totalA);
        System.out.println("A media final e igual " + totalA / Arr.length);

    }
}
