//Program to find out the day of a given date
import java.io.*;
class DateArithmetic
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    //function for checking for Leap Year
    int isLeap(int y)
    {
        if((y%400==0) || ((y%100!=0)&&(y%4==0)))
            return 29;
        else
            return 28;
    }
    //function for finding day number from year = 1 till the inputed year
    int dayno(int d, int m, int y)
    {
        int dn=0;
        month[2]=isLeap(y);
        for(int i=1;i<m;i++)
        {
            dn=dn+month[i];
        }
        dn=dn+d;
        for(int i=1;i<y;i++)
        {
            if(isLeap(i)==29)
                dn=dn+366;
            else
                dn=dn+365;
        }
        return dn;
    }

    public static void main()throws IOException
    {
        DateArithmetic ob=new DateArithmetic();
        System.out.print("Enter the 1st date in (dd/mm/yyyy) format: ");
        String date1=br.readLine().trim();
        int p,q;
        //Extracting the day
        p=date1.indexOf("/");
        int d1=Integer.parseInt(date1.substring(0,p));
        //Extracting the month
        q=date1.lastIndexOf("/");
        int m1=Integer.parseInt(date1.substring(p+1,q));
        //Extracting the year
        int y1=Integer.parseInt(date1.substring(q+1));
        System.out.print("Enter the 2nd date in (dd/mm/yyyy) format: ");
        String date2=br.readLine().trim();
        p=date2.indexOf("/");
        int d2=Integer.parseInt(date2.substring(0,p));
        q=date2.lastIndexOf("/");
        int m2=Integer.parseInt(date2.substring(p+1,q));
        int y2=Integer.parseInt(date2.substring(q+1));
        int a=ob.dayno(d1,m1,y1);
        int b=ob.dayno(d2,m2,y2);
        System.out.print("Output : Difference = "+Math.abs(a-b)+" days.");
    }
    public static void day()throws IOException
    {
        DateArithmetic ob=new DateArithmetic();
        String arr[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.print("Enter the date in (dd/mm/yyyy) format: ");
        String date1=br.readLine().trim();
        int p,q;
        p=date1.indexOf("/");
        int d1=Integer.parseInt(date1.substring(0,p));
        q=date1.lastIndexOf("/");
        int m1=Integer.parseInt(date1.substring(p+1,q));
        int y1=Integer.parseInt(date1.substring(q+1));
        int d2=21;
        int m2=05;
        int y2=2017;
        int a=ob.dayno(d1,m1,y1);
        int b=ob.dayno(d2,m2,y2);
        int dif=Math.abs(a-b);
        int i=0;
        if(b<a)
        i=dif%7;
        else
        i=7-(dif%7);
        
        System.out.println(arr[i]);
    }
}