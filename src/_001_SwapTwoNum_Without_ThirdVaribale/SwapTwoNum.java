package _001_SwapTwoNum_Without_ThirdVaribale;

public class SwapTwoNum {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;

        System.out.println("Before Swap:\na="+a+"\nb="+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap:\na="+a+"\nb="+b);

    }
}
