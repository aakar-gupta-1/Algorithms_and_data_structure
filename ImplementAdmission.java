//Sorts the students according to their marks 
import java.io.*;
public class ImplementAdmission
{
    public static void main(int n)throws IOException
    {
        int t=0;
        Admission Ad[]= new Admission[n];
        for(int i=0;i<n;i++)
        {
            Ad[i]=new Admission();
            Ad[i].input();
            Ad[i].calculate();
        }
        /*
        for (int i=1;i<n;i++) 
        {
        Admission temp= Ad[i];
        int j = i-1;
        while((j>-1)&&(Ad[j].getSum()>Ad[i].getSum())) 
        {  
        Ad[j+1]=Ad[j];
        j--;
        }
        Ad[j+1] =temp;  
        }
         */
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(Ad[j].getSum()<Ad[j+1].getSum())
                {
                    Admission temp=Ad[j];
                    Ad[j]=Ad[j+1];
                    Ad[j+1]=temp;
                }
            }
        }

        for(int i=0;i<n-1;i++)
        {
            int te=1;
            System.out.println();
            if(Ad[i].getSum()==Ad[i+1].getSum())
            {
                System.out.print((te)+"\t");
                te--;
            }
            else
                System.out.print((i+1)+"\t");
            Ad[i].print();
            te++;
        }
        System.out.println();
        System.out.print(n+"\t");
        Ad[n-1].print();
    }
}
