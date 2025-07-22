import java.util.Scanner;

public class DesafioAlura {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        //System.out.println("Digite um número e lhe direi se ele é positivo ou negativo");
        //int numero2 = numero.nextInt();

        //if (numero2 < 0){
           // System.out.println("Este número é negativo");
       // } else {
        //    System.out.println("Este número é positivo");
       // }

        // Exercicio 2
        System.out.println("Digite um número");
        int n1 = numero.nextInt();
        System.out.println("Digite outro número");
        int n2 = numero.nextInt();


        if (n1 == n2){
            System.out.println("São números IGUAIS");
        } else {
            if (n1 != n2){
                System.out.println("Estes números são DIFERENTES");
            }

            if (n1 > n2) {
                System.out.println("O número " + n1 + " é maior que o número " + n2);
            } else {
                System.out.println("O número " + n1 + " é menor que o número " + n2);
            }
        }

        }
}