import java.util.Scanner;

public class PatternTwo 
{
    public void two(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<1+i; j++)
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
        
        PatternTwo pt = new PatternTwo();
        pt.two(input);
    }   
}