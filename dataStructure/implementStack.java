package dataStructure;

import java.io.*;
class implementStack
{
    public static void main(int n)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean flag=true;
        Stack a=new Stack(n);
        int t=0;
        while(flag)
        {
            System.out.println("Enter 1 to push, 2 to pop or 0 to exit");
            t=Integer.parseInt(br.readLine());
            if(t==1) a.push();
            else if(t==2) a.pop();
            else flag=false;
        }
        a.printStack();
    }
}