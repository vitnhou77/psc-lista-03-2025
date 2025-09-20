import java.util.Scanner;

public class AT04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.141592;

        System.out.print("Digite o código da operação (1=Perímetro, 2=Área, 3=Volume): ");
        int operacao = scanner.nextInt();

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        switch (operacao) {
            case 1:
                double perimetro = 2 * PI * raio;
                System.out.println("Perímetro do círculo: " + perimetro);
                break;
            case 2:
                double area = PI * Math.pow(raio, 2);
                System.out.println("Área do círculo: " + area);
                break;
            case 3:
                double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);
                System.out.println("Volume da esfera: " + volume);
                break;
            default:
                System.out.println("Código da operação inválido.");
        }

        scanner.close();
    }
}
