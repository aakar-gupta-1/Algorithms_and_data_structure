package dataStructure;
import java.io.*;
class queue
{
    private int front,rear,arr[],n;
    public queue(int j)
    {
        n=j;
        front=0;
        rear=-1;
        arr=new int[j];
    }

    public boolean isEmpty()
    {
        if(rear+1==front)return true;
        else return false;
    }

    public boolean isFull()
    {
        if(rear<n-1) return false;
        else return true;
    }

    public void add()throws IOException
    {
        if(isFull()) System.out.println("The queue is full");
        else
        {
            int t;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the number");
            t=Integer.parseInt(br.readLine());
            rear++;
            arr[rear]=t;
        }
    }

    public void remove()
    {
        if(!isEmpty()) front++;
        else System.out.println("The queue  is empty");
        if(isEmpty() && front==n && isFull()) 
        {
            front=0;
            rear=-1;
        }
    }

    public void print()
    {
        if(isEmpty()) System.out.println("The queue  is empty");
        else
        {

            for(int i=front;i<=rear;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
}