
/**
 * Write a description of class Ex3 here.
 * Convert and write function1() method into recursive method.               
 */
public class Ex3
{
    public static int square(int x, int y)
    {
        
        if (y==0)
            return 1;
            
        else
        {
            x = x * square(x,y-1);
            return x;
        }
    }
}
