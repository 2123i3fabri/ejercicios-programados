import java.util.Scanner;
public class EjercicioDos{
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el valor en celsius");
        int celsius = input.nextInt();
        double fahrenheit =(9.0/5)*celsius + 32;
        System.out.println("El resultado es:"+ fahrenheit);
    }

}