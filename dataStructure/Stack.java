package dataStructure;

import java.io.*;
class Stack
{
    private int arr[];
    private int n,top;
    public Stack(int j)
    {
        n=j;
        top=-1;
        arr=new int[n];
    }

    public boolean isEmpty()
    {
        if(top==-1) return true;
        else return false;        
    }
    public boolean isFull()
    {
        if(top<n-1) return false;
        else return true;
    }
    public void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no of elements");
        n=Integer.parseInt(br.readLine());
    }

    public void push()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        if(!isFull())
        {
            System.out.println("Enter the number");
            top++;
            arr[top]=Integer.parseInt(br.readLine());
        }
        else
        {
            System.out.println("Stack is full");
        }
    }

    public void pop()
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        if(!isEmpty()) top--;
        else System.out.println("Stack is empty");
    }

    public void printStack()
    {
        if(isEmpty()) System.out.println("Stack is empty");
        else 
        {
            for(int i=0;i<=top;i++) System.out.println(arr[i]);
        }
    }
}