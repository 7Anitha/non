import java.io.*;
import java.util.*;
class tallest
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[50];
        int k=a.length;
        for(int i=0;i<k;i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        System.out.println("fourth tallest student :"+a[k-4]);
        System.out.println("kth tallest student :"+a[0]);
}
}
