import java.io.*;
public class Q1
{
    int n;
    int temp;
    int t,a;
    int s=0;
    public void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any value less than 1000");
        n=Integer.parseInt(br.readLine());
        t=n;
        a=n;
        if(n>1000)System.out.println("Invalid input");
        else
        {
            temp=n/48;
            n=n-48*temp;
            s=s+temp;
            System.out.println("48 * "+temp+" = "+(48*temp));
            if(n>=24)LessThan24();
            else if(n>=12)LessThan12();
            else if(n>=6)LessThan6(); 
            else if(n>1)
            {
                System.out.println("Remaining boxes "+n+" * 1 ="+n);
                s=s+1;
            }
            System.out.println("Total number of boxes = "+t);
            System.out.println("Total number of cartons = "+s);
        }
    }

    void LessThan24()
    {
        temp=n/24;
        n=n-24*temp;
        s=s+temp;
        System.out.println("24 * "+temp+" = "+(24*temp));
        if(n>=12)LessThan12();
        else if(n>=6)LessThan6();
        else if(n>1)
        {
            System.out.println("Remaining boxes "+n+" * 1 ="+n);
            s=s+1;
        }
    }

    void LessThan12()
    {
        temp=n/12;
        n=n-12*temp;
        s=s+temp;
        System.out.println("12 * "+temp+" = "+(12*temp));
        if(n>=6)LessThan6();
        else if(n>1)
        {
            System.out.println("Remaining boxes "+n+" * 1 ="+n);
            s=s+1;
        }
    }

    void LessThan6()
    {
        temp=n/6;
        n=n-6*temp;
        s=s+temp;
        System.out.println("6                * "+temp+" = "+(6*temp));
        if(n>1)
        {
            System.out.println("Remaining boxes "+n+" * 1 ="+n);
            s=s+1;
        }
    }
}
