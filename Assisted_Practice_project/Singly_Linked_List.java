package Assisted_Practice_project;

public class Singly_Linked_List {
	class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
     
      
    public Node head = null;    
    public Node tail = null;    
        
    
    public void addNode(int data) {    
        
        Node newNode = new Node(data);    
            
           
        if(head == null) {    
              
            head = newNode;    
            tail = newNode;    
        }    
        else {    
             
            tail.next = newNode;    
           
            tail = newNode;    
        }    
    }    
      
    public void display() {    
      
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            
            System.out.print(current.data + " ");    
            current = current.next;             
        }    
        System.out.println();    
    }    
        
    public static void main(String[] args) {    
            
        Singly_Linked_List sList = new Singly_Linked_List();    
            
       
        sList.addNode(5);    
        sList.addNode(4);    
        sList.addNode(3);    
        sList.addNode(2);    
         
        sList.display();    
    }    

}
