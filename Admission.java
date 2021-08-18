//checks if a student passes the entrance examination
import java.util.*;
import java.io.*;
public class Admission
{
    private int arr[];
    private int n,sum;
    private String s,a;
    public void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the name of Student");
        s=br.readLine();
        System.out.println("Enter the no. of examinations ->");
        n=Integer.parseInt(br.readLine());
        arr=new int[n];
        int d;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter grades of "+s);
            char c = sc.next().charAt(0);
            if(c=='A')
                d=5;
            else if(c=='B')
                d=4;            
            else if(c=='C')
                d=3;
            else if(c=='D')
                d=2;
            else if(c=='E')
                d=1;
            else 
                d=0;
            arr[i]=d;
        }
    }

    public void calculate()
    {
        for (int i=1;i<n;i++) 
        {  
            int temp= arr[i];
            int j = i-1;
            while((j>-1)&&(arr[j]>temp)) 
            {  
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] =temp;
        }
        for(int i=0;i<6;i++) 
        {
            sum+=arr[i];
        }
        if(sum>=14) a="Qualified";
        else a="Disqualified";
    }

    public int getSum()
    {return sum;}

    public void print()
    {
        System.out.print(s+"-->"+sum+"\t"+a);
    }
}