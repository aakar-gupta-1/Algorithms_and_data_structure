package dataStructure;

import java.io.*;
public class implementSort
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean flag=true;
        linkedApps a=new linkedApps();
        int t=0;
        while(flag)
        {
            System.out.println("Enter 1 to add to rear, 2 to remove from front, 3 to add to front, 4 to remove from rear, 5 to insert or 0 to exit");
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
            else if(t==5)
            {
                a.sort();
                int u=Integer.parseInt(br.readLine());
                a.insert(u);
            }
            else flag=false;
        }
        a.sort();
        a.print();
    }
}
