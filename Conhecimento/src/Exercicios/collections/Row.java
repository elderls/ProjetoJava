import java.util.LinkedList;
import java.util.Queue;

public class Row {
    public static void main(String[] args) {
        
        Queue<String> Row = new LinkedList<>();

        Row.add("ELDER");
        Row.offer("LUAN");
        // PEEK E ELEMENT OBTER PROXIMO ELEMENTO DA FILA SEM REMOVER 
        System.out.println(Row.peek()); // RETORNA NULL, CASO N AJA REG. NA FILA
        System.out.println(Row.element());// LANÇA UMA EXCEPT

        Row.size();
        Row.clear();
        Row.isEmpty();

    


    }
}
