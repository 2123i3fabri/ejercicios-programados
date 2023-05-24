import java.util.Scanner;

public class Eje7 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Dijite un numero");
        int n= input.nextInt();
        while(n>0||n<0){

          System.out.println("Dijite un numero");
          n= input.nextInt();

        }
    }
    
}
