import java.util.Scanner;

public class Eje6 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el día:");
        int dia = input.nextInt();

        System.out.println("Ingrese el mes:");
        int mes = input.nextInt();

        System.out.println("Ingrese el año:");
        int an = input.nextInt();
        int resul = verificar(dia, mes, an);
        if (resul==1) {
            System.out.println("La fecha ingresada es válida.");
        } else {
            System.out.println("La fecha ingresada no es válida.");
        }
    }

    public static int verificar(int dia, int mes, int an) {
        if (mes < 1 || mes > 12) {
            return 0;
        }
        
        if (dia < 1 || dia > 30) {
            return 0;
        } else {
            return 1;
        }
    }
}
