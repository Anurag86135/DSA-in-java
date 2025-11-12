class Node{
    int data;
    Node next;//points to next node

    //Constructor
    Node(int data){
        this.data=data;
        this.next=null;
    }
}




public class linkedListInsertion {
    // Travershal
    static void Travershal(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    //Case 1: insertion
    static Node insertAtfirst(Node head,int data){
        Node newNode=new Node(data);
        newNode.next=head;
        return newNode;


    }
    // Case 2: Insert at given index

    static Node insertAtIndex(Node head,int data,int index){
        if(index==0){
            return insertAtfirst(head,data);
        }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<index-1 && temp!=null){
            temp=temp.next;
            i++;
        }
        if (temp==null){
            System.out.println("Index out of bound!");
            return head;
            
        }
            newNode.next =temp.next;
            temp.next=newNode;
            return head;
    }

    // Case 3:Insert at end

    static Node insertAtEnd(Node head,int data){
        Node newNode=new Node(data);
        if(head ==null) return newNode;
        Node temp =head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;

    }
    // Case 4: insert after after given node
     static Node insertAfterNode(Node head,Node prevNode,int data){
        if(prevNode ==null){
            System.out.println("Previous node cannot be null");
            return head;
        }
        Node newNode =new Node(data);
        newNode.next=prevNode.next;
        prevNode.next=newNode;
        return head;
     }

     public static void main(String []args){
        //Create Nodes
        Node head =new Node(12);
        Node second=new Node(13);
        Node third=new Node(14);
        Node fourth =new Node(15);

        //link nodes
        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;

        System.out.println("Linked list before Insertion :");
        Travershal(head);
        // head=insertAtfirst(head, 220);
        // head=insertAtIndex(head, 33, 2);
        // head=insertAtEnd(head, 49);
        head=insertAfterNode(head,third,88);
        System.out.println("\nLinked list after insertion:");
        Travershal(head);

     }

    
}
