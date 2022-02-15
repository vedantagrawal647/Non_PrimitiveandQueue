/*
Find a two pair from a given array , one pair has maximum product and other has minimum product
and store that pair in Queue and store each pair in each block of queue
 */
import java.util.Arrays;

 class A
{

    static A[] ar2;
    int first,second;
   static  int front,rear;
    static{
        front=rear=-1;
        ar2=new A[2];
    }
    public A(int first, int second) {

        this.first = first;
        this.second = second;

    }
    public static boolean isEmpty()
    {
        return (front==-1);
    }

    public static boolean isFull()

    {
        return (rear==ar2.length-1);
    }

    public static void enqueue(A[] arrnew)
    {
        for(int i=0;i<arrnew.length;i++)
        {
            if(isFull())
            {
                System.out.println("overflow");
            }
            else if(isEmpty())
            {
                front++;
                rear++;
                ar2[rear]=new A(arrnew[i].first,arrnew[i].second);
            }
            else
            {
                rear++;
                ar2[rear]=new A(arrnew[i].first,arrnew[i].second);
            }
        }

    }

    public static void display()
    {
        for(int i=0;i<ar2.length;i++)
        {
            System.out.println(ar2[i].first + " " + ar2[i].second);
        }
    }
}


public class Test {
    public static void main(String[] args) {
        int arr[]={5,3,7,2,8,1};
        Arrays.sort(arr);
        A[] arrnew=new A[2];
        arrnew[0]=new A(arr[0],arr[1]);
        arrnew[1]=new A(arr[arr.length-2],arr[arr.length-1]);
        A.enqueue(arrnew);
        A.display();
    }
}
