public class Livro implements Iproduto {

    private String name;
    private String descricao;
    private Double valor;
    private Autor aut;

    public Livro(String nam, double valor, String descricao, Autor aut) {
        this.name = nam;
        this.descricao = descricao;
        this.valor = valor;
        this.aut = aut;
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

    public Autor getAutor(){return  this.aut;}

    public void mostrarDetalhes(){
        System.out.println("Titulo:  " + this.getNome() );
        System.out.println("Descrição:  "+ this.getDescricao());
        System.out.println("Valor: " + this.getvalor());
        System.out.println("Autor: " + this.aut.ToString());
    }

    public  String ToString(){
        return "nome: "+ this.name + "Descrição: "+ this.descricao + "Valor: " + this.valor + "   "+ this.aut;
    }

}
