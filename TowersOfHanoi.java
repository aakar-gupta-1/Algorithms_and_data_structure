//algorithm of towers of hanoi using recursion
public class TowersOfHanoi
{
    static int a=1;
    public static void pika(int n, char in, char mid, char last)
    {
        if(n==1)
        {
            System.out.println(a+") "+in+" to "+last);
            a++;
        }
        else
        {
            pika(n-1, in, last, mid);
            pika(1,in, mid, last);
            pika(n-1, mid, in, last);
        }
    }
}
