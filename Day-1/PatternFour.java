import java.util.Scanner;

public class PatternFour
{
    public void four(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<1+i; j++)
            {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int input = scanner.nextInt();

        PatternFour pf=new PatternFour();
        pf.four(input);
    }
}