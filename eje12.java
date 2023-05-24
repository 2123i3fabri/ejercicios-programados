import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class eje12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numerosNegativos = new ArrayList<>();

        System.out.println("Ingrese 10 números:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = input.nextInt();

            if (numero < 0) {
                numerosNegativos.add(numero);
            }
        }

        if (numerosNegativos.isEmpty()) {
            System.out.println("No se ha introducido ningún número negativo.");
        } else {
            System.out.println("Se ha introducido al menos un número negativo.");
            System.out.println("Los números negativos ingresados son: " + numerosNegativos);
        }
    }
}
