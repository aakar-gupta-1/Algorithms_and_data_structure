import java.io.*;
public class Q2
{
    public static void quiz(int N)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        if(N<=3 || N>=11)System.out.println("Invalid input");
        else
        {
            char arr[][]= new char[N][5];
            int ar[]=new int[N];
            for(int i=0;i<N;i++)
            {
                for(int j=0;j<5;j++)
                {
                    System.out.println("Enter your choice");
                    arr[i][j]=(char)br.read();
                }
            }
            for(int i=0;i<N;i++)
            {
                for(int j=0;j<5;j++)
                {
                    switch(j)
                    {
                        case 1:if(arr[i][j]=='A') ar[i]++;
                        case 2:if(arr[i][j]=='B') ar[i]++;
                        case 3:if(arr[i][j]=='C') ar[i]++;
                        case 4:if(arr[i][j]=='D') ar[i]++;
                        case 5:if(arr[i][j]=='E') ar[i]++;
                    }
                }
            }
            for(int i=0;i<N;i++)
            {
                for(int j=0;j<5;j++)
                {
                    
                }
            }
        }
    }
}
