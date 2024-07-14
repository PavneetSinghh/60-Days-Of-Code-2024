//Printing all the divisors
class divisor
{
    public int div(int x)
    {
        int count=0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                System.out.println(i);
                count +=count;
            }
        }
        return count;
    }
}
class Printalldivisors
{
    public static void main(String args[])
    {
        divisor d=new divisor();
        System.out.println(d.div(10));
    }
}
