import java.io.*;
class mark1 
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Takshashila university");
        System.out.println("______________________");
        System.out.println("Enter the Enroll number");
        String s1 = br.readLine();
        System.out.println("Enter the student name");
        String s2 = br.readLine();
        System.out.println("Enter the java mark");
        String s3 = br.readLine();
        int a = Integer.parseInt(s3);
        System.out.println("Enter the SE mark");
        String s4 =br.readLine();
        int b = Integer.parseInt(s4);
        System.out.println("Enter the CN mark");
        String s5 =br.readLine();
        int c = Integer.parseInt(s5);
        System.out.println("Result:");
        int d = a+b+c;
        System.out.println("Total:"+d);
        d = (a+b+c)/3;
        System.out.println("Average:"+d);
    }
}