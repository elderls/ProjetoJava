package com.games.demo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {
    
    private final int linha;
    private final int coluna;

//  Comportamento dos campos

    private boolean aberto  = false; // por Default o campo sempre inicia false, mas deixamos explicito
    private boolean minado  = false;
    private boolean marcado = false;

    private List<Campo> vizinhos = new ArrayList<>();

    public Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

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



    
}
