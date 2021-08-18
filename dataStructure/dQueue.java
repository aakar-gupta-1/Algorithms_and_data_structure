package dataStructure;

import java.io.*;
class dQueue
{
    private int front,rear,arr[],n;
    public dQueue(int j)
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
        if(front==0 && rear==n-1) return true;
        else return false;
    }

    public void addRear()throws IOException
    {
        if(rear==n-1)
            System.out.println("The queue is full from rear");
        else
        {
            if(front==-1)front=0;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            rear++;
            System.out.println("Enter the number");
            arr[rear]=Integer.parseInt(br.readLine());
        }
    }

    public void addFront()throws IOException
    {
        if(front<=0) System.out.println("The queue is full from front");
        else
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            front--;
            System.out.println("Enter the number");
            arr[front]=Integer.parseInt(br.readLine());
        }
    }

    public void removeFront()
    {
        if(isEmpty()) System.out.println("The queue  is empty");
        else if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        else front++;
    }

    public void removeRear()
    {
        if(isEmpty()) System.out.println("The queue  is empty");
        else if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        else rear--;
    }

    public void print()
    {
        if(isEmpty()) System.out.println("The queue  is empty");
        else
        {
            for(int i=front;i<=rear;i++) System.out.println(arr[i]);
        }
    }
}