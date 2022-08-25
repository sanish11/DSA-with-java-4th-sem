package unit3;

import java.util.Scanner;

class stack{
    private int maxsize;
    private int top;
    private int[] stackarray;
    public stack(int size){//ya 10 auxa value //class kai nam ko constructor banaunxa
        maxsize=size;//maxsize=10
        stackarray=new int[size];//array ko size ni 10
        top=-1;//aile ko lai yo khali xa vaneko // aba feri tala janxa
    }
    public boolean isFull(){//top ko size max xa ki xaina chek garxa
        return (top==maxsize-1);
    }
    public boolean isEmpty(){
        return (top==-1);//top ko value -1 napugesmma
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack empty");
        }
        return stackarray[top--];//esle just top ko value -- garxa //2 0 index ma xa vaya usle 0 wala number dekauxa and delete gardinxa
                                //stackarray[0]=2; ->yo value pop ko thau ma auxa display hunxa and delete hunxa
    }
    public void push(int id){//esma 2 auxa
        if(!isFull()){//isfull function check garxa
            top++;//top=-1 ma xa so aba top++ vayara 0 ma janxa
            stackarray[top]=id;//2 wala value xai array ko top wala ma store hunxa
        }else{
            System.out.println("Stack is full");//if top==0-9 wala 9 then it shows this message..
        }
    }
    public void display(){
        int t=top; //top lai xutai garerea garekoi xa so that aru kura ma effect nagarois
        if(t==-1){
            System.out.println("Empty stack");
        }
        while(t!=-1){
            System.out.println(stackarray[t]);//if stackarray[3]=2 xa and stackarray[2]=1 xa vaya 
                                            //esle stackarray[3]=2 paila dekhauxa and t-- garesi stackarray[2] ma pugxa
                                            //then stackarray[2]=1 vanera dekhauxa 
            t--;
        }
    }
}
public class StackUsingArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter size of stack: ");
        char choice;
        int size=scan.nextInt();//10 diyo re
        stack node=new stack(size);//stack constructor ma janxa 10
        do{//ekxoti chalxa and prints all these and choice gar vanxa
            System.out.println("1. Push");
            System.out.println("2. Pop a element");
            System.out.println("3. Pop all elements");
            System.out.println("4. Display");
            System.out.println("Enter your choice: ");
            int select=scan.nextInt();
            switch(select){
                case 1:
                    System.out.print("Enter number to push: ");
                    int element=scan.nextInt();//data magxa manam 2 diyo
                    node.push(element);//aba node le call garxa push vanne//node vanne hamle stack class ko objxa so stack ko sab function ham,le use grna milxa 
                break;//aba break hunxa
                case 2:
                    System.out.println("Popping a element of stack: ");//aba 2 choose gryoki yo auxa
                    System.out.println(node.pop());//stack ko pop function ma call garxa
                break;
                case 3:
                    System.out.println("Popping all elements: ");
                    while(!node.isEmpty()){ //loop le isEmpty navaya smma pop garairakxa
                        System.out.println(node.pop());
                    }
                break;
                case 4:
                    System.out.println("Displaying elements of stack: ");
                    node.display();
                break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("Do you wish to continue?(Y/N)");//choose garauxa feri garne ki nai vanera
            choice=scan.next().charAt(0);
        }while(choice=='Y' || choice=='y');//ana while ko condition y ra Y vaya smma loop chalxa
    }   
}
