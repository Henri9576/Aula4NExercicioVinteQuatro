package Aula4NExercicioVinteQuatro;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        char desejaContinuar = 'Y';
        
        while(desejaContinuar == 'Y' || desejaContinuar == 'y'){
            
            System.out.println("Digite um n�mero.");
            int numero = leitorScanner.nextInt();
            
            if(numero == 0) {
                System.out.println("O n�mero � zero");
            } else {
                if(numero > 0) {
                    System.out.println("O n�mero � maior que zero");
                } else {
                    System.out.println("O n�mero � menor que zero");
                }
            }
            
            System.out.println("Deseja continuar? Y/N");
            desejaContinuar = leitorScanner.next().charAt(0);
                            //^l� uma palavra      ^pega a primeira letra
        }
    }
}
