//Calculates and prints out the series of a terms -> 1/1!+2/2!+3/3!+...
import java.io.*;
class seriessum
{
    private double sum;
    private int n,x;
    public static void main(String[] args)throws IOException
    {
        seriessum u=new seriessum();
        u.accept();
        u.display();
        
    }

    public int factorial(int z)
    {
        int s=1;
        for(int i=1;i<=z;i++) s*=i;
        return s;
    }

    public void accept()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of terms ->");
        n=Integer.parseInt(br.readLine());
        System.out.println("Enter x ->");
        x=Integer.parseInt(br.readLine());
    }

    public double calsum()
    {
        sum=0;
        for(int i=1;i<=n;i++)
        {
            double t=0.0;
            for(int j=1;j<=i;j++)
            {
                t=t+Math.pow(x,j);
            }
            sum+=t/factorial(i);
        }
        return sum;
    }
    
    public void display()
    {
        System.out.println("sum -> "+calsum());
    }
}