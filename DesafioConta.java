import java.util.Scanner;

public class DesafioConta {
    public static void main(String[] args) {
        // DADOS USUARIOS
        String nome = "Eduarda Souza";
        String conta = "Corrente";
        double saldo = 1666.66;
        int operacao = 0;

        System.out.println("**************************");
        System.out.println("\nNome Cliente: " + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n**************************");


        // MENU
        String menu = """
                **  Digite sua operação  **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - sair
                
                """;

        Scanner leitura = new Scanner(System.in);

        while (operacao != 4){
            System.out.println(menu);
            operacao = leitura.nextInt();

            if (operacao == 1){
                System.out.println("O saldo atualizado é: " + saldo);
            }else if (operacao == 2){
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não foi possível realizar a transação, saldo insuficiente");
                } else {
                    saldo = saldo - valor;
                    System.out.println("Salto atualizado: " + saldo);
                }
                } else if (operacao == 3){
                System.out.println("Valor recebido: " + saldo);
                double valor = leitura.nextDouble();
                saldo = saldo + valor;
            } else if (operacao != 4){
                System.out.println("Operação inválida");
            }
        }
    }
}
