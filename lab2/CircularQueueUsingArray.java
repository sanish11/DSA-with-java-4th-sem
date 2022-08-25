package unit3;

import java.util.Scanner;

public class CircularQueueUsingArray {
    public static void main(String[] args) {
        char choice;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter size of the circular queue: ");
        int size=scan.nextInt();
        CircularQueue queue=new CircularQueue(size);//size aba queue vanne class ma janxa 
        do{
            System.out.println("1. Enqueue ");
            System.out.println("2. Dequeue a element");
            System.out.println("3. Display");
            System.out.println("Enter your choice: ");
            int select=scan.nextInt();
            switch(select){
                case 1:
                    System.out.print("Enter number to enqueue: ");
                    int element=scan.nextInt();
                    queue.enQueue(element);
                break;
                case 2:
                    System.out.println("Dequeue elements of queue: ");
                    System.out.println(queue.deQueue());
                break;
                case 3:
                    System.out.println("Displaying elements of queue: ");
                    queue.display();
                break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("Do you wish to continue?(Y/N)");
            choice=scan.next().charAt(0);
        }while(choice=='Y' || choice=='y');
    }   
}
class CircularQueue{
    int size;//yo size=10,instance var ko size xai 10
    int front,rear;
    int queue[];
    CircularQueue(int size){ //size yo constructor ma auxa (ya xai value 5 ayo re)
        this.size=size;//this le xai call garera lyako size ho hai vanxa(mathi ko instance var ko value bata xai override gardincxa and 10 lai 5 banaidinxa)
        queue=new int[size];//queue avnne array banxa
        front=-1;//front=-1
        rear=-1;//rear=-1 ma set gardinxa when  its empty
    }
    private boolean isFull(){
        return (front==((rear+1)%size));//reaer+1%size le vaneko xai last value ho 
    }
    private boolean isEmpty(){
        return (front==-1);
    }
    void enQueue(int element){
        if(isFull()){ //is full ma janxa
            System.out.println("Queue is full");
        }else{
            if(front==-1)
                front=0;
            rear=(rear+1)%size;//-1+1%8=0,0+1%8=1,1+1%8=2, esari nai kam garxa 8 smma napuge smma
            queue[rear]=element;//top ko jsto kam garxa stack ma..esma user le pathako element halxa
            System.out.println("Inserted "+element);
        }
    }
    int deQueue(){
        int element;
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }else{
            element=queue[front];
            if(front==rear){
                front=-1;
                rear=-1;
            }else{
                front=(front+1)%size;//front lai katxa and tyo paxi ko value afai ayara basxa
            }
            return element;
        }
    }
    public void display(){
        int i;
        if(isEmpty()){
            System.out.println("Empty queue");
        }else{
            System.out.println("front = " +front);
            System.out.print("Items = ");
            for(i=front;i!=rear;i=(i+1)%size)
                System.out.print(queue[i]+ " ");
            System.out.println(queue[i]);
            System.out.println("Rear = "+rear);
        }
    }
}
