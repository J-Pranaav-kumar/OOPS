import java.util.Scanner;

class password
 {
    public static void main(String[] args)
    {
        String password;
        boolean hasDigit = false, hasSpecialChar = false, hasUpperCase = false, hasLowerCase = false, hasValidLength = false;

        Scanner reader = new Scanner(System.in);

        System.out.print("ENTER THE PASSWORD : ");

        password = reader.nextLine();

        if (password.length() >= 8) {
            hasValidLength = true;
        }

        for (int i =0;i<password.length();i++)
        {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) 
	    {
                hasSpecialChar = true;
            }

            if (Character.isDigit(c)) {
                hasDigit = true;
            }

            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }

            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
        }

        if (hasValidLength && hasDigit && hasSpecialChar && hasUpperCase && hasLowerCase) {
            System.out.println("Password is Strong");
        } else {
            System.out.println("Password is weak");
           
        }
    }
}