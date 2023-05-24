import java.util.Scanner;
public class Eje9 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("dijite un numero");
        int n = input.nextInt();
        int suma = 0;
        while (n!=0){
            System.out.println("dijite un numero");
            n = input.nextInt();
            for (int i = n; i !=0; i++) {
                suma = suma+n ;
            }

        }
        System.out.println("suma numero"+n);
        
        
        
    }  
}

