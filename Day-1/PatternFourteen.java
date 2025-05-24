import java.util.Scanner;

public class PatternFourteen 
{
    public void Fourteen(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(char j='A';  j<='A'+i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value: ");
        int input=sc.nextInt();

        PatternFourteen pf=new PatternFourteen();
        pf.Fourteen(input);
    }
}
