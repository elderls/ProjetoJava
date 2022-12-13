package Exercicios.collections.Hashset;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

//      Set<String> listaAprovados = new HashSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Larrisa");
        listaAprovados.add("Luana");
        listaAprovados.add("Maria Eduarda");
        listaAprovados.add("Luan");

        for(String cand: listaAprovados) {
            System.out.println(cand);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(11);
        nums.add(111);
        nums.add(1111);

        for (int s: nums) {
            System.out.println(s);
        }



    }


    
    
}
