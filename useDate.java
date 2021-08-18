import java.io.*;
public class useDate
{
    public static void main(String args[])throws IOException
    {
        Dates x=new Dates();
        Dates y=new Dates(1,2,2010);
        System.out.println(" Date x");
        x.print();
        System.out.println(" Date y");
        y.print();
        x.accept();
        //x.d=5;x.m=7;
        System.out.println(" ");
        x.print();
        if(x.isEqual(y))
            System.out.println(" Dates are equal ");
        else
            System.out.println(" Dates not equal ");
            
         x.print();y.print();
    }
        
        
}
