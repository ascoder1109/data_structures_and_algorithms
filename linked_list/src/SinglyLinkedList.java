
public class SinglyLinkedList {

    public ListNode head;
    public static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int lengthOfSinglyLinkedList(){
        ListNode currentNode = head;
        int count = 0;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    public void printAllElemets(){
        ListNode currentNode = head;
        while (currentNode!=null) {
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.print("null");

    }

    public void insertAtBeginning(int element){
        ListNode newNode = new ListNode(element);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int element){
        ListNode newNode = new ListNode(element);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode currentNode = head;
        while (currentNode.next!=null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        newNode.next = null;
    }

    public void insertAtPosition(int element, int position){
        ListNode newNode = new ListNode(element);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count<position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }
    }

    public ListNode deleteFirst(){
        if(head==null) return null;
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    // public ListNode deleteLast(){
    //     if(head==null) return null;
    // }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(32);
        
        ListNode second = new ListNode(78);
        ListNode third = new ListNode(11);
        ListNode fouth = new ListNode(10);
        sll.head.next = second;
        second.next = third;
        third.next = fouth;
        sll.printAllElemets();
        System.out.println();
        sll.insertAtBeginning(22);
        sll.printAllElemets();
        System.out.println();
        sll.insertAtEnd(88);
        sll.printAllElemets();
        System.out.println();
        sll.insertAtPosition(54, 2);
        sll.printAllElemets();
        System.out.println();
        System.out.println(sll.lengthOfSinglyLinkedList());
        
        sll.deleteFirst();
        sll.printAllElemets();
    }
}