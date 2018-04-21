import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);
    Console console = System.console();

    //ReadAndWrite entrar = new ReadAndWrite();
    //Write leitura = new Write();

    ArrayList<Email> emails = new ArrayList<Email>();//enquanto o programa não for fechado não vai perder nada
    //emails = leitura.listaCompleta(); //Retorna ou uma lista completa de informacoes ou elemento vazio

    int inicio = 2;
    String name;
    
    do{
      System.out.println("1 - Para Logar.");
      System.out.println("2 - Para sair.");
      // inicio = keyboard.nextInt();
      if(inicio == 1){
        name = console.readLine("Entre com o nome do usuario");
        entrar.login(name,emails);
        //chamar uma função de validação de usuario para o arquivo...
        
      }
    }while(inicio != 2);
    System.out.println("Programa finalizado");
  }
}
