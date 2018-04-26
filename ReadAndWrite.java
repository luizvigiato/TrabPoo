import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAndWrite{

    private Scanner keyboard = new Scanner(System.in);
    Console console = System.console();
    Write leitura = new Write();
    Read gravacao = new Read();

    ArrayList<Email> emails = new ArrayList<Email>();

    public void login(){//String nome, ArrayList<Email> emails){
        int opcao;
        do{
            System.out.println("1-Fazer login\n2-Finalizar programa");
            opcao = keyboard.nextInt();
            if(opcao==1){
                menu();
            } else {
                if(opcao!=2){
                    System.out.println("Digite uma opcao valida!");
                }
            }
        }while(opcao!=2);
    }

    private void menu(){

        String nome = console.readLine("Digite o nome do usuario:");
        int opcao;

        do{
            System.out.print("Digite o que deseja fazer:\n1-Escrever um email.\n");
            System.out.println("2-Listar os e-mails recebidos.");
            System.out.println("3-Ler um e-mail");
            System.out.println("4-Excluir um email");
            System.out.println("5-Ler e-mails do arquivo");
            System.out.println("6-Gravar e-mails");
            System.out.println("7-Fazer logout");

            opcao = keyboard.nextInt();
            switch(opcao){
                case 1://gravar
                Email novoE;
                novoE = escreverEmail(nome);
                emails.add(novoE);
                System.out.println("Email enviado com sucesso");
                System.out.println();
                break;
                case 2://listar
                listarEmails(nome);
                System.out.println();
                break;
                case 3://ler msg
                int x = keyboard.nextInt();
                lerEmail(x,nome);
                System.out.println();
                break;
                case 4://Excluir email
                x = keyboard.nextInt();
                clearEmail(x,nome);
                System.out.println();
                break;
                case 5:
                readArq();
                System.out.println();
                break;
                case 6:
                writeOpen();
                System.out.println();
                break;
                case 7:
                //finalizar tudo
                break;
                default:
                System.out.println("Favor selecionar opcao valida\n");
                break;
            }
        }while(opcao != 7);
    }

    public Email escreverEmail(String name){
        String output = console.readLine("Para:");
        String titulo = console.readLine("Assunto:");
        String mensagem = console.readLine("Mensagem:");

        Email novoEmail = new Email(name,output,titulo,mensagem);
        return novoEmail;
    }

    private void listarEmails(String nome){
        for(int i=0; i < emails.size();i++){
            if(emails.get(i).getOutput().equals(nome)){//Se contiver
                System.out.println((i+1) + "- " + "Para: " + emails.get(i).getOutput() + "\nAssunto: " + emails.get(i).getAssunto());
            }
        }
        System.out.println();
    }

    private void lerEmail(int x, String nome){
        int valor = 0;
        for(int i=0;x>0;i++){
            
            if(emails.get(i).getOutput().equals(nome)){
                x--;
                valor = i;
            }
        }
        System.out.println("De: " +  emails.get(valor).getInput());
        System.out.println("Assunto: " + emails.get(valor).getAssunto());
        System.out.println("Mensagem: " + emails.get(valor).getMensagem());
    }

    private void clearEmail(int x, String name){
        int valor = 0;
        for(int i=0;x>0;i++){
            
            if(emails.get(i).getOutput().equals(nome)){
                x--;
                valor = i;
            }
        }
        emails.remove(valor);
        System.out.println("Email removido com sucesso");
    }

    private void readArq(){
        ArrayList emailsArq = new ArrayList<Email>();
        emailsArq = leitura.abrirArquivo();
        for(int i=0; i < emailsArq.size(); i++){
            emails.add((Email) emailsArq.get(i));
        }
    }

    private void writeOpen(){
        System.out.println("Voce deseja regravar o arquivo sem recarregar ele? isso ira apagar tudo que ja continha!");
        System.out.println("1-Sim\n2-Não");
        int x;
        x = keyboard.nextInt();
        if(x == 2){
            ArrayList write = new ArrayList<Email>();
            ArrayList arqEmail = new ArrayList<Email>();
            arqEmail = leitura.abrirArquivo();
            for(int i=0; i < emails.size(); i++){
                write.add((Email) emails.get(i));
            }
            for(int i=0; i < arqEmail.size(); i++){
                write.add((Email) arqEmail.get(i));
            }
            gravacao.gravarTudo(write);
        } else {
                gravacao.gravarTudo(emails);
        }
        //feito assim para que quando solicitado salvar não alterar a global a menos que vc carregue

    }
}