import java.io.Console;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);
    Console console = System.console();

    int inicio = 0;
    String name;
    
    do{
      System.out.println("1 - Para Logar.");
      System.out.println("2 - Para sair.");
      // inicio = keyboard.nextInt();
      if(inicio == 1){
        name = console.readLine("Entre com o nome do usuario");
        
      }
    }while(inicio != 2);
    System.out.println("Programa finalizado");
  }
}
