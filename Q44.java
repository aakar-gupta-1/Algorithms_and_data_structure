import java.io.*;
public class Q44
{
    private int N,speed;
    private boolean gender[];
    private int arr[];
    public void accept()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of riders");
        N=Integer.parseInt(br.readLine());
        arr=new int[N];
        gender=new boolean[N];
        for(int i=0;i<N;i++)
        {
            System.out.println("Enter the speed of rider");
            arr[i]=Integer.parseInt(br.readLine());
            System.out.println("Enter the Gender of rider");
            gender[i]=Boolean.parseBoolean(br.readLine());
        }
    }
    public void sort()
    {
        for(int i=0;i<N;i++)
        {
            boolean swag=true;
            for(int j=0;j<N-i-1;j++)    
            {
                if(arr[j]<arr[j+1])
                {
                    int man=arr[j];
                    boolean temp=gender[j];
                    arr[j]=arr[j+1]; gender[j]=gender[j+1];
                    arr[j+1]=man; gender[j+1]=temp;
                    swag=false;
                }
            }
            if(swag==true) break;
        }
    }
    public void calculate()
    {
        for(int i=0;i<N;i++)
        {
            
        }
    }
}