//accepting and printing two dates
import java.io.*;
public class Dates
{
    private int d,m;
    private int y;

    public Dates()
    {
        d=m=1;
        y=2017;
    }

    public Dates(int a,int b, int c)
    {
        d=a;m=b;
        y=c;
    }

    public void accept() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Date: ");
        d=Integer.parseInt(br.readLine());
        System.out.print("Enter Month: ");
        m=Integer.parseInt(br.readLine());
        System.out.print("Enter Year: ");
        y=Integer.parseInt(br.readLine());       
    }

    public void print()
    {

        System.out.println(" D: "+d+" M: "+m+" Y: "+y);
    }

    public boolean isEqual(Dates z)
    {
        if(d==z.d&&m==z.m&&y==z.y) return true;
        return false;

    }       
}

