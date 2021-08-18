//A digital river is formed by adding the sum of a number's digit to the number itself
//Eg: 480 -> 480+12=492
//This program checks if the digital river of the entered numbers meets that of 1, 3, or9.
public class DjRiver
{
    public static void Riv(int n)
    {
        boolean a=true;
        int x=1,y=3,z=9,temp=0,dig=0;
        while(a)
        {
            while(x<=n)
            {
                temp=x;
                if(x==n)a=false;
                while(temp!=0)
                {
                    dig=temp%10;
                    x+=dig;
                    temp/=10;
                }
            }
            if(!a) break;
            while(y<=n)
            {
                temp=y;
                if(y==n)a=false;
                while(temp!=0)
                {
                    dig=temp%10;
                    y+=dig;
                    temp/=10;
                }
            }
            if(!a) break;
            while(z<=n)
            {
                temp=z;
                if(z==n) a=false;
                while(temp!=0)
                {
                    dig=temp%10;
                    z+=dig;
                    temp/=10;
                }
            }
            if(!a) break;
            temp=n;
            while(temp!=0)
            {
                dig=temp%10;
                n+=dig;
                temp/=10;
            }
        }
        System.out.println(n);
    }

    public static void DjNadi(int n)
    {
        int x=1,y=3,z=9;
        int temp,dig=0;
        for(int i=0;x<n;i++)
        {
            temp=x;
            while(temp!=0)
            {
                dig=temp%10;
                x+=dig;
                temp/=10;
            }
        }
        System.out.print(x+"\t");
        System.out.println();
        for(int i=0;y<n;i++)
        {
            temp=y;
            while(temp!=0)
            {
                dig=temp%10;
                y+=dig;
                temp/=10;
            }
        }
        System.out.print(y+"\t");
        System.out.println();
        for(int i=0;z<n;i++)
        {
            temp=z;
            while(temp!=0)
            {
                dig=temp%10;
                z+=dig;
                temp/=10;
            }
        }
        System.out.print(z+"\t");
    }

}
