import java.util.HashSet;
 

public class Hash {

    public static void main(String[] args) {
        HashSet <Usuario> usuarios = new HashSet<Usuario>();
        
        usuarios.add(new Usuario("elder"));
        usuarios.add(new Usuario("LAIZA"));
        usuarios.add(new Usuario("LELE"));

        Boolean result = usuarios.contains(new Usuario("LELE"));

        System.out.print(result);



 
    }
}
