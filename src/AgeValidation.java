import java.util.Scanner;
public class AgeValidation {
    public static void main(String[] args) {
        
        final int AGE_LIMIT = 18;
        
        System.out.println("Ingrese su edad: ");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt() ;
        
        if (age >= 18) {
            System.out.println("Access granted");
        }
        
        else {
            System.out.println("Access denied");
        }
    }
}
