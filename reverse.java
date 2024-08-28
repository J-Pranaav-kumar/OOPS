import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        int n,temp,r,rev=0;
        Scanner myobj=new Scanner(System.in);
        System.out.print("Enter the number - ");
        n=myobj.nextInt();
        temp=n;
        while(temp!=0){
            r=temp%10;
            rev=rev*10+r;
            temp=temp/10;
        }
        if(rev==n){
            System.out.println("The reversed number is "+rev+". It is same as the original.");
        }
        else{
            System.out.println("The reversed number is "+rev+". It is not the same as the original.");
        }
    }
}