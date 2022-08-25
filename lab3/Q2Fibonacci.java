package LAB.lab1;
import java.util.Scanner;
public class Q2Fibonacci {
    static int fibn(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        return fibn(n-1)+fibn(n-2);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scan.nextInt();
        System.out.println("Fibonacci series upto "+n+ " term is: ");
        for(int i=0;i<n;i++){
            System.out.print(fibn(i)+" ");
        }
    }
}
