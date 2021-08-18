//Sorts the array using different types of sorting techniques
import java.io.*;
public class Sort
{
    public static void insertionSort(int n)throws IOException
    {  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[]= new int[n];
        System.out.println("Enter the numbers to be sorted");
        for(int i=0;i<n;i++)  arr[i]=Integer.parseInt(br.readLine());
        for (int i=1;i<n;i++) 
        {  
            int temp= arr[i];
            int j = i-1;
            while((j>-1)&&(arr[j]>temp)) 
            {  
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] =temp;  
        }  
        for(int i=0;i<n;i++) System.out.println(arr[i]);
    }  
    
    public static void selectionsort() throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        int n;
        System.out.print("Enter the number of students->");
        n=Integer.parseInt(br.readLine());
        int sor[]=new int[n];
        String sup[]=new String[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("\n Please enter the name of the 'student' - ");
            sup[i]=br.readLine();
            System.out.print("\n Please enter the marks of "+sup[i]+" - ");
            sor[i]=Integer.parseInt(br.readLine());
        }
        System.out.println();
        System.out.println("The following are the 'grades' achieved in descending order - ");
        System.out.println("\n student\t\tmarks yolo");
        for(int i=0;i<n;i++)
        {
            int s=sor[i],pos=i;
            String a=sup[i];
            for(int j=i+1;j<n;j++)
            {
                if(s<sor[j])
                {
                    s=sor[j];
                    a=sup[j];
                    pos=j;

                }
            }
            sor[pos]=sor[i];
            sor[i]=s;
            sup[pos]=sup[i];
            sup[i]=a;
            System.out.println(sup[i]+"\t\t"+sor[i]);

        }
        for(int i=0;i<n;i++)
        {
            if(sor[i]<0||sor[i]>100) System.out.println(sup[i]+" Yolo Right");
            else if(sor[i]>=85) System.out.println(sup[i]+" congo!!!!.....Distinction");
            else if(sor[i]>=70) System.out.println(sup[i]+" Commendation.......thats it.....");
            else if(sor[i]>=40) System.out.println(sup[i]+" Satisfactory.........not really.....");
            else if(sor[i]>=0) System.out.println(sup[i]+" FAIL......hehe lol.....");
        }

    }

    public static void bubbly() throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        int n;
        System.out.print("Enter the number of students->");
        n=Integer.parseInt(br.readLine());
        int sor[]=new int[n];
        String sup[]=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("\n Please enter the name of the 'student' - ");
            sup[i]=br.readLine();
            System.out.print("\n Please enter the marks of "+sup[i]+" - ");
            sor[i]=Integer.parseInt(br.readLine());
        }
        System.out.println();
        System.out.println("The following are the 'grades' achieved in descending order - ");
        System.out.println("student\t\t marks yolo");
        for(int i=0;i<n;i++)
        {
            boolean swag=true;
            for(int j=0;j<n-i-1;j++)    
            {
                if(sor[j]<sor[j+1])
                {
                    int man=sor[j];
                    String woman=sup[j];
                    sor[j]=sor[j+1]; sup[j]=sup[j+1];
                    sor[j+1]=man; sup[j+1]=woman;
                    swag=false;
                }
            }
            if(swag==true) break;
            System.out.println(sup[i]+"\t\t"+sor[i]);
        }
    }
}    
