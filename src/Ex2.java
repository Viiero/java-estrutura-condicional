//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Número: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Par");
        } else{
            System.out.println("Ímpar");
        }
        sc.close();
    }
}
