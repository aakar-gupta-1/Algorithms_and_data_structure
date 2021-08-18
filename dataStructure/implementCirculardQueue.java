package dataStructure;

import java.io.*;
public class implementCirculardQueue
{
    public static void main(int n)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean flag=true;
        circulardQueue a=new circulardQueue(n);
        int t=0;
        while(flag)
        {
            System.out.println("Enter 1 to add to rear, 2 to remove from front, 3 to add to front, 4 to remove from rear or 0 to exit");
            t=Integer.parseInt(br.readLine());
            if(t==1) a.addRear();
            else if(t==2) a.removeFront();
            else if(t==3) a.addFront();
            else if(t==4) a.removeRear();
            else flag=false;
        }
        a.print();
    }
}
