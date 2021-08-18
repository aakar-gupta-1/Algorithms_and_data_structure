//matrix applications like addition, substraction and multiplication
import java.io.*;
class Matrix
{
    private int arr[][];
    private int m,n;
    public Matrix()
    {
        arr=new int[1][1];
        m=1;
        n=1;
    }

    public Matrix(int m, int n)
    {
        arr=new int[m][n];
        this.m=m;
        this.n=n;
    }

    public void setMatrix()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter the Element of "+(i+1)+" Rows and "+(j+1)+" Columns");
                arr[i][j]=Integer.parseInt(br.readLine());
            }
        }
    }

    public void setMatrixWithDimentions()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no of rows");
        int m=Integer.parseInt(br.readLine());
        System.out.println("Enter no of columns");
        int n=Integer.parseInt(br.readLine());
        arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter the Element of "+(i+1)+" Rows and "+(j+1)+" Columns");
                arr[i][j]=Integer.parseInt(br.readLine());
            }
        }
    }

    public int getRows()
    {
        return m;
    }

    public int getColumns()
    {
        return n;
    }

    public void setRows(int m)
    {
        this.m=m;
    }

    public void setColumns(int n)
    {
        this.n=n;
    }

    public void add1(Matrix a)
    {
        if(a.getRows()==m && a.getColumns()==n)
        {
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=a.arr[i][j]+arr[i][j];
                }
            }
        }
        else 
        {
            System.out.println("Not eligible for addition");
        }
    }

    public Matrix add2(Matrix a)
    {
        if(a.getRows()==m && a.getColumns()==n)
        {
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=a.arr[i][j]+arr[i][j];
                }
            }
            return this;
        }
        else 
        {
            System.out.println("Not eligible for addition");
            return null;
        }
    }

    public Matrix add3(Matrix a, Matrix b)
    {

        if(a.getRows()==b.getRows() && a.getColumns()==b.getColumns())
        {
            Matrix x=new Matrix(a.getRows(),b.getColumns());
            for(int i=0;i<a.getRows();i++)
            {
                for(int j=0;j<b.getColumns();j++)
                {
                    x.arr[i][j]=a.arr[i][j]+b.arr[i][j];
                }
            }
            return x;
        }
        else 
        {
            System.out.println("Not eligible for addition");
            return null;
        }
    }

    public Matrix multiply2(Matrix a)
    {
        if(n==a.getRows())
        {
            Matrix x=new Matrix(m,a.getColumns());
            int temp=0,sum=0;
            for(int i=1;i<=m;i++)
            {
                for(int j=1;j<=a.getColumns();j++)
                {
                    sum=0;
                    for(int k=1;k<=a.getColumns();k++)
                    {
                        temp=arr[i-1][k-1]*a.arr[k-1][j-1];
                        sum+=temp;
                    }
                    x.arr[i-1][j-1]=sum;
                }
            }
            x.getMatrix();
            return x;
        }
        else
        {
            System.out.println("Not valid for Multiplication");
            return null;
        }
    }
    
    public void multiply1(Matrix a)
    {
        if(n==a.getRows())
        {
            Matrix x=new Matrix(m,a.getColumns());
            int temp=0,sum=0;
            for(int i=1;i<=m;i++)
            {
                for(int j=1;j<=a.getColumns();j++)
                {
                    sum=0;
                    for(int k=1;k<=a.getColumns();k++)
                    {
                        temp=arr[i-1][k-1]*a.arr[k-1][j-1];
                        sum+=temp;
                    }
                    x.arr[i-1][j-1]=sum;
                }
            }
            this.arr=new int[m][a.getColumns()];
            for(int i=0; i<m; i++)
            {
                for(int j=0; i<a.getColumns(); j++)
                {
                    arr[i][j]=x.arr[i][j];
                }
            }
        }
        else
        {
            System.out.println("Not valid for Multiplication");
        }
    }

    public Matrix multiply3(Matrix b, Matrix a)
    {
        if(n==a.getRows())
        {
            Matrix x=new Matrix(m,a.getColumns());
            int temp=0,sum=0;
            for(int i=1;i<=b.getRows();i++)
            {
                for(int j=1;j<=a.getColumns();j++)
                {
                    sum=0;
                    for(int k=1;k<=a.getColumns();k++)
                    {
                        temp=b.arr[i-1][k-1]*a.arr[k-1][j-1];
                        sum+=temp;
                    }
                    x.arr[i-1][j-1]=sum;
                }
            }
            x.getMatrix();
            return x;
        }
        else
        {
            System.out.println("Not valid for Multiplication");
            return null;
        }
    }
    
    public void getMatrix()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
