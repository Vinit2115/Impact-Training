import java.util.Scanner;

public class PatternNine 
{
    public void Nine(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=n-i; j>1; j--)
            {
                System.out.print(" ");
            }

            for(int j=0; j<2*i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

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
        int input =scanner.nextInt();
        PatternNine pn=new PatternNine();
        pn.Nine(input);
    }
}