import java.io.*;
class bill
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Swetha Super Market");
        System.out.println("NO.6, main road ,villupuram");
        System.out.println("---------------------------");
        System.out.println("           BILL");
        System.out.println("---------------------------");
        System.out.println("Enter the serial no:");
        String s1 = br.readLine();
        System.out.println("Enter the particular");
        String s2 = br.readLine();
        System.out.println("Enter the rate");
        String s3 = br.readLine();
        int a = Integer.parseInt(s3);
        System.out.println("Enter the Quantity");
        String s4 =br.readLine();
        int b = Integer.parseInt(s4);
        System.out.println("Result:");
        int c = a*b;
        System.out.println("Total amount:"+c);
        int d = c*10/100;
        System.out.println("GST(10%):"+d);
        System.out.println("Grand total:"+ (c+d));
        System.out.println("---------------------------");
        System.out.println("  thanks!  visit again    ");
    }
}