//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Número: ");
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo.");
        }
        sc.close();
    }
}
