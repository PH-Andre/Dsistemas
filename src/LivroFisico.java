public class LivroFisico extends Livro implements Ipromocional, IversaoFisica{



    public LivroFisico(String nam, double valor, String mail, Autor autt) {
        super(nam, valor, mail, autt);
    }




    @Override
    public double aplicaDesconto(double porcentagem) {
        if (porcentagem <= 5){
            Double valorComDesconto =(this.getvalor()*(porcentagem/100));
            return valorComDesconto;
        }else {
            return (this.getvalor() * 0.05 );}
    }

    @Override
    public double getTaxadeimpressão() {
        return (this.getvalor()*0.05);
    }




}
