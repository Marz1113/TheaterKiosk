import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("enter your age: ");
        if (in.hasNextInt());
        int age = in.nextInt();

        if (age >= 21)
        {
            System.out.println("you get a paper wristband");

        } else
        {
            System.out.println("please enter a correct age.");
        }

    }
}