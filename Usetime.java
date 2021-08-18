//Sum and difference of two times
import java.io.*;
public class Usetime
{
    long y1,y2,m1,m2,d1,d2,h1,h2,min1,min2,s1,s2;
    long sum1,su1;
    time t1,t2;
    void accept()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("LOGIN");
        System.out.println("Enter year");
        y1=Long.parseLong(br.readLine());
        System.out.println("Enter month");
        m1=Long.parseLong(br.readLine());
        System.out.println("Enter date");
        d1=Long.parseLong(br.readLine());
        System.out.println("Enter hour");
        h1=Long.parseLong(br.readLine());
        System.out.println("Enter minute");
        min1=Long.parseLong(br.readLine());
        System.out.println("Enter second");
        s1=Long.parseLong(br.readLine());
        t1=new time(y1,m1,d1,h1,min1,s1);
        System.out.println("LOGOUT");
        System.out.println("Enter year");
        y2=Long.parseLong(br.readLine());
        System.out.println("Enter month");
        m2=Long.parseLong(br.readLine());
        System.out.println("Enter date");
        d2=Long.parseLong(br.readLine());
        System.out.println("Enter hour");
        h2=Long.parseLong(br.readLine());
        System.out.println("Enter minute");
        min2=Long.parseLong(br.readLine());
        System.out.println("Enter second");
        s2=Long.parseLong(br.readLine());
        t2=new time(y2,m2,d2,h2,min2,s2);
    }

    long sum(time t)throws Exception
    {
        sum1=0;
        if(t.m==1 || t.m==3 || t.m==5 || t.m==6 || t.m==7 || t.m==9 || t.m==11)
        {
            sum1=(t.y*365)+(t.m*31)+t.d;
        }
        else if(t.m==2)
        {
            if(y1%4==0 && y1%100!=0)
            {
                sum1=(t.y*365)+(t.m*29)+t.d;
            }
            else
            {
                sum1=(t.y*365)+(t.m*28)+t.d;
            }
        }
        else
        {
            sum1=(t.y*365)+(t.m*30)+t.d;
        }
        return sum1;
    }

    long su(time t)throws Exception
    {
        su1=(t.h*3600)+(t.min*60)+t.s;
        return su1;
    }

    time calculate()throws Exception
    {
        long sec1=0,sec2=0,day1=0,day2=0,diff1=0,diff2=0,diff=0;
        day1=sum(t1);
        day2=sum(t2);
        diff1=day2-day1;
        sec1=su(t1);
        sec2=su(t2);
        diff2=sec2-sec1;
        diff1=diff1*86400;
        diff=diff1+diff2;//difference b/w the two times in sec
        y1=diff%31536000;
        diff/=31536000;
        m1=diff%2592000;
        diff/=2592000;
        d1=diff%86400;
        diff/=86400;
        h1=diff%3600;
        diff/=3600;
        min1=diff%60;
        diff/=60;
        s1=diff;
        time ans=new time(y1,m1,d1,h1,min1,s1);
        return ans;
    }
    void print(time t)
    {
        System.out.println("Difference between login and logout time is....");
        System.out.println("Years -> "+t.y);
        System.out.println("Months -> "+t.m);
        System.out.println("Days -> "+t.d);
        System.out.println("Hours -> "+t.h);
        System.out.println("Minutes -> "+t.min);
        System.out.println("Seconds -> "+t.s);
    }
    public void main()throws Exception
    {
        Usetime a=new Usetime();
        time ans;
        a.accept();
        ans=a.calculate();
        a.print(ans);
    }
}
