//To find the factrial of a number using recursion
import java.io.*;
public class RecFact
{
    int n,r;
    public RecFact()
    {
        n=0;
        r=1;
    }
    public void readNum()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no to find its factorial");
        n=Integer.parseInt(br.readLine());
        System.out.println("Enter integer");
        r=Integer.parseInt(br.readLine());
    }
    public int factorial(int n,int f)
    {
        if(n==1) return f;
        else return factorial((n-1), (f*n));
    }
    public void factseries()
    {
        double t=0,s=0;
        t=factorial(r,1)*factorial(n-r,1);
        s=factorial(n,1)/t;
        System.out.println(s);
    }
}
