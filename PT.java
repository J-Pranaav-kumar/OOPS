import java.util.* ;
public class PT {
    public static void main(String [] args){
        int n,i,j;
        Scanner s=new Scanner (System.in);
	System.out.print("Enter the number - ");
        n=s.nextInt();
        int space=n;
        int num;
        for(i=0;i<n;i++){
            for(j=0;j<space;j++)
                System.out.print(" ");
            num=1;
            for(j=0;j<=i;j++){
                System.out.print(num+ " ");
                num=num*(i-j)/(j+1);
            }
            System.out.print("\n");
            space--;
        }
        space+=2;
        for(i=n-2;i>=0;i--){
            for(j=0;j<space;j++)
                System.out.print(" ");
            num=1;
            for(j=0;j<=i;j++){
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.print("\n");
            space++;
        }
    }
}