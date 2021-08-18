// number conversion from decimal to various other number systems
import java.io.*;
class Decimal
{
    public static void ToHex()throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter a decimal number : ");
        int n=Integer.parseInt(br.readLine());
        int r;
        String s="";
        char dig[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(n>0)
        {
            r=n%16;
            s=dig[r]+s;
            n=n/16;
        }
        System.out.println("Output = "+s);
    }

    public static void ToOct()throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter a decimal number : ");
        int n=Integer.parseInt(br.readLine());
        int r;
        String s="";
        char dig[]={'0','1','2','3','4','5','6','7'};
        while(n>0)
        {
            r=n%8;
            s=dig[r]+s;
            n=n/8;
        }
        System.out.println("Output = "+s);
    }  

    public static void ToBin()throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter a decimal number : ");
        int n=Integer.parseInt(br.readLine());
        int r;
        String s="";
        char dig[]={'0','1'};
        while(n>0)
        {
            r=n%2;
            s=dig[r]+s;
            n=n/2;
        }
        System.out.println("Output = "+s);
    }
}
