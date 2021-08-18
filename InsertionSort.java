import java.io.*;
public class InsertionSort
{
    int arr[];
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    public void main(int n)throws Exception
    {
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                int temp=arr[i];
                for(int j=i-1;j>-1;j--)
                {
                    if(arr[j]>temp)
                    {
                        arr[j+1]=arr[j];
                    }
                    else 
                    {
                        arr[j+1]=temp;
                        break;
                    }
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
