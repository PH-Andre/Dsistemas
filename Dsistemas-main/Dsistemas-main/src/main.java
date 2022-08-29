public class main {

    public static void main(String[] args) {

        Autor a1 = new Autor("paulo","paulohenrique.aandre@hotmail.com");
        LivroFisico l1 = new LivroFisico("A casa da vó chica",19.90,"livro conta a historia da tia chica e sua casa, onde ela passa todo seu tempo assistindo tv e fazendo Hidromel",a1);
        Ebook ebook1 = new Ebook("Gamer Codigos",20.00,"Lista de comandos mortal Kombat",a1);

        Editora e1 = new Editora("Editora Ifrs", "100200300501");
        Revista r1 = new Revista("Ciencia todo dia","fala sobre buracos negros super macivos", 199.50, e1);

        System.out.println("autor _______");
        a1.mostrarDetalhes();
        System.out.println("  ");
        System.out.println("Livro-------");
        l1.mostrarDetalhes();
        System.out.println(" ");
        System.out.println("revista------");
        r1.mostrarDetalhes();

        System.out.println("taxa impressão:"+ r1.getTaxadeimpressão());
        System.out.println("  ");
        System.out.println("ebook------------");
        ebook1.mostrarDetalhes();

    }
}
