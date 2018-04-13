public class Email{
    //Definir forma que armazeno os arquivos
    //Abrir arquivo e dizer se existe usuario ou não com
    //com o nome que foi indicado
    Usuario input;//erda tudo da classe usuario...
    Usuario output;//erda tudo da classe usuario...
    String mensagem;
    
    public Email(Usuario input, Usuario output,String mensagem){
        this.input = input;
        this.output = output;
        this.mensagem = mensagem;
    }

    public String getMensagem(){
        return this.mensagem;
    }
// não me lembro se a necessidade deste set
    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }

}