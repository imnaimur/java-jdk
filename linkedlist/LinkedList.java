package linkedlist;

public class LinkedList {
    Node head;
    
    public LinkedList(int[] arr){
        this.head = new Node(arr[0]);
        Node tail = this.head;
        int i = 1;
        while(i<arr.length){
            Node n = new Node(arr[i]);
            tail.next = n;
            n.prev = tail;
            tail = tail.next;
            i ++;
        }
    }
    public String traveseList(){
        Node tail = this.head;
        String s = "";
        while(tail.next != null){
            s += Integer.toString(tail.element)+ " ";
            tail = tail.next;
        }
        s += Integer.toString(tail.element);
        return s;
    }

    public int countNode(){
        Node tail = this.head;
        int count = 0;
        while(tail.next != null){
            count +=1;
            tail = tail.next;
        }
        return count+1;
    }

    public int getIndex(int itm){
        Node tail = this.head;
        int n = this.countNode();
        int i=0;
        while(i < n){ 
            if (tail.element == itm){
                break;
            }
            tail = tail.next;
            i ++;
        }
        return i;
    }


    public String getItem(int idx){
        Node tail = this.head;
        int i = 0;
        int n = this.countNode();
        if(idx<0 || idx>n){
            return "Invalid Index";
        }
        while(i < idx){
            tail = tail.next;
            i++;
        }
    
        return Integer.toString(tail.element);
    }


    public void insert(int idx, int elem){
        Node tail = this.head;
        int count = this.countNode();
        Node n = new Node(elem);
        
        if(idx == 0){
            n.next = this.head;
            this.head.prev = n;
            this.head = n;
        
        }else if(idx==count){

            while(tail.next != null){
                tail = tail.next;
            }
            tail.next = n;
            n.prev = tail;
        }else{
            int i = 0;
            while(i<idx-1){
                tail = tail.next;
                i++;
            }
            Node tail2 = tail.next;
            tail.next = n;
            n.prev = tail;
            n.next = tail2;
            tail2.prev = n;
        }
    }
    public void delete(int elem){
        Node tail = this.head;
        int count = this.countNode();
        int idx = this.getIndex(elem);
        int rem;
        
        if(idx == 0){
            rem = this.head.element;
            this.head = this.head.next;
        
        }else if(idx==(count-1)){

            while(tail.next != null){
                tail = tail.next;
            }
            rem = tail.element;
            tail = null;
        }else{
            int i = 0;
            while(i<idx-1){
                tail = tail.next;
                i++;
            }
            Node tail2 = tail.next;
            rem = tail2.element;
            tail2 = tail2.next;
            tail.next = tail2;
            tail2.prev = tail;
            
        }
        System.out.println("Removed element: "+rem);
    }   
    
}
