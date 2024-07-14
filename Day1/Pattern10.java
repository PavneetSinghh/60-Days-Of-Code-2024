//*
//**
//***
//****
//*****
//****
//***
//**
//*
class Main {
   
    static void pattern10(int N) {
        // Outer loop for number of rows.
        for(int i = 1; i <= 2 * N - 1; i++) {
            // Stars would be equal to the row number until the first half.
            int stars = i;
            
            // For the second half of the rotated triangle.
            if(i > N) stars = 2 * N - i;
            
            // For printing the stars in each row.
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
 
    public static void main(String[] args) 
    {
        int N = 5;
        pattern10(N);
    }
 }
 