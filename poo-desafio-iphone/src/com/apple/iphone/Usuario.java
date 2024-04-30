package com.apple.iphone;

import com.apple.iphone.classes.Iphone;

public class Usuario {
    public static void main(String[] args) {
        // Nao coloquei o usuario no diagrama porque achei que nao era o proposito do
        // exercicio, ja que
        // o usuario eh apenas uma classe para testar o funcionamento do Iphone
        Iphone iphone = new Iphone();
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorrerioVoz();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina(1);
        iphone.exibirPagina("https://www.google.com");
        iphone.selecionarMusica(1);
        iphone.tocar();
        iphone.pausar();
        iphone.fotografar();
    }
}
