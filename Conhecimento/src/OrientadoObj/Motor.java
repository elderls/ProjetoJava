package OrientadoObj;

public class Motor {

    double fatorinj = 1;
    boolean ligado = false;

    int giros() {

        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorinj * 3000) ;
        }

    }
    
}
