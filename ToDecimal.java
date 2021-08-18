// number conversion from various number systems to decimal number system
public class ToDecimal 
{
    public static void getDecimalFromBinary(int binary)
    {
        int decimal = 0;
        int power = 0;
        while(true)
        {
            if(binary == 0)  break;
            else 
            {
                int tmp = binary%10;
                decimal += tmp*Math.pow(2, power);
                binary/=10;
                power++;
            }
        }
        System.out.println(decimal);
    }
    
    public static void hex2Dec(String hex)
    {
        int l = hex.length();
        char curDig;
        long dec = 0L;
        int d = 0, power = 0;
        for(int i=l-1; i>=0; i--) //Running loop backward to extract digits from the end
        {
            curDig = hex.charAt(i);
            if(curDig>='0' && curDig<='9')
                d = curDig-48;
            if(curDig>='A' && curDig<='F')
                d = curDig-55;
            dec = dec + d*(long)Math.pow(16,power);
            power++;
        }
        System.out.println("The number in Decimal System = "+dec);
         
    }
    public static void octToDec(int octnum)
    {
        int orig,decnum=0,i=0;
        orig = octnum;
        while(octnum != 0)
        {
            decnum = decnum + (octnum%10) * (int) Math.pow(8, i);
            i++;
            octnum = octnum/10;
        }
		
        System.out.print("Equivalent Decimal Value of " + orig + " is :\n");
        System.out.print(decnum);
    }
    public static void FCBinToDec(String n)
    {
        String a,b;
        double s=0,c=0;
        char Dig;
        double d=0;
        int t=n.indexOf('.');
        a=n.substring(0,t);
        b=n.substring(t,n.length());
        int p=0;
        int p1=1;
        for(int i=a.length()-1;i>=0;i--)
        {
            Dig = a.charAt(i);
            d = Dig-48;
            s=s+(d*(Math.pow(2,p)));
            p++;
        }
        for(int i=0;i<b.length()-1;i++)
        {
            Dig = b.charAt(i+1);
            d = Dig-48;
            c=c+(d/Math.pow(2,p1));
            p1++;
        }
        System.out.println((s+c));
    }
}