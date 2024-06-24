public class LinkedList {
    public Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void reverse(){
        if(head == null || head.next ==null){
            return;
        }
        Node prev = head; 
        Node curr = head.next;

        while(curr!=null){
            Node nextNode = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nextNode;
        }

        head.next = null;
        head = prev;
    }

    public Node middleOfLinkedList(){
        if(head == null || head.next == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("No elements present");
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("No elements present");
        }

        if(head.next == null){
            head = null; 
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next !=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void print(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(4);
        ll.addfirst(2);
        ll.addLast(6);
        ll.addLast(8);
        ll.addLast(10);
        ll.reverse();
        ll.print();
        ll.deleteLast();
        ll.print();
    }

}
