
import java.util.ArrayList;
import java.util.Scanner;


import java.io.Console;

/**
 *
 * @author luiz
 */
public class Main{
    // Lembrar de tratar usuario burro e ignorante

    public static ArrayList<Veiculo> corrida = new ArrayList<Veiculo>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Console console = System.console();

        char opcao;
        boolean numero;
        numero = false;


        do {
            System.out.println("a - Incluir veiculo");
            System.out.println("b - Remover um Veiculo");
            System.out.println("c - Remover veiculo por tipo");
            System.out.println("d - Abastecer veiculo");
            System.out.println("e - Abastecer veiculo por tipo");
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
                    //buscar ultimo id valido
                        int x = buscarId();
                        Bike bike = new Bike(x);
                        corrida.add(bike);
                        System.out.println("Veiculo adicionado a corrida!\n");
                        //System.out.println(corrida.get(0).getId());
                        //if(x >1 )System.out.println(corrida.get(1).getId());
                    break;
                    case 67://Carro Popular
                        x = buscarId();
                        Popular popular = new Popular(x);
                        corrida.add(popular);
                        System.out.println("Veiculo adicionado a corrida!\n");
                    break;
                    case 70://Ferrari
                        x = buscarId();
                        Ferrari ferrari = new Ferrari(x);
                        corrida.add(ferrari);
                        System.out.println("Veiculo adicionado a corrida!\n");
                    break;
                    case 77://Moto
                        x = buscarId();
                        Moto moto = new Moto(x);
                        corrida.add(moto);
                        System.out.println("Veiculo adicionado a corrida!\n");
                    break;
                    default:
                    System.out.println("Opcao digitada incorreta!");
                }

                break;
            case 98:
                System.out.println("Digite o ID do veiculo:");
                String rmId;
                rmId = sc.next();
                int clear;
                clear = localizarId(rmId);
                corrida.remove(clear);
                System.out.println("Veiculo removido com sucesso\n");
                break;
            case 99:
                System.out.println("Digite o tipo do veiculo (B,C,M,F):");
                char tipoV = sc.next().charAt(0);
                removerTipo(tipoV);
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

    public static int buscarId(){
        int a = corrida.size();
        if(a == 0){
            return 1;
        } else {
            String c = corrida.get(a-1).getId().substring(1);
            return Integer.parseInt(c);
        }
    }

    public static int localizarId(String id){
        if(corrida.size() > 0){
            for(int i=0;i< corrida.size();i++){
                if(corrida.get(i).getId().equals(id)) return i;
            }
            System.out.println("Id escolhido não existe");
            return -1;
        } else {
            System.out.println("Não existem veiculos a serem eliminados");
            return -1;
        }
    }

    public static void removerTipo(char s){
        if(s == 66 || s == 67 || s == 70 || s == 77){
            for(int i=0;i< corrida.size();i++){
                if(corrida.get(i).getId().charAt(0) == s){
                    corrida.remove(i);
                    i--;
                }
            }
            System.out.println("Removido\n");
        } else {
            System.out.println("O tipo escolhido não existe");
        }
    }
}
