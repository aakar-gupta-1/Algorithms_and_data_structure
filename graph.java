//Prints out the graph of the given m and c
public class graph
{
    int m,c;
    public void graph(int a,int b)
    {
        m=a;
        c=b;
    }
    public void graph1()
    {
        for(int i=17;i>-17;i--)
        {
            for(int j=-17;j<17;j++)
            {
                if(i==m*j+c)System.out.print("*");
                else
                {
                    if(j==0) System.out.print("|");
                    else if(i==0)System.out.print("_");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void graph2()
    {
        for(int i=25;i>0;i--)
        {
            for(int j=0;j<25;j++)
            {
                int x=j-13;
                int y=i-13;
                if(y==m*x+c) System.out.print("*");
                else if(j==13)System.out.print("|");
                else if(i==13)System.out.print("-");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public void graph3()
    {
        for(int i=25;i>0;i--)
        {
            for(int j=0;j<25;j++)
            {
                int x=j-13;
                int y=i-13;
                if(y==m*x+c) System.out.print("*");
                else if(j==13)System.out.print("|");
                else if(i==13)System.out.print("-");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}