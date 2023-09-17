import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce n: ");
        int n = scanner.nextInt();

        System.out.print("Introduce m: ");
        int m = scanner.nextInt();

        System.out.println("Numeros enteros positivos menores a " + n + " que no son divisibles por " + m + ":");

        for (int i = 1; i < n; i++) {
            if (i % m != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println(); 
    }
}
