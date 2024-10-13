package Java.recursion.parameterized;

import java.util.Scanner;

public class Parameterized {

    public static void  main(String args[]){
        /*find sum of first n numbers
         * this is parameterized recursion because in every call we passing a parameter sum
         * and function is priniting itself value not returning
         */
        int n;
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number n:");
        n=scanner.nextInt();
        sumOfNnumbers(n,sum);

    }

    public static void sumOfNnumbers(int i, int sum){
        if(i<1){
            System.out.println("sum is:"+sum);
            return;
        }
        sumOfNnumbers(i-1, sum+i);
    }
    
}
