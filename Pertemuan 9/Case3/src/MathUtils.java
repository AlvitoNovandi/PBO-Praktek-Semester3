
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils {
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------

    public static int factorial(int n) throws IllegalArgumentException {
        if(n > 16)
        {
            throw new IllegalArgumentException("Cannot Continue Calculation Because Factorial is too large to calculate for integers greater than 16");
        }
        if(n < 0)
        {
            throw new IllegalArgumentException("Cannot Continue Calculation Because n < 0");
        }
    int fac = 1;
    for (int i=n; i>0; i--)
    fac *= i;
    return fac;
    }
    }