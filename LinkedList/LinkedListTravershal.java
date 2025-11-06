// package LinkedList;

public class LinkedListTravershal {

    //Node class (same as struct Node in c++)
    static class Node{
        int data; //stores data
        Node next; //stores reference to next is null
    

    //constructor to initialize a new node
        Node(int data){
            this.data=data; //assign the value to data
            this.next=null; //initialising that next is null

    }
}

        static void travershal(Node head){
            Node temp =head;
            while(temp!=null){
                System.out.println("Element :"+temp.data);
                temp=temp.next;
            }
        }
public  static void main(String [] args){

    //creates nodes(objects)
    Node head =new Node(11);
    Node second=new Node(22);
    Node third= new Node(33);
    Node fourth =new Node(44);
    Node fifth =new Node(55);

    //link nodes together
    head.next=second;
    second.next=third;
    third.next=fourth;
    fourth.next=fifth;
    fifth.next=null;

    travershal(head);




}
    
}
