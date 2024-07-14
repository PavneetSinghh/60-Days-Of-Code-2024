//**********    
// *******
//  *****
//   ***
//    *

class Pattern8
{
public static void main(String args[])
{
    for(int i=0;i<5;i++)
    {
        //space
        for(int j=0;j<i;j++)
        {
            System.out.print(" ");
        }
        //star
        for(int j=0;j< 10-(2*i+1);j++)
        {
            System.out.print("*");
        }
        //space
        for(int j=0;j<i;j++)
        {
            System.out.print(" ");
        }
        System.out.println();
    }
}
}