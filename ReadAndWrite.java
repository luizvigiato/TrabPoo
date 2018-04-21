import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAndWrite{
    public void login(String nome, ArrayList<Email> emails){

        Scanner keyboard = new Scanner(System.in);
        Console console = System.console();
        Write leitura = new Write();
        Read gravacao = new Read();

        int opcao;

        //ArrayList emails = new ArrayList<Email>();
        //emails = leitura.listaCompleta(); //Retorna ou uma lista completa de informacoes ou elemento vazio

        System.out.print("Digite o que deseja fazer:\n1-Escrever um email.\n");
        System.out.println("2-Listar os e-mails.");
        System.out.println("3-Ler um e-mail");
        System.out.println("4-Excluir um email");
        System.out.println("5-Gravar e-mails");
        System.out.println("6-Ler e-mails do arquivo");
        System.out.println("7-Fazer logout");

        opcao = keyboard.nextInt();
        switch(opcao){
            case 1://gravar
            Email novoE;
            novoE = escreverEmail(nome);
            emails.add(novoE);
            System.out.println("Email enviado com sucesso");
            // System.out.println("Deseja salvar no arquivo?\n 1-Sim\n 2-Não");
            // int op;
            // op = keyboard.nextInt();
            // if(op == 1){
            // //nao foi solicitado que carregue o arquivo
            //     ArrayList<Email> arquivoE = new ArrayList<Email>();
            //     arquivoE = leitura.abrirArquivo();
            //     arquivoE.add(novoE);
            //     gravacao.gravarTudo(arquivoE);
            // //final do if
            // } else {
            // }
            break;
            case 2://listar
            listarEmails(nome, emails);
            break;
            case 3:
            lerEmail();
            break;
            case 4:
            clearEmail();
            break;
            case 5:
            readEmail();
            break;
            case 6:
            writeOpen();
            break;
            case 7:
            //finalizar tudo
            break;
            default:
            System.out.println("Favor selecionar opcao valida");
            break;
        }
    }

    public Email escreverEmail(String name){
        Console console = System.console();

        String output = console.readLine("Para:");
        String titulo = console.readLine("Assunto:");
        String mensagem = console.readLine("Mensagem:");

        Email novoEmail = new Email(name,output,titulo,mensagem);
        return novoEmail;
    }

    public void listarEmails(String name,ArrayList<Email> emails){
        for(int i=0; i < emails.size();i++){
            if(emails.get(i).getInput().equals(name)){//Se contiver
                System.out.println(i + "- " + "Para: " + emaisl.get(i).getOutput() + "Assunto: " + emails.get(i).getOutput());
            }
        }
    }
}