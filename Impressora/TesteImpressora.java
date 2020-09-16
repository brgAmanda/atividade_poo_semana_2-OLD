public class TesteImpressora {
    public static void main(String... args) {

        Impressora c = new Impressora();
        c.exibir(0.1f);
        c.exibir(0.2f, 0.3f);
        c.exibir(0.4f, "0.5");
        c.exibir("0.6", 0.7f);
        c.exibir("0.8", "0.9", "10.0");
        c.exibir(11, "12");
    }
}
