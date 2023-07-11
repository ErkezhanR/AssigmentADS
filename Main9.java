public class Main9
{
    public static void main(String[] args)
    {
        int n = 7;
        int k = 3;
        int b = binomialCoefficient(n,k);

        System.out.println("The binomial coefficient of ("+n+", "+k+") is: "+b);
    }

    static int binomialCoefficient(int n, int k)
    {
        if(k==0 || k==n)
            return 1;
        return binomialCoefficient(n-1,k-1) + binomialCoefficient(n-1,k);
    }

}