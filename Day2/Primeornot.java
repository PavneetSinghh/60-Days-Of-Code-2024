//To check for Prime Number
class pri {
    public boolean isPrime(int x) 
    {
        if (x <= 1) 
        {
            return false; 
        }

        int count = 0;
        for (int i = 1; i <= x; i++) 
        {
            if (x % i == 0) 
            {
                count++;
            }
        }
        return count == 2;
    }
}

class Primeornot
{
    public static void main(String args[])
    {
        pri p=new pri();
        System.out.println(p.isPrime(1));
        System.out.println(p.isPrime(2));
        System.out.println(p.isPrime(3));
        System.out.println(p.isPrime(4));
        System.out.println(p.isPrime(5));
        System.out.println(p.isPrime(6));
        
    }
}
