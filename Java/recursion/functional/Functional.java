package Java.recursion.functional;

import java.util.Scanner;

public class Functional {
    public static void main(String args[]){
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbe n1:");
        n=scanner.nextInt();

        int sum=sumOfNnumber(n);
        System.out.println("sum is:"+sum);
    }

    public static int sumOfNnumber(int n){
        if(n==0){
            return 0;
        }else{
            return n+sumOfNnumber(n-1);
        }
    }
}
