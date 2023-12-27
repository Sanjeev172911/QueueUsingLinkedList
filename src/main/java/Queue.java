public class Queue <T>{
    Node<T>head;
    Node<T>tail;

    Queue(){
        head=null;
        tail=null;
    }

    boolean isEmpty(){
        return head==null;
    }

    public int size(){
        int cnt=0;
        Node<T>temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }

        return cnt;
    }

    public void enqueue(T data){
        Node<T>newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void dequeue(){
        if(head==null){
            tail=null;
            System.out.println("Queue is empty");
        }else{
            head=head.next;
            if(head==null) tail=null;
        }
    }

    public void display(){
        if(isEmpty()) System.out.println("Queue is empty.");
        Node<T>temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


}
