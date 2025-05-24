import java.util.Scanner;

public class PatternSeven {
    public void seven(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=n-i; j>1; j--)
            {
               System.out.print("_");
            }

            for(int j=0; j<2*i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a value: ");
        int input =scanner.nextInt();

        PatternSeven ps = new PatternSeven();
        ps.seven(input);
    }
}
