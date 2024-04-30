package com.apple.iphone.classes;

import com.apple.iphone.interfaces.AparelhoTelefonico;
import com.apple.iphone.interfaces.NavegadorInternet;
import com.apple.iphone.interfaces.ReprodutorMusicial;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusicial {

    /**
     * Permite atender uma chamada no iPhone
     */
    public void atender() {
        System.out.println("Atendendo chamada no iPhone");
    }

    /**
     * Inicia o correio de voz no iPhone
     */
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correio de voz no iPhone");
    }

    /**
     * Liga para um numero de telefone no iPhone
     * 
     * @param numeroTelefone Numero de telefone para ligar
     */
    public void ligar(String numeroTelefone) {
        System.out.println("Ligando para " + numeroTelefone + " no iPhone");
    }

    /**
     * Adiciona uma nova aba no navegador de internet do iPhone
     */
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no iPhone");
    }

    /**
     * Atualiza uma pagina no navegador de internet do iPhone
     * 
     * @param numeroAba Numero da aba a ser atualizada (onde a pagina esta aberta)
     */
    public void atualizarPagina(int numeroAba) {
        System.out.println("Atualizando aba " + numeroAba + " no iPhone");
    }

    /**
     * Exibe uma pagina no navegador de internet do iPhone
     * 
     * @param url URL da pagina a ser exibida
     */
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina " + url + " no iPhone");
    }

    /**
     * Pausa a musica corrente no iPhone
     */
    public void pausar() {
        System.out.println("Pausando música no iPhone");
    }

    /**
     * Seleciona uma musica no iPhone
     * 
     * @param musicaId ID da musica a ser selecionada
     */
    public void selecionarMusica(int musicaId) {
        System.out.println("Selecionando música " + musicaId + " no iPhone");
    }

    /**
     * Toca a musica corrente no iPhone, previamente selecionada com o metodo
     * selecionarMusica
     */
    public void tocar() {
        System.out.println("Tocando música no iPhone");
    }

    // metodos especificos do iPhone

    /**
     * Fotografa com o iPhone
     */
    public void fotografar() {
        System.out.println("Fotografando com o iPhone");
    }

    /**
     * Sincroniza os contatos do iPhone com um dispositivo
     * 
     * @param dispositivoId ID do dispositivo para sincronizar
     */
    public void sincronizarContatos(int dispositivoId) {
        System.out.println("Sincronizando contatos com o dispositivo " + dispositivoId);
    }

}
