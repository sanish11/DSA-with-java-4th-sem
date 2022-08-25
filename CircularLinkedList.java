import java.util.Scanner;


class CircularLinkedList{
    Node first, last;//Node vaneko xai hamro linked list ko object ho
    class Node{
        int data;//data vanne var
        Node next;//adn next vanne var
        Node(int item){//
            data = item;
            next = null;
        }
    }
    public void insertFirst(int data){
        Node node = new Node(data);
        if (first == null){
            first = last = node;
            node.next = node;
        }
        else{
            node.next = first;
            first = node;
            last.next = node;
        }
    }
    public void insertLast(int data){
        Node node = new Node(data);
        if (first == null){
            first = last = node;
            node.next = node;
        }
        else{
            last.next = node;
            last = node;
            node.next = first;
        }
        
    }
    public void insertSpecific(int pos, int data){
        Node node = new Node(data);
        if (first == null){
            first = last = node;
            node.next = node;
        }
        else{
            if (pos == 1){
                node.next = first;
                first = node;
                last.next = node;
            }
            else{
                int count = 1, flag = 0;
                Node temp = first;
                Node temp1 = first.next;
                while (temp != last ){
                    if (count == pos-1){
                        temp.next = node;
                        node.next = temp1;
                        flag = 1;
                        break;
                    }
                    temp = temp.next;
                    temp1 = temp1.next;
                    count++;
                }
                if (flag == 0){
                    System.out.println("Position out of reach");
                }
            }
        }
    }
    public void deleteFirst(){
        if (first == null){
            System.out.println("Empty Linked List");
        }
        else{
            if (first == last){
                System.out.println("Element to be deleted:"+first.data);
                first = last = null;
            }
            else{
                System.out.println("Element to be deleted:"+first.data);
                first = first.next;
                last.next = first;
            }
        }
    }
    public void deleteLast(){
        if (first == null){
            System.out.println("Empty Linked List");
        }
        else{
            if (first == last){
                System.out.println("Element to be deleted:"+first.data);
                first = last = null;
            }
            else{
                Node temp = first;
                while (temp.next != last){
                    temp = temp.next;
                }
                System.out.println("Element to be deleted:"+last.data);
                last = temp;
                last.next = first;
            }
        }
    }
    public void deleteSpecific(int pos){
        if (first == null){
            System.out.println("Empty Linked List");
        }
        else{
            if (pos == 1){
                System.out.println("Element to be deleted:"+first.data);
                if (first == last){
                    first = last = null;
                }
                else{
                    first = first.next;
                    last.next = first; 
                }
            }
            else{
                int count =1 ,flag = 0;
                Node t1,t2;
                t1 = first;
                t2 = first.next;
                while (t2 != first){
                    if (count == pos-1){
                        t1.next = t2.next;
                        System.out.println("Element to be deleted:"+t2.data);
                        if (t2 == last){
                            last = t1;
                        }
                        t2 = null;
                        flag = 1;
                        break;
                    }
                    t1=t1.next;
                    t2 = t2.next;
                    count++;
                }
                if (flag == 0){
                    System.out.println("Position out of reach");
                }
            }
        }
    }
    public void display(){
        if (first == null){
            System.out.println("Empty Linked List");
        }
        else{
            Node temp = first;
            do{
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }while(temp != first);
        }
        System.out.println();
    }
    public static void main(String[] args){
        CircularLinkedList list = new CircularLinkedList();
        Scanner sc = new Scanner(System.in);
        int data,pos;
        char choice;
        do{
            System.out.println("1.Insert data at first\n2.Insert data at last\n3.Insert data at specific position\n4.Delete data at first\n5.Delete data from last\n6.Delete data from specific position\n7.Display linked list");
            System.out.println("Enter your choice:");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter data to be inserted:");
                    data = sc.nextInt();
                    list.insertFirst(data);
                    break;
                case 2:
                    System.out.println("Enter data to be inserted:");
                    data = sc.nextInt();
                    list.insertLast(data);
                    break;
                case 3:
                    System.out.println("Enter data to be inserted:");
                    data = sc.nextInt();
                    System.out.println("Enter position:");
                    pos = sc.nextInt();
                    list.insertSpecific(pos,data);
                    break;
                case 4:
                    list.deleteFirst();
                    break;
                case 5:
                    list.deleteLast();
                    break;
                case 6:
                    System.out.println("Enter position to delete:");
                    pos = sc.nextInt();
                    list.deleteSpecific(pos);
                    break;
                case 7:
                    System.out.print("Circular Linked List: ");
                    list.display();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println("Continue?(Y/N)");
            choice = sc.next().charAt(0);
        }while (choice == 'y' || choice == 'Y');
    }
}