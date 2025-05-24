import java.util.Scanner;
public class PatternEleven 
{
    public void Eleven(int n)
    {
        for(int i=1; i<=n; i++)
        {
            int x=1;
            if(i%2==0)
            {
                x=0;
            }
            else
            {
                x=1;
            }

            for(int j=0; j<i; j++)
            {
                System.out.print(x);
                x=1-x;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value: ");
        int input = sc.nextInt();

        PatternEleven pe=new PatternEleven();
        pe.Eleven(input);
    }
}
