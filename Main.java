import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);
    Console console = System.console();

    ReadAndWrite funcao = new ReadAndWrite();
    funcao.login();//chama o programa

    System.out.println("Programa finalizado");
  }
}
