import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println(fib(8));

    }
    //Problem 1
    public static int factorial(int a){
        if (a==0){
            return 1;}
        if(a<0){
            System.out.println("İnvalid enter!!!");
            return 0;
        }
        return a * factorial(a-1);
    }

    //Problem 2
    public static int sumDigits(int a){
        if (a<10){
            return a;}
        return a%10 + sumDigits(a/10);
    }


    //Problem 3
    public static long power(long base,int exp){
        if(exp == 0){
            return 1;
        }
        return base * power(base,exp-1);
    }


    //Bonus Problem
    public static int fib(int a){
        if (a==1||a==0){
            return a;}
        return fib(a-1) + fib(a-2);
    }

}
