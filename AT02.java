
import java.util.Scanner;

public class AT02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        int valorCompra = scanner.nextInt();

        System.out.print("Digite o valor pago: R$ ");
        int valorPago = scanner.nextInt();

        if (valorPago < valorCompra) {
            System.out.println("Quantia paga insuficiente para realizar a compra.");
        } else {
            int troco = valorPago - valorCompra;
            System.out.println("\nValor da compra: R$ " + valorCompra);
            System.out.println("Valor pago: R$ " + valorPago);
            System.out.println("Troco: R$ " + troco);

            int notas50 = troco / 50;
            troco %= 50;

            int notas20 = troco / 20;
            troco %= 20;

            int notas10 = troco / 10;
            troco %= 10;

            int notas5 = troco / 5;
            troco %= 5;

            int notas2 = troco / 2;
            troco %= 2;

            int notas1 = troco;

            System.out.println("Notas de R$ 50,00: " + notas50);
            System.out.println("Notas de R$ 20,00: " + notas20);
            System.out.println("Notas de R$ 10,00: " + notas10);
            System.out.println("Notas de R$ 5,00: " + notas5);
            System.out.println("Notas de R$ 2,00: " + notas2);
            System.out.println("Notas de R$ 1,00: " + notas1);
        }

        scanner.close();
    }
}
