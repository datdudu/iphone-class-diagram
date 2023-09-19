package Iphone;

import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    @Override
    public void ligar() {
        System.out.println("Ligando pelo Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Pelo Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz pelo Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musicas pelo Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica no Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Musica no Iphone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina no Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Aba no Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina no Iphone");
    }
}
