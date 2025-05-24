import java.util.Scanner;

public class PatternThree 
{
    public void three(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int input = scanner.nextInt();

        PatternThree pt = new PatternThree();
        pt.three(input);
    }
}