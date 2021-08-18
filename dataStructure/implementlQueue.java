package dataStructure;

import java.io.*;
public class implementlQueue
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean flag=true;
        lQueue a=new lQueue();
        int t=0;
        while(flag)
        {
            System.out.println("Enter 1 to add, 2 to remove or 0 to exit");
            t=Integer.parseInt(br.readLine());
            if(t==1) 
            {
                int i=Integer.parseInt(br.readLine());
                a.add(i);
            }
            else if(t==2)
            {
                a.delete();
            }
            else flag=false;
        }
        a.print();
    }
}
