package linkedlist;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};

        /*First object of Linked list */
        System.out.println("---------test 1--------");
        LinkedList h1 = new LinkedList(arr);
        System.out.println(h1.traveseList());
        System.out.println("Length of the lsit: "+h1.countNode());
        System.out.println("Index of 20: "+h1.getIndex(20));
        System.out.println(h1.getItem(9));

        System.out.println("---------test 2--------");
        h1.insert(4,50);
        System.out.println(h1.traveseList());
        h1.insert(0,60);
        System.out.println(h1.traveseList());
        h1.insert(3, 70);
        System.out.println(h1.traveseList());

        System.out.println("---------test 3--------");
        h1.delete(70);
        System.out.println(h1.traveseList());
        h1.delete(60);
        System.out.println(h1.traveseList());

    }
    
}
