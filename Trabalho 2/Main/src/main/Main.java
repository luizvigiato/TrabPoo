/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author luiz
 */
public class Main {
    //Lembrar de tratar usuario burro e ignorante
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char opcao;
        boolean numero;
        numero = false;
        
        do{
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
            switch(opcao){
                case 97:
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
        }while(!numero);

       
    }
    
}
