
public class KaprekarNumbers
{
    public static boolean isKaprekar(int n)
    {
        if(n==0) return false;
        if(n==1) return true;
        int square=n*n;
        int count=0;
        while(square!=0)
        {
            count++;
            square/=10;
        }
        square=n*n;
        int a,b;
        a=(int)Math.pow(10,count/2);
        b=(int)Math.pow(10,(count/2)+1);
        if(a==n || b==n) return false;
        else if(n==square/a+square%a || n==square/b+square%b) return true;
        else return false;

    }
}