import java.util.Scanner;

public class DataTypeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no. of test cases- ");
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
	    System.out.println("Enter the no.- ");
            String input = scanner.next();
            
            try {
                
                long n = Long.parseLong(input);
                
              
                System.out.println(n + " can be fitted in:");
                
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (NumberFormatException e) {
                
                System.out.println(input + " can't be fitted anywhere.");
            }
        }
        
        scanner.close();
    }
}