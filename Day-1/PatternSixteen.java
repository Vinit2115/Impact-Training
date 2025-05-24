import java.util.Scanner;

public class PatternSixteen 
{
    public void Sixteen(int n)
    {
        char x='A';
        for(int i=1; i<=n; i++)
        {
            for(char j='A'; j<x+1; j++)
            {
                System.out.print(x);
            }
            System.out.println();
            x++;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value: ");
        int input=sc.nextInt();

        PatternSixteen ps=new PatternSixteen();
        ps.Sixteen(input);
    }   
}
