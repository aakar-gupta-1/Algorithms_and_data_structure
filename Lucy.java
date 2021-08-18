//Lucky numbers are obtained by writing out all odd numbers: 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, .... 
//The first odd number >1 is 3, so strike out every third number from the list: 1, 3, 7, 9, 13, 15, 19, .... 
//The first odd number greater than 3 in the list is 7,
//so strike out every seventh number: 1, 3, 7, 9, 13, 15, 21, 25, 31, ....
//Numbers remaining after this procedure has been carried out completely are called lucky numbers.
public class Lucy
{
    int arr[];
    public int tilln(int n)//to find lucky numbers TILL n
    {
        int r=1,t=1;
        arr=new int[n+1];
        for(int i=0; i<=n; i++)
        {
            arr[i]=i+1;
        }
        for(int i=0; i<=n; i++)
        {
            r++;
            for(int j=r-1; j<=n; j+=r-1)
            {
                for(int k=j; k<=n-1; k++)
                {
                    arr[k]=arr[k+1];
                }
            }
        }
        for(int i=1; i<n; i++)
        {
            if(arr[i]!=arr[i-1] && arr[i]<=n)
                t++;
        }
        return t;
    }

    public void Lucy(int n)
    {
        for(int i=n;i>n;i++)
        {
            
        }
    }
}