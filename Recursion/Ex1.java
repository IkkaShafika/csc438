
/**
 * Write a description of class Ex1 here.
 * Calculate sum of squares
 * Sum of squares (m,n) = m2 + (m+1)2 + (m+2)2 + … + n               
 * Jan2018
 */
public class Ex1
{
    public static int ss (int m, int n)
    {
            if (m>n)
                return 0;
            
            else 
            {
                
                    m = (m*m) + ss(m+1,n);
                    return m;
                
            }

    }
    
    public static int Fathiahss (int x, int y)
    {
        int tot = 0;
        
        for (int i=x; i<=y; i++)
        {
            tot = tot + (i*i);
        }
        return tot;
    }
}
