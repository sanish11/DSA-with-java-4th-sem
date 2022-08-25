package LAB.lab1;

import java.util.Scanner;

public class Q3Square {
    static int square(int n){
        if(n==0)
            return 0;
        else
            return ((square(n-1)+(2*n)-1));
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=s.nextInt();
        int result=square(n);
        System.out.print("Square of "+n+ " is "+result);
    }
}
