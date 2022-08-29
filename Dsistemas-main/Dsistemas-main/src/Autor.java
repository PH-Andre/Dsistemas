public class Autor {
    private String name;
    private String email;

    public Autor(String nam, String mail) {
        this.name = nam;
        this.email = mail;
    }

    public void mostrarDetalhes(){
        System.out.println("nome do autor: " + name);
        System.out.println("email: "+ email);
    }

    public String ToString(){
      return "  nome: " + name + "   emails: "+ email;
    }

}
