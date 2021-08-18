package dataStructure;

import java.io.*;
public class implementQueue
{
    public static void main(int n)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean flag=true;
        queue a=new queue(n);
        int t=0;
        while(flag)
        {
            System.out.println("Enter 1 to add, 2 to remove or 0 to exit");
            t=Integer.parseInt(br.readLine());
            if(t==1) a.add();
            else if(t==2) a.remove();
            else flag=false;
        }
        a.print();
    }
}
