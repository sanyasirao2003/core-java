import java.io.*;
class java
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Sum of number");
        System.out.println("-------------");
        System.out.println("enter the n value");
        String s1=br.readLine();
        int n =Integer.parseInt(s1);
        System.out.println("result:");
        System.out.println("sum of n values :"+n*(n+1)/2);
        System.out.println("sum of sq :"+n*(n+1)*(2*n+1)/6);
        System.out.println("sum of n cubes :"+(n*(n+1)/2)*(n*(n+1)/2));
    }
}
