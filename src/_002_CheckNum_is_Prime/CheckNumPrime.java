package _002_CheckNum_is_Prime;
// Instead of checking all numbers up to n-1, the loop only goes up to sqrt(n).
// If a number n has a divisor greater than sqrt(n), it must also have a smaller divisor.

import java.util.Scanner;

public class CheckNumPrime {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();

        if(isPrime(num))
        {
            System.out.println(num+" is a Prime Number");
        }
        else{
            System.out.println(num+" is NOT a Prime Number");
        }
    }

    public static boolean isPrime(int num)
    {
        if(num<2){
            return false;
        }

        for(int n=2; n<=Math.sqrt(num); n++)
        {
            if(num%n==0)
            {
                return false;
            }
        }

        return true;
    }


}

