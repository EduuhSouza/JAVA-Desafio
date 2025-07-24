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

        // Exercicio 2 IGUAIS, DIFERENTES, menor, maior
      //  System.out.println("Digite um número");
       // int n1 = numero.nextInt();
       // System.out.println("Digite outro número");
        //int n2 = numero.nextInt();


        //if (n1 == n2){
        //    System.out.println("São números IGUAIS");
       // } else {
        //    if (n1 != n2){
         //       System.out.println("Estes números são DIFERENTES");
          //  }

           // if (n1 > n2) {
              //  System.out.println("O número " + n1 + " é maior que o número " + n2);
           // } else {
           //     System.out.println("O número " + n1 + " é menor que o número " + n2);
          //  }
        //}

        // Exercicio 4 Tabuada

        //System.out.println("Digte umm número e lhe darei a tabuada do mesmo");

        //int number = numero.nextInt();
        //System.out.println("A tabuada do " + number + " é: ");

       // for (int i = 1; i <= 10; i++) {
         //   System.out.println(number + "X" + i + " = " + (number * i));
        //}

        // Exercicio 5 PAR OU IMPAR

        System.out.println("Digite um número e lhe direi se ele é par ou impar");
        int numeroInteiro = numero.nextInt();

        if (numeroInteiro % 2 == 0){
            System.out.println(numeroInteiro + " é um número par");
        } else {
            System.out.println(numeroInteiro + " é um número impar");
        }

        // Exercicio 6 FATORIAL
        System.out.println("Digite um número e lhe darei o fatorial do mesmo");
        int numeroFatorial = numero.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numeroFatorial; i++) {
            fatorial *= i;
        }

        System.out.println(numeroFatorial + " O fatorial deste numero é " + fatorial);
        }
}