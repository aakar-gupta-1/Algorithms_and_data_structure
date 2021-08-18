//Sorts the students according to their percentage
import java.io.*;

class implement
{

    public void make(int n)throws IOException
    {
        double z[]=new double[n];
        String y[]=new String[n];
        Student arr[]=new Student[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=new Student();
            arr[i].input();
            arr[i].per();
            arr[i].print();
        }
        double temp;
        String temp1;
        for(int i=0;i<n;i++)
        {
            z[i]=arr[i].per();
            y[i]=arr[i].nam();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(z[j]>z[j+1])
                {
                    temp=z[j];
                    z[j]=z[j+1];
                    z[j+1]=temp;
                    temp1=y[j];
                    y[j]=y[j+1];
                    y[j+1]=temp1;
                   
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("The marks of "+y[i]+" are "+z[i]);
        }
    }

}