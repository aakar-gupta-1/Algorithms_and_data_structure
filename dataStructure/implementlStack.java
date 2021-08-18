package dataStructure;
import java.io.*;
class implementlStack
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean flag=true;
        lStack a=new lStack();
        int t=0;
        while(flag)
        {
            System.out.println("Enter 1 to push, 2 to pop or 0 to exit");
            t=Integer.parseInt(br.readLine());
            if(t==1) 
            {
                int u=Integer.parseInt(br.readLine());
                a.push(u);
            }
            else if(t==2) a.pop();
            else flag=false;
        }
        a.print();
    }
}