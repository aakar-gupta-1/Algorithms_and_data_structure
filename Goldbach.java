//Checks if the input is the sum of two prime numbers.
public class Goldbach
{
    public void main(int n)
    {
        if(n%2==0)
        {
            for(int i=1;i<=n/2;i++)
            {
                for(int j=n;j>n/2;j--)
                {
                    if(i+j==n && isPrime(i) && isPrime(j)) System.out.println(i+" and "+j);
                }
            }
        }
    }
    public boolean isPrime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0) c++;
        }
        if(n==1)return false;
        else if(c>2) return false;
        else return true;
    }
}
