package LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList abc=new LinkedList();

        abc.insertAtFirst(2);
        abc.insertAtFirst(4);
        abc.insertAtFirst(8);

        abc.insertAtFirst(10);
        abc.insertLast(144);
        abc.insertAtFirst(17);
        abc.insert(45,2);
        abc.Print();


//        abc.deleteFirst();
//        abc.deletelast();
        abc.delete(1);


        abc.Print();

    }
}
