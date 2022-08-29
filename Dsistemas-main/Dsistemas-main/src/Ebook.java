public class Ebook extends Livro implements Ipromocional{


    public Ebook(String nam, double valor, String mail, Autor aut) {
        super(nam, valor, mail, aut);
    }

    @Override
    public double aplicaDesconto(double porcentagem) {
        if (porcentagem <= 30){
            Double valorComDesconto =(this.getvalor()*(porcentagem/100));
            return valorComDesconto;
        }else {
            return (this.getvalor() * 0.30 );}
    }
}
