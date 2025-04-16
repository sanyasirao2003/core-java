import java.io.*;
class salary 
{
    public static void main(String args[])
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("provident internation [p] Ltd");
        System.out.println("ongur,villupuram");
        System.out.println("------------------------------");
        System.out.println("SALARY BILL RECEIPT");
        System.out.println("------------------------------");
        System.out.println("Enter the empp id:");
        String s1 =br.readLine();
        System.out.println("Enter the emp name:");
        String s2 =br.readLine();
        System.out.println("Enter the salary");
        String s3 =  br.readLine();
        int n = Integer.parseInt(s3);
        System.out.println("INCOME");
        int a = n *(20/100);
        System.out.println("Bonus :+a");
    }
}