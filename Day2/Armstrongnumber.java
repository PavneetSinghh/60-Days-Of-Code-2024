//To check for Armstrong Number
class Ans 
{
    public static boolean isArmstrong(int x){
    int dupx=x;
    int sum=0;
    while(x!=0)
    {
        int ld=x%10;
        sum=sum+(ld*ld*ld);
        x=x/10;
    }
    return dupx==sum;   
    }  
}
class Armstrongnumber{
    public static void main(String args[])
    {
        System.out.println(Ans.isArmstrong(131));
        System.out.println(Ans.isArmstrong(371));
    }
}
