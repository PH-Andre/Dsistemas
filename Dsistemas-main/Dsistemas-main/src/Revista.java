public class Revista implements Ipromocional,Iproduto,IversaoFisica{
    private String nome;
    private String descricao;
    private Double valor;
    private Editora edit;

    public Revista(String nome,String descricao, Double valor, Editora edit) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.edit = edit;
    }

    @Override
    public double getvalor() {
        return this.valor;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getDescricao() {
       return this.descricao;
    }

    @Override
    public double aplicaDesconto(double porcentagem) {
        if (porcentagem <= 10){
            Double valorComDesconto =(this.valor *(porcentagem/100));
            return valorComDesconto;
        }else {
        return (this.valor * 0.10 );}
    }
    public void mostrarDetalhes(){
        System.out.println("Titulo:  " + this.getNome() );
        System.out.println("Descrição:  "+ this.getDescricao());
        System.out.println("Valor: " + this.getvalor());
        System.out.println("Editora: " + this.edit.ToString());
    };


    public String toString(){
        return "nome: "+ nome + "Descrição:  "+ descricao + "   Valor: "+ valor +  "  Editora: " + edit.toString();
    }

    @Override
    public double getTaxadeimpressão() {
        return (this.valor*0.05);
    }
}
