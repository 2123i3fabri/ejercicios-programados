import java.util.Scanner;
public class Eje2{
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.println("Dijite dos numeros:");
        int uno = input.nextInt();
        while(uno<=0){
            System.out.println("Dijite dos numeros:");
            uno = input.nextInt();

        }
        System.out.println("Escribe un segundo  numero");
        int dos = input.nextInt();

        while(dos<=0){
            System.out.println("Escribe un segundo  numero");
            dos = input.nextInt();

        }
        int resultado = 0;
        resultado = uno / dos ;

        if (resultado == 0){
            System.out.println("El numero si es multiplo ");

        }else{
            System.out.println("El numero no es multiplo ");
        }
    }
}