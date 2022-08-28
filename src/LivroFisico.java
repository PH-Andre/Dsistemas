public class LivroFisico extends Livro implements Ipromocional{



    public LivroFisico(String nam, double valor, String mail) {
        super(nam, valor, mail);
    }

    @Override
    public boolean aplicaDesconto(double porcentagem) {
        return false;
    }

    @Override
    public String ToString(){
        return "";
    };
}
