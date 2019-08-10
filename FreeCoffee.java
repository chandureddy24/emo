import java.util.*;
public class JavaApplication3 
{
    public static void main(String[] args) 
    {   
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int p=scan.nextInt();
        p=100-p;
        int sum=0;
        while(x!=0)
        {
            sum=sum+x;
            x=Math.abs((x*p)/100);
        }
        System.out.println(sum);
    }
    
}
