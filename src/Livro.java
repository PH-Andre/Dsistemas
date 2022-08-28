public class Livro implements Iproduto {

    private String name;
    private String descricao;
    private Double valor;

    private Autor autor;

    public Livro(String nam, double valor, String mail) {
        this.name = nam;
        this.descricao = mail;
        this.valor = valor;
    }

    @Override
    public double getvalor() {
        return this.valor;
    }

    @Override
    public String getNome() {
        return this.name;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    public void mostrarDetalhes(){
        System.out.println("Titulo:  " + this.getNome() );
        System.out.println("Descrição:  "+ this.getDescricao());
        System.out.println("Valor: " + this.getvalor());
    };

}
