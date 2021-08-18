
// Quiz program
import java.io.*;
public class Quiz
{
    int n;
    char arr[][],key[];
    int score[];
    public void main()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of Students");
        n=Integer.parseInt(br.readLine());
        arr=new char[n][5];
        score=new int[n];
        key=new char[5];
        if(n<=3 || n>=11) System.out.println("Invalid no. of students");
        else
        {
            System.out.println("Enter the answer key->");
            for(int i=0;i<5;i++)
            {
                key[i]=br.readLine().charAt(0);
            }
            for(int i=0;i<n;i++)
            {
                System.out.println("Participant "+(i+1));
                for(int j=0;j<5;j++)
                {
                    arr[i][j]=br.readLine().charAt(0);
                    if(arr[i][j]==key[j]) score[i]++;
                }
            }
        }
        int temp=0,t=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Participant "+(i+1)+" = "+score[i]);
            if(score[i]>=temp)
            {
                temp=score[i];
                t=i;
            }
        }
        System.out.println("Highest score: Participant "+(t+1));
    }
    
}
