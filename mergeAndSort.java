import java.io.*;
public class mergeAndSort
{
    int arr1[],arr2[],x,y,arr[];
    public mergeAndSort(int a,int b)
    {
        x=a;
        y=b;
        arr1=new int[a];
        arr2=new int[b];
    }

    public void accept()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("First array");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Second array");
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=Integer.parseInt(br.readLine());
        }
    }

    public void merge()
    {
        int pos1=-1,pos2=-1,temp=0,pos=-1;
        arr=new int[x+y];
        boolean flag=true;
        for(int i=0;i<y+x;i++)
        {
            if(i==y+x-1)flag=false;
            if(arr1[pos1+1]>=arr2[pos2+1])
            {
                pos++;
                pos2++;
                arr[pos]=arr2[pos2];
                if(pos2==y-1)break;
            }
            else
            {
                pos++;
                pos1++;
                arr[pos]=arr1[pos1];
                if(pos1==x-1)break;
            }
        }
        if(flag)
        {
            if(pos1==x-1)
            {
                for(int i=pos+1;i<x+y;i++)
                {
                    pos2++;
                    pos++;
                    arr[pos]=arr2[pos2];
                }
            }
            else
            {
                for(int i=pos+1;i<x+y-1;i++)
                {
                    pos1++;
                    pos++;
                    arr[pos]=arr1[pos1];
                }
            }
        }
    }

    public void print()
    {
        for(int i=0;i<x+y;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
