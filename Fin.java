import java.util.Scanner;
public class Fin{
public static void main(String[] args){
int n;
Scanner myobj=new Scanner(System.in);
System.out.print("Enter the amount (in cents) - ");
n=myobj.nextInt();
double d=n/100.0;
System.out.format("%.2f (dollars)",d);
}
}