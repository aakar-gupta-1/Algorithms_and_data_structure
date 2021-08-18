//Line functions
import java.io.*;
public class Line
{
    private double x,y,a,b;
    private double l,m,c,mx,my,mm,mc;
    public Line()
    {
        x=y=a=b=mx=my=0;
        l=0.0;
        m=0.0;
    }
    public void accept()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter x for the first point");
        x=Integer.parseInt(br.readLine());
        System.out.println("Enter y for the first point");
        y=Integer.parseInt(br.readLine());
        System.out.println("Enter x for the second point");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter y for the second point");
        b=Integer.parseInt(br.readLine());
    }
    public void Calculate()
    {
        double t=0;
        t=Math.pow((x-a),2)+Math.pow((y-b),2);
        l=Math.sqrt(t);
        m=(b-y)/(a-x);
        c=y-m*x;
        mx=(x+a)/2;
        my=(y+b)/2;
        mm=-1/m;
        mc=my-mm*mx;
    }
    public void graph()
    {
        for(int i=17;i>-17;i--)
        {
            for(int j=-17;j<17;j++)
            {
                if(i==m*j+c)System.out.print("* ");
                else if(i==mm*j+mc)System.out.print("@ ");
                else
                {
                    if(j==0) System.out.print("| ");
                    else if(i==0)System.out.print("--");
                    else System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public void Print()
    {
        System.out.println("The length of line is = "+l);
        System.out.println("The slope of line is = "+m);
        System.out.println("The coordinates of the midpoint of line is x= "+mx+" y= "+my);
    }
}
