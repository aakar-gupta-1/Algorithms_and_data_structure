package dataStructure;

import java.io.*;
public class implementdoliDQueue
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean flag=true;
        doliDQueue a=new doliDQueue();
        int t=0;
        while(flag)
        {
            System.out.println("Enter 1 to add to rear, 2 to remove from front, 3 to add to front, 4 to remove from rear or 0 to exit");
            t=Integer.parseInt(br.readLine());
            if(t==1) 
            {
                int u=Integer.parseInt(br.readLine());
                a.addRear(u);
            }
            else if(t==2) a.deleteFront();
            else if(t==3) 
            {
                int u=Integer.parseInt(br.readLine());
                a.addFront(u);
            }
            else if(t==4) a.deleteRear();
            else flag=false;
        }
        a.print();
    }
}
