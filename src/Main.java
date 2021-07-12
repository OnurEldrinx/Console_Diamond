import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner x = new Scanner(System.in);
        int n,s; // n is row, s is space

        System.out.print("Enter a number to take your gift:");
        n = x.nextInt();

        s = n - 1;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= s; j++)
            {
                System.out.print(" ");
            }
            s--;
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        s = 1;

        for (int i = 1; i <= n - 1; i++)
        {
            for (int j = 1; j <= s; j++)
            {
                System.out.print(" ");
            }
            s++;
            for (int j = 1; j <= 2 * (n - i) - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}





