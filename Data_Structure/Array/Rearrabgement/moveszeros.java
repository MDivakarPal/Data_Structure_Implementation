import java.util.*;
class Test {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter size of array");
       int arr[]=new int[sc.nextInt()];
       for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        moves(arr);
    }

    static void moves(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[count]=arr[i];
                count++;
            }
        }

        for(int i=count;i<arr.length;i++)
         { arr[count]=0;
          count++;
        }
          for(int k:arr)
          System.out.print(k+" , ");
    }
}