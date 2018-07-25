import java.util.Scanner;

public class Problem2 {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t,n=0,a=0,c;
        t=in.nextInt();        while(t!=0)
        {
            c=0;
            t--;
            n=in.nextInt();
            if(n>=100)
            {
                a=n/100;
                c=c+a;
                n=n%100;
            }
            if(n>=50)
            {
                a=n/50;
                c=c+a;
                n=n%50;
            }
            if(n>=10)
            {
                a=n/10;
                c=c+a;
                n=n%10;
            }
            if(n>=5)
            {
                a=n/5;
                c=c+a;
                n=n%5;
            }
            if(n>=2)
            {
                a=n/2;
                c=c+a;
                n=n%2;
            }
            if(n>=1)
            {
                a=n/1;
                c=c+a;
            }
            System.out.println(c);
        }
    }
}


