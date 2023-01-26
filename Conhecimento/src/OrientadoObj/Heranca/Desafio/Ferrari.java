package OrientadoObj.Heranca.Desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

private boolean ligaTurbo;
private boolean ligarAr;

public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setGiro(5);
    }
  
// @Override
public void ligaTurbo() {
    ligaTurbo = true;
}

@Override
public void desligaTurbo() {
    ligaTurbo = false;
        
}

// @Override
public void ligarAr() {
    ligarAr = true;
}

// @Override
public void desligarAr() {
    ligarAr = false;
}

// @Override
public int getGiro() {
    if (ligaTurbo && !ligarAr) {
        return 25;
    } else if (ligaTurbo && ligarAr) {
        return 20;
    } else if (!ligaTurbo && ligarAr) {
        return 15;
    }
    return 5;
}

}
