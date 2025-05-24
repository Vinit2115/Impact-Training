import java.util.Scanner;

public class PatternFive 
{
    public void five(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] arga)
    {
      Scanner scanner =new Scanner(System.in);
      System.out.print("Enter a value: ");
      int input = scanner.nextInt();

      PatternFive pf = new PatternFive();
      pf.five(input);
    }   
}