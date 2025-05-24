import java.util.Scanner;

public class PatternOne
{

    public void one(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("*");
            } 
            System.out.println();
        }      
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int input = scanner.nextInt();

        PatternOne po =new PatternOne();   
        po.one(input);
    }
}