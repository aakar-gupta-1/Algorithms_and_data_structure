import java.io.*;
class ISCPractical
{
    int n,t=0;
    String arr[];
    public void accept()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of String inputs");
        n=Integer.parseInt(br.readLine());
        arr=new String [n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter String");
            arr[i]=br.readLine();
        }
    }
    
    public void calculate()
    {
        for(int j=0;j<n;j++)
        {
            if(arr[j].length()>t) t=arr[j].length();
        }
    }
    
    public void print()throws Exception
    {
        for(int j=0;j<t;j++)
        {
            for(int i=0;i<n;i++)
            {
                if(arr[i].length()>j)System.out.print(arr[i].charAt(j));
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}