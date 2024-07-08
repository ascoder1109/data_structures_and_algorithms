
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

    public ListNode deleteLast(){
        if(head==null || head.next == null) return head;
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public void deleteFromSpecificPosition(int position){
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count<position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }        
        
    }
    public void deleteByKey(int key){
        ListNode current = head;
        ListNode temp = null;
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }
        while (current != null && current.data!= key) {
            temp = current;
            current = current.next;
        }
        if (current==null) {
            return;
        }
        temp.next = current.next;
    }
    
    public boolean containsLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr!=null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr==fastPtr) {
                return true;
            }
        }
        return false;
    }

    public void createALoopInLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        sixth.next = third;
        
    }

    public ListNode startNodeInALoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr!=null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr==fastPtr) {
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }

    private SinglyLinkedList.ListNode getStartingNode(SinglyLinkedList.ListNode slowPtr) {
        ListNode temp = head;
        while (temp != head) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
    }

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
        System.out.println();
        
        sll.deleteLast();
        sll.printAllElemets();
        System.out.println();

        sll.deleteFromSpecificPosition(2);
        sll.printAllElemets();
        System.out.println();

        sll.createALoopInLinkedList();
        System.out.println(sll.containsLoop());
    }
}