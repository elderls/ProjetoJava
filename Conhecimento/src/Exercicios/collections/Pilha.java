import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> book = new ArrayDeque<>();

        book.add("pequeno principe");
        book.push("Don Quixote");

        for(String livro:book) {
            System.out.println(livro);
        }
    }
}
