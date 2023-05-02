package com.games.demo.modelo;

import java.util.ArrayList;
import java.util.List;

import com.games.demo.excecao.ExplosaoException;

public class Campo {
    
    private final int linha;
    private final int coluna;

//  Comportamento dos campos


    private boolean aberto  = false; // por Default o campo sempre inicia false e  deixamos explicito
    private boolean minado  = false;
    private boolean marcado = false;

    public Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    private List<Campo> vizinhos = new ArrayList<>();

    public boolean adicionarVizinho (Campo vizinho) {
        // Verifica se o valor e diferente da posição atual
        boolean linhaDiferente = linha != vizinho.linha;
        boolean colunaDiferente = coluna != vizinho.coluna; 
        boolean diagonal = linhaDiferente && colunaDiferente;

        // Calcula valor absoluto se valor 1 ou 2 serão considerado vizinhos
        int deltaLinha = Math.abs(linha - vizinho.linha);
        int deltaColuna = Math.abs(coluna - vizinho.coluna);
        int deltaGeral = deltaColuna + deltaLinha;

        if(deltaGeral == 1 && !diagonal) {
            vizinhos.add(vizinho);
            return true;
        } else if(deltaGeral == 2 && diagonal) {
            vizinhos.add(vizinho);
            return true;
        } else {
            return false;
        }
    }

    public void alternarMarcação() {
        if(!aberto) {
            marcado = !marcado;
        }
    }

    public boolean abrir() {
        if(!aberto && !marcado) {
            aberto = true;
            if(minado) {
                throw new ExplosaoException();
            }

            if(vizinhancaSegura()) {
                vizinhos.forEach(v -> v.abrir());
            }

            return true;
        } else {
            return false;
        }

       
    }

    public boolean vizinhancaSegura() {
        return vizinhos.stream()
                       .noneMatch(v -> v.minado);

    }

    public boolean isMinado() {
        return minado;
    }

    public void minar() {
        minado = true;
    }

    public boolean isMarcado() {
        return marcado;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
    public Boolean isAberto(){
        return aberto;
    }

    public Boolean isFechado(){
        return !aberto;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public boolean objetivoAlcancado() {
        boolean desvendado = !minado && aberto;
        boolean protegido = minado && marcado;
        return desvendado || protegido;
    }    

    public long minasVizinhanca() {
        return vizinhos.stream().filter(v -> v.minado).count();
    }
    
    void reiniciar() {
        aberto = false;
        minado = false;
        marcado = false;
    }

    public String toString() {
        if (marcado) {
            return "x";
        } else if (aberto && minado) {
            return "*";
        } else if(aberto) {
            return " ";
        } else {
            return "?";
        }
    }
}
