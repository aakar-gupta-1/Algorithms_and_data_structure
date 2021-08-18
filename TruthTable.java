//Prints the truth table for the given no. of inputs
public class TruthTable
{
    public void main(int n)
    {
        double t=Math.pow(2,n);
        int or, and;
        for(int i=0;i<t;i++)
        {
            or=0;
            and=1;
            int r;
            String s="";
            char dig[]={'0','1'};
            int temp=i;
            if(temp==0)
            {
                for(int j=1;j<=n;j++)
                {
                    s="0"+s;
                }
            }
            while(temp>0)
            {
                r=temp%2;
                s=dig[r]+s;
                temp=temp/2;
            }
            int te=0;
            if(s.length()<n)
            {
                te=s.length();
                for(int j=0;j<n-te;j++)
                {
                    s="0"+s;
                }
            }
            System.out.print(s+" ");
            int z=0;
            for(int j=0;j<n;j++)
            {
                z=s.charAt(j)-'0';
                or+=z;
                and*=z;
            }
            if(or>1) or=1;
            System.out.print(or+" "+and);
            System.out.println();
        }
    }

}