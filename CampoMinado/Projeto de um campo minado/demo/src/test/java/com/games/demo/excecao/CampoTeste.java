package com.games.demo.excecao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.games.demo.modelo.Campo;

public class CampoTeste {
    private Campo campo;

    @BeforeEach
    void iniciarCampo() {
        campo = new Campo(3,3);
    }

    @Test
    void testeVizinhoDistancia1Esquerdo() {
        Campo vizinho = new Campo(3, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia1Direito() {
        Campo vizinho = new Campo(3, 4);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia1Superior() {
        Campo vizinho = new Campo(2, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia1Inferior() {
        Campo vizinho = new Campo(4, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia2Diagonais(){
        Campo vizinho = new Campo(2 , 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    void testeNaoVizinho(){
        Campo vizinho = new Campo(1 , 1);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertFalse(resultado);
    }

    @Test
    void testeValorPadraoAtrbutoMarcado() {
        assertFalse( campo.isMarcado());
    } 

    @Test
    void testeAlternarMarcacao() {
        campo.alternarMarcação();
        assertTrue( campo.isMarcado());
    }
    
    @Test
    void testeAlternarMarcacaoDuasChamadas() {
        campo.alternarMarcação();
        campo.alternarMarcação();
        assertFalse( campo.isMarcado());
    }

    @Test
    void testeNaoMinadoNaoMarcado() {
        assertTrue(campo.abrir());
    }

    @Test
    void testeNaoMinadoMarcado() {
        campo.alternarMarcação();
        assertFalse(campo.abrir());
    }    

    @Test
    void testeAbrirMinadoMarcado() {
        campo.alternarMarcação();
        campo.minar();
        assertFalse(campo.abrir());
    }       
    
    @Test
    void testeAbrirMinadoNaoMarcado() {
        campo.minar();

        assertThrows(ExplosaoException.class, () -> {
            campo.abrir();
        });
    }   

    // @Test
    // void testeAbrirVizinhos() {
        
    //     campo.minar();
    //     assertTrue(campo.abrir());
    // }  
    
    @Test
    void testeAbrirComVizinhos1() {
        Campo campo11 = new Campo(1, 1);
        Campo campo22 = new Campo(2, 2);

        campo22.adicionarVizinho(campo11);
        campo.adicionarVizinho(campo22);
        campo.abrir();

        assertTrue(campo22.isAberto() && campo11.isAberto());
    }   
    
    @Test
    void testeAbrirComVizinhos2() {
        Campo campo11 = new Campo(1, 1);
        Campo campo12 = new Campo(1, 1);
        campo12.minar();

        Campo campo22 = new Campo(2, 2);
        campo22.adicionarVizinho(campo11);
        campo22.adicionarVizinho(campo12);
        
        campo.adicionarVizinho(campo22);
        campo.abrir();

        assertTrue(campo22.isAberto() && campo11.isFechado());
    }  
}
