public class Operadores {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

    // primeiro calculo    
        int c =  6 * ( a + b);        
        int d = (int) Math.pow(c, 2);
        int result1 = d / (3 * 2);

        System.out.println(result1);

    // Segundo calculo
        int e = (1 - 5) * (b - 7) / 2;
        int result2 = (int) Math.pow(e, 2);
        System.out.println(result2);

        int calc = (result1 - result2);

        int elev3 = (int) Math.pow(calc, 3);

        int elev = (int) Math.pow(10, 3);

        int resultado = elev3 / elev;

        System.out.println("O valor final é igual a " + resultado);

    }
}
