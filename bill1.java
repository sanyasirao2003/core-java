import java.io.*;

class bill1 {
    public static void main(String args[]) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Government of Tamil Nadu");
            System.out.println("    Electricity bill");
            System.out.println("------------------------");

            System.out.print("Enter the EB No: ");
            String s1 = br.readLine();

            System.out.print("Enter the Customer Name: ");
            String s2 = br.readLine();

            System.out.print("Enter the Previous Unit: ");
            int a = Integer.parseInt(br.readLine());

            System.out.print("Enter the Current Unit: ");
            int b = Integer.parseInt(br.readLine());

            int c = b - a;
            System.out.println("Result:");
            System.out.println("Unit Consumed: " + c);
            
            int d = c * 5;
            System.out.println("Total Amount: " + d);
        } catch (Exception e) { 
            System.out.println("Error: " + e.getMessage());
        }
    }
}
