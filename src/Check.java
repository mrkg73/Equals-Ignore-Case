import java.util.Scanner;
public class Check
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first text please:");
        String text1= sc.nextLine();

        System.out.println("Enter second text please:");
        String text2= sc.nextLine();
        System.out.println((text1.equalsIgnoreCase(text2))?"Yes; they are match":"No; they are different");


        sc.close();

    }
}
