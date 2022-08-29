public class Editora {
    private String nomeFantasia;
    private String CNPJ;

    public Editora(String name, String cnpj){
        this.nomeFantasia = name;
        this.CNPJ = cnpj;
    }

    public String getNome(){
        return nomeFantasia;
    }
    public String getCNPJ(){
        return CNPJ;
    }

    public String ToString(){
        return "  nome: " + nomeFantasia + "   cnpj: "+ CNPJ;
    }

}
