import java.util.Scanner;

public class PatternThirteen 
{
    public void Thirteen(int n)
    {
        int x=1;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value: ");
        int input=sc.nextInt();

        PatternThirteen pt=new PatternThirteen();
        pt.Thirteen(input);
    }
    
}
