
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Console;

/**
 *
 * @author luiz
 */
public class Main{
    // Lembrar de tratar usuario burro e ignorante
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Console console = System.console();

        char opcao;
        boolean numero;
        numero = false;

        ArrayList<Veiculo> corrida = new ArrayList<Veiculo>();

        do {
            System.out.println("a - Incluir veiculo");
            System.out.println("b - Remover um Veiculo");
            System.out.println("c - Remover veiculo por tipo");
            System.out.println("d - Abastecer veiculo");
            System.out.println("e - Abastecer veiculo");
            System.out.println("f - Movimentar Veiculo");
            System.out.println("g - Movimentar veiculo por tipo");
            System.out.println("h - Gravar dados");
            System.out.println("i - Ler dados");
            System.out.println("j - Imprimir dados do veiculo");
            System.out.println("k - Imprimir dados por tipo de veiculo");
            System.out.println("l - Imprimir pista de corrida:");
            System.out.println("m - Esvaziar pneus");
            System.out.println("n - Calibrar pneus");
            System.out.println("o - Fechar esta caralha");
            opcao = sc.next().charAt(0);
            switch (opcao) {
                //TABELA ASCII
            case 97:
                //String nome = console.readLine("Digite o tipo de veiculo\nB- Bicicleta\nM- Moto\nC- Carro Popular\nF- Ferrari:");
                System.out.println("Digite o tipo de veiculo\nB- Bicicleta\nM- Moto\nC- Carro Popular\nF- Ferrari:");
                char id = sc.next().charAt(0);
                //Verificar id do ultimo item da lista


                switch(id){
                    case 66://Bicicleta
                        Bike bike = new Bike(1);
                        corrida.add(bike);
                        System.out.println(corrida.get(0).getId());
                    break;
                    case 67://Carro Popular
                    break;
                    case 70://Ferrari
                    break;
                    case 77://Moto
                    break;
                    default:
                    System.out.println("Opcao digitada incorreta!");
                }

                break;
            case 98:
                break;
            case 99:
                break;
            case 100:
                break;
            case 101:
                break;
            case 102:
                break;
            case 103:
                break;
            case 104:
                break;
            case 105:
                break;
            case 106:
                break;
            case 107:
                break;
            case 108:
                break;
            case 109:
                break;
            case 110:
                break;
            case 111:
                numero = true;
                break;
            default:
                System.out.println("Favor digitar uma letra valida");
                break;
            }
        } while (!numero);

    }

}
