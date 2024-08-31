package Iphone;

public class App {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Iphone.ReprodutorMusical reprodutor = iphone.new ReprodutorMusical();
        Iphone.AparelhoTelefonico aparelho = iphone.new AparelhoTelefonico();
        Iphone.NavegadorNaInternet navegador = iphone.new NavegadorNaInternet();

        reprodutor.selecionarMusica("Cricles - Post Malone");
        reprodutor.tocar();
        reprodutor.pausar();

        aparelho.ligar("(99) 99999-9999");
        aparelho.atender();
        aparelho.iniciarCorreioVoz();

        navegador.exibirPagina("www.google.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
