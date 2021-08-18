package dataStructure;
import java.io.*;
class circularQueue
{
    private int front,rear,arr[],n;
    public circularQueue(int j)
    {
        front=-1;
        rear=-1;
        arr=new int[j];
        n=j;
    }

    public boolean isEmpty()
    {
        if(rear==-1 && front==-1)return true;
        else return false;
    }

    public boolean isFull()
    {
        if(rear==front-1 || (front==0 && rear==n-1)) return true;
        else return false;
    }

    public void add()throws IOException
    {
        if(isFull())
            System.out.println("The queue is full");
        else
        {
            if(front==-1)front=0;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            if(rear==n-1) rear=0;
            else rear++;
            System.out.println("Enter the number");
            arr[rear]=Integer.parseInt(br.readLine());
        }
    }

    public void remove()
    {
        if(isEmpty()) System.out.println("The queue  is empty");
        else if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        else front++;
    }

    public void print()
    {
        if(isEmpty()) System.out.println("The queue  is empty");
        else
        {
            if(rear>=front)
            {
                for(int i=front;i<=rear;i++) System.out.println(arr[i]);
            }
            else
            {
                for(int i=front;i<n;i++) System.out.println(arr[i]);
                for(int i=0;i<=rear;i++) System.out.println(arr[i]);
            }
        }
    }
}