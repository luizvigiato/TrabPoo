import java.io.Serializable;

public class Email implements Serializable{
    //Definir forma que armazeno os arquivos
    //Abrir arquivo e dizer se existe usuario ou não com
    //com o nome que foi indicado
    private String input;//erda tudo da classe usuario...
    private String output;//erda tudo da classe usuario...
    private String assunto;
    private String mensagem;
    
    public Email(String input, String output,String assunto,String mensagem){
        this.input = input;
        this.output = output;
        this.assunto = assunto;
        this.mensagem = mensagem;
    }

    public Email(){
    }

    public String getInput(){
        return this.input;
    }

    public String getOutput(){
        return this.output;
    }

    public String getAssunto(){
        return this.assunto;
    }

    public String getMensagem(){
        return this.mensagem;
    }
// não me lembro se a necessidade deste set
    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }
    public void setAssunto(String mensagem){
        this.assunto = mensagem;
    }

}