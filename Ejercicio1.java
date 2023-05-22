import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numerillo: ");
        int num = input.nextInt();
        if (num%2==0){
            System.out.println("Es par ");
        }else{
            System.out.println("Impar");
        }
    }
}