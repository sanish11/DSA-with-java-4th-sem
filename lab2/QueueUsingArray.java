 

import java.util.Scanner;

public class QueueUsingArray {
    public static void main(String[] args) {
        char choice;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter size of the queue: ");
        int size=scan.nextInt();
        Queue node=new Queue(size);
        do{
            System.out.println("1. Enqueue ");
            System.out.println("2. Dequeue a element");
            System.out.println("3. Dequeue all elements");
            System.out.println("4. Display");
            System.out.print("Enter your choice: ");
            int select=scan.nextInt();
            switch(select){
                case 1:
                    System.out.print("Enter number to enqueue: ");
                    int element=scan.nextInt();
                    node.enqueue(element);
                break;
                case 2:
                    System.out.println("Dequeue elements of queue: ");
                    System.out.println(node.dequeue());
                break;
                case 3:
                    System.out.println("Displaying elements of queue: ");
                    while(!node.isEmpty())
                       System.out.println(node.dequeue());
                break;
                case 4:
                    System.out.println("Displaying elements of queue: ");
                    node.display();
                break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("Do you wish to continue?(Y/N)");
            choice=scan.next().charAt(0);
        }while(choice=='Y' || choice=='y');
    }   
}
class Queue{
    private int maxsize;
    private int front,rear;
    private int[] queuearray;
    Queue(int size){
        maxsize=size;
        front=0;
        rear=-1;
        queuearray=new int[maxsize];
    }
    public boolean isEmpty(){
        return (front==-1);
    }
    public void enqueue(int id){
        if(rear==maxsize-1){
            System.out.println("Queue is full");
        }else{
            if(front==-1)
                front=rear=0;
            else    
                rear++;
            queuearray[rear]=id;
        }
    }
    public int dequeue(){
        int item=0;
        item=queuearray[front];
        if(rear==front){
            front=rear=-1;
        }else{
            front++;
        }
        return item;
    }
    public void display(){
        if(rear==-1){
            System.out.println("Empty queue");
        }else{
            for(int i=front;i<=rear;i++)
                System.out.println(queuearray[i]+" ");
        }
    }
}

