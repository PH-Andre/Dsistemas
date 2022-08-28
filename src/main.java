public class main {

    public static void main(String[] args) {
        Autor a1 = new Autor("paulo","paulohenrique.aandre@hotmail.com");
        Livro l1 = new LivroFisico("A casa da vó chica",19.90,"livro conta a historia da tia chica e sua casa, onde ela passa todo seu tempo assistindo tv e fazendo Hidromel");

        a1.mostrarDetalhes();
        l1.mostrarDetalhes();
    }
}
