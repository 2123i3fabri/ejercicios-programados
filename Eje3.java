import java.util.Scanner;
public class Eje3{
     public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.println("DIjite dos numeros:");
        int uno = input.nextInt();
        int dos = input.nextInt();
        if (uno > dos){
            System.out.println("EL NUMERO MAYOR ES:"+uno) ;
        }else{
            System.out.println("El numero mayor es :"+dos);
        }
    }
}