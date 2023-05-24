import java.util.Scanner;
public class Eje11 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int suma=1;
        System.out.println("Digite 10 sueldos(No escriba separadores de miles ni cientos):");
        for (int i =1; i <=10; i++){
            System.out.println("Numero "+ i + ":");
            int num = scanner.nextInt();
            suma += num;

        }
        System.out.println("La suma total de los sueldos es de"+ suma);
    }
}
