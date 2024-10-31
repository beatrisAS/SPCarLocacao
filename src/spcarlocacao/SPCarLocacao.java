package spcarlocacao;

/**
 *
 * @author beatris
 */
import java.util.Scanner;

public class SPCarLocacao {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o modelo do carro
        System.out.print("Digite o modelo do carro alugado: ");
        String modeloCarro = scanner.nextLine();

        // Solicita e lê o valor da diária para locação
        System.out.print("Digite o valor da diária para locação (R$): ");
        double valorDiaria = scanner.nextDouble();

        // Solicita e lê a quantidade de dias de locação
        System.out.print("Digite a quantidade de dias de locação: ");
        int diasLocacao = scanner.nextInt();

        // Solicita e lê a quantidade de Km percorridos
        System.out.print("Digite a quantidade de Km percorridos: ");
        double kmPercorridos = scanner.nextDouble();

        // Calcula o valor total da locação
        double custoDiaria = valorDiaria * diasLocacao;
        double custoKm = kmPercorridos * 0.20;
        double valorTotal = custoDiaria + custoKm;

        // Exibe o modelo do carro e o valor total a pagar
        System.out.printf("Modelo do carro: %s%n", modeloCarro);
        System.out.printf("Valor total a pagar: R$ %.2f%n", valorTotal);

        // Fecha o scanner para liberar os recursos
        scanner.close();
    }
}