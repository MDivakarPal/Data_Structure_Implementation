/*
Maximum sum of a contigous sub array.
Algorithm Kadane's 
Initialize 
int s=0,e=0;
for (i=0;i<n;i++)
 {
     e=e+a[i];
     if(s<e)
     s=e;
     if(e<0)
     e=0;
 }
 return s;
*/

import java.util.*;
import java.io.*;
class Test {
  public static void main(String[] args) {
      BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter size of array");
     try{
     int n=Integer.parseInt(sc.readLine());
     int s=Integer.MIN_VALUE,e=0;
     for(int i=0;i<n;i++)
     {
      e+=Integer.parseInt(sc.readLine());
        if(s<e)
        s=e;
        if(e<0)
        e=0;
     }
     System.out.println("Possible maximum sum ="+s);
    }
    catch(Exception exception)
    {
        
    }
  }  
}