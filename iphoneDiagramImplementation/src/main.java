import Iphone.Iphone;

public class main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("====== AparelhoTelefonico ======");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("====== ReprodutorMusical ======");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println("====== Navegador de Internet ======");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
