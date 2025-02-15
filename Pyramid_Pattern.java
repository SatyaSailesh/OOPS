
import java.util.*;
public class Pyramid_Pattern
{
    
    void Pattern(int n)
    {
        int i, j;
        int num = 1;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= i; j++) 
            {
                System.out.print("*");
                 num++;
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int n = 6;
        Pattern(n);
    }
}
