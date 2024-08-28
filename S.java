import java.util.*;
public class S{
    public static void main(String [] args){
        Scanner myobj= new Scanner(System.in);
        int m;
        System.out.print("Enter the no. of queries - ");
        m=myobj.nextInt();
        myobj.nextLine();
        for(int k=0;k<m;k++){
            String s;
            System.out.print("Enter values for a,b,n - ");
            s=myobj.nextLine();
            String num[]=s.split(" ");
            int []nums=new int[num.length];
            int i;
            for(i=0 ;i<num.length;i++)
                nums[i]=Integer.parseInt(num[i]);
            int a,b,n,p,sum=0;
            a=nums[0];
            b=nums[1];
            n=nums[2];
            for (p=0;p<n;p++){
                sum+=(a+(Math.pow(2,p))*b);
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}