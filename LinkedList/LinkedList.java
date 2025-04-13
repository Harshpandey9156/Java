package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size=0;
    }



    public void insert(int value , int index){
        if(index==0){
            insertAtFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp=head;
        for (int i=1;i<index;i++){
            temp= temp.next;

        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
    }


    public void insertLast(int val)
    {
        if(tail==null){
           insertAtFirst(val);
            return;
        }
        Node temp=new Node(val);
        tail.next=temp;
        tail=temp;
        size++;
    }

    public void insertAtFirst(int val){
        Node node=new Node(val);

        node.next=head;
        head=node;
        if(tail==null){
            tail=head;

        }
        size+=1;

    }


    public int deleteFirst(){
        int val= head.values;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }



    public int deletelast() {
        if (size == 0) {
            System.out.println("List is empty.");
            return -1;
        }

        int n = size - 1;
        int val = tail.values;


        if (size == 1) {
            head = tail = null;
        } else {
            Node current = head;
            while (current.next != tail) {
                current=current.next;
            }
            current.next=null;
            tail=current;

        }
        return val;
    }



    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==(size-1)){
            return deletelast();
        }
        Node current=head;
        int i=1;
        while(i<index){
            current=current.next;
            i++;
         }

        int val= current.next.next.values;
        current.next=current.next.next;
        size--;


        return val;
    }


    public void Print(){
        Node temp= head;
        while (temp!=null){
            System.out.print(temp.values +" -> ");
            temp=temp.next;
        }
        System.out.println("END");

    }




    private class Node{
        private int values;
        private  Node next;


        public Node(int values) {
            this.values = values;
        }

        public Node(int values,Node next) {
            this.values = values;
            this.next=next;
        }
    }



}
