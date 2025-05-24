import java.util.Scanner;

public class PatternSix 
{
    public void six(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=(n+1)-i; j++)
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

        PatternSix ps = new PatternSix();
        ps.six(input);
    }
}