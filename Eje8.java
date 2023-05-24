import java.util.Scanner;
public class Eje8 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n=1;
        while (n!=0){
            System.out.println("dijite un numero");
            n = input.nextInt();
            if (n>0){
                System.out.println("numero positivo");
            }else if(n<0){
                System.out.println("numero negativo");
            }

        }
    }  
}
