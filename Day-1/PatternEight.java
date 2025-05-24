import java.util.Scanner;

public class PatternEight 
{
    public void Eight(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print(" ");
            }

            for(int j=0; j<(n*2)-(2*i+1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a value: ");
        int input= scanner.nextInt();

        PatternEight pe=new PatternEight();
        pe.Eight(input);
    }
}