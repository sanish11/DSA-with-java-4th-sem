package LAB.lab1;

import java.util.Scanner;

public class Q1factorial{
    int fact(int num){
        if(num==1)
            return 1;
        return num*fact(num-1);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Q1factorial f=new Q1factorial();
        System.out.print("Enter a number to calculate factorial: ");
        int num=scan.nextInt();
        int result=f.fact(num);
        System.out.println("The factorial of "+num+" is "+result);
    }
}