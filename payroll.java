import java.util.Scanner;
public class payroll{
public static void main(String[] args){
int salary;
double pi,total;
Scanner myobj=new Scanner(System.in);
System.out.print("Enter Salary- ");
salary=myobj.nextInt();
System.out.print("Percentage increase- ");
pi=myobj.nextDouble();
total=salary+(salary*(pi/100));
System.out.print("The new salary after a "+pi+" increase should be "+ total);
}
}