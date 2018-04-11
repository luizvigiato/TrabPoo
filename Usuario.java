

public class Usuario{
    private String nome;
    private String email;

    public Usuario(){
     this.nome = new String();
     this.email = new String();
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    public void usuario(String nome, String email){
        this.nome = new String();
        this.nome = nome;
        this.email = new String();
        this.email = email;
    }
}
