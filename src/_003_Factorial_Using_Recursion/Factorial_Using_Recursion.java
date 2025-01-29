package _003_Factorial_Using_Recursion;

import java.util.Scanner;

public class Factorial_Using_Recursion {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.println("Factorial of "+num+"is: "+Factorial_Using_Recursion(num));
    }

    public static int Factorial_Using_Recursion(int num)
    {
        if(num==1)
        {   return 1; }
        else
        {
            return num*Factorial_Using_Recursion(num-1);
        }
    }
}
