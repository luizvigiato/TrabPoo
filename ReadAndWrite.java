import java.util.ArrayList;

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
            case 1:
            escreverEmail();
            break;
            case 2:
            listarEmails();
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
}