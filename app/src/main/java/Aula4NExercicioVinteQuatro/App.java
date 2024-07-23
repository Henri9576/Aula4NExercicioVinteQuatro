package Aula4NExercicioVinteQuatro;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        char desejaContinuar = 'Y';
        
        while(desejaContinuar == 'Y' || desejaContinuar == 'y'){
            
            System.out.println("Digite um número.");
            int numero = leitorScanner.nextInt();
            
            if(numero == 0) {
                System.out.println("O número é zero");
            } else {
                if(numero > 0) {
                    System.out.println("O número é maior que zero");
                } else {
                    System.out.println("O número é menor que zero");
                }
            }
            
            System.out.println("Deseja continuar? Y/N");
            desejaContinuar = leitorScanner.next().charAt(0);
                            //^lê uma palavra      ^pega a primeira letra
        }
    }
}
