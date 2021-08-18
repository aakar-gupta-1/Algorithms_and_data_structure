//various programs using recursion
import java.util.*;
public class Recursion
{
    public static void fibo(int n)
    {
        fibo2(0,1, n);
    }
    //prints out the fibonacci numbers
    public static int fibo2(int a, int b, int n) //highest number is n
    {
        int c=a+b;
        if (c>n)
            return 0;
        else
        {
            System.out.print(" "+c);
            return fibo2(b, c, n);
        }
    }

    public static int fibo3(int n)
    {
        if (n==1)
            return 1;
        else if(n==2)
            return 1;
        else 
        {
            return fibo3(n-1)+fibo3(n-2);
        }
    }

    public static void acceptarr(int n)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter no to be searched: ");
        n=sc.nextInt();
        System.out.println(linearsearch(arr, n, 0));
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }                
            }
        }
        System.out.println(binary(arr, n, arr.length-1, 0));
    }
    //linear search using recursion
    public static int linearsearch(int arr[], int n, int p)
    {
        if(arr[p]==n) 
            return (p+1);
        else if(p==arr.length) 
            return -1;
        else 
            return linearsearch(arr,n,(p+1));
    }
    //binary search using recursion
    public static int binary(int arr[], int n, int max, int min)
    {
        int mid=(max+min)/2;
        if(arr[mid]==n) return mid+1;
        else if(max<min) return -1;
        else if(arr[mid]>n) return binary(arr,n,mid-1,min);
        else if(arr[mid]<n) return binary(arr,n,max,mid+1);
        else  return -1;
    }
    public static int LCM(int l, int a, int b)
    {
        if(l%a==0 && l%b==0) return l;
        else if(l%a==0)return LCM((l+a),a,b);
        else return LCM((l+1),a,b);
        
    }
    public static int HCF(int h,int a, int b)
    {
        if(a%h==0 && b%h==0) return h;
        else return HCF((h-1),a,b);
    }
    public static int SOE(int arr[], int s,int i)
    {
        if(i==arr.length) return s;
        else return SOE(arr,(s+arr[i]),(i+1));
    }
    public static int SOD(int n, int sum)
    {
        if(n==0) return sum;
        else return SOD((n/10),sum+(n%10));
    }
}