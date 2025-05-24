import java.util.Scanner;

public class PatternTwelve 
{
    public void Twelve(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(j+1);
            }
            
            for(int j=1; j<=(n*2)-2-(2*i); j++)
            {
                System.out.print(" ");
            }

            int x=i+1;
            for(int j=1; j<=i+1; j++)
            {
                System.out.print(x);   
                x--;           
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value: ");
        int input=sc.nextInt();

        PatternTwelve pt=new PatternTwelve();
        pt.Twelve(input);
    }
}
