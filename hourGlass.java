import java.io.*;
class hourGlass
{
    private int arr[][],m,sum,n;
    public void input()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no. of rows");
        m=Integer.parseInt(br.readLine());
        System.out.println("Enter no. of columns");
        n=Integer.parseInt(br.readLine());
        arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter the element in "+(i+1)+" row and "+(j+1)+" column");
                arr[i][j]=Integer.parseInt(br.readLine());
            }
        }
    }

    public void sumHG()
    {
        int x=(m-2)*(n-2);
        if(n>2 && m>2)
        {
            System.out.println("The no. of hour glasses that can be formed are -> "+x);
            for(int i=0;i<m-2;i++)
            {
                sum=0;
                for(int j=0;j<n-2;j++)
                {
                    for(int k=j;k<j+3;k++)
                    {                        
                        sum=sum+arr[i][k];
                    }
                    sum=sum+arr[i+1][j+1];
                    for(int k=j;k<j+3;k++)
                    {                        
                        sum=sum+arr[i+2][k];
                    }
                }
                System.out.println("The sum is -> "+sum);
            }
        }
    }
    public void printHG()
    {
        if(n>2 && m>2)
        {
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                }
            }
        }
    }
}