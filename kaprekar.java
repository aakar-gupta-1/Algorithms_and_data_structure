import java.io.*;
class kaprekar
{
    int n,a,d,t;
    
    kaprekar()
    {
        n=0;a=0;d=0;t=10;
    }
    public void input()throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the value till kaprekar numbers have to be found.");
        n=Integer.parseInt(br.readLine());
    }
    
    public void isKaprekar()
    {
        if(n==1) System.out.println(n);
        else if (n==0 || n<1) System.out.println("No Kaprekar Numbers.");
        else
        {
            for(int i=2;i<=n;i++)
            {
                d=0;t=10;a=i*i;
                while((t/a)<1)
                {
                    a=i*i;
                    d=a%t;
                    a=a/t;
                    if ((a+d)==i)
                    {
                        System.out.println(i);
                        break;
                    }
                    t=t*10;a=i*i;
                }
            }
        }
    }
    
    public static void main()throws IOException
    {
        kaprekar a=new kaprekar();
        a.input();
        a.isKaprekar();
    }
}