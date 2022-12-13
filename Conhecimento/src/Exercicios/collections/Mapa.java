import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "luazin");
        usuarios.put(2, "lulu");
        usuarios.put(3, "duda");
        usuarios.put(4, "lari");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty()); // verifica se o mapa esta vazio, se estiver vazio ele envia true

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(1));

        // somente chave
        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        // somente valor
        for (String valor:usuarios.values()){
            System.out.println(valor);
        }
        // percorre as chave e os valores
        for(java.util.Map.Entry<Integer, String> registro:usuarios.entrySet()){
            System.out.print(registro.getKey());
            System.out.println(registro.getValue());
        }
    }
}
