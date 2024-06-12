import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operador;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Escolha o operador (+, -, * ou /)");
        operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;

            case '-':
                resultado = num1 - num2;
                break;
            
            case '*':
                resultado = num1 * num2;
                break;
            
            case '/':
                resultado = num1 / num2;
                break;
                
            default:
                System.out.println("Operador inválido!");
                scanner.close();
                return;
        }

        System.out.println("O resultado é: " + resultado);

        scanner.close();
    }
}
