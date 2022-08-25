package LAB.lab1;
import java.util.Scanner;
public class Q5SumofNaturalNumber {
    int addition(int num){
        if(num==0)
            return 0;
        return (num+addition(num-1));
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Q5SumofNaturalNumber sum=new Q5SumofNaturalNumber();
        System.out.print("Enter a number to calculate sum: ");
        int num=scan.nextInt();
        int result=sum.addition(num);
        System.out.print("Sum of natural number from 1 to "+num+" is : "+result);
    }
}
