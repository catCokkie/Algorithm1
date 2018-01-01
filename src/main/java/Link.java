/**
 * Description:
 *
 * @author Administrator
 * @date 2017-12-13
 */
public class Link {
    public class Node<T> {
        public T value;
        public Node next;

        public Node( T data ) {
            this.value = data;
        }

    }

    public Node addList( Node head1, Node head2 ) {
        head1 = reverseList(head1);
        head2 = reverseList(head2);

        int ca = 0;
        int n1 = 0;
        int n2 = 0;
        int n = 0;
        Node c1 = head1;
        Node c2 = head2;
        Node node = null;
        Node pre = null;
        while (c1 != null || c2 != null) {
            n1 = c1 != null ? transformT(c1) : 0;
            n2 = c2 != null ? transformT(c2) : 0;
            n=n1+n2+ca;
            pre =node;
            node=new Node(n%10);
            node.next=pre;
            ca=n/10;
            c1=c1!=null?c1.next:null;
            c2=c2!=null?c2.next:null;
        }
        if (ca==1){
            pre =node;
            node =new Node(1);
            node.next=pre;
        }
        reverseList(head1);
        reverseList(head2);
        return node;
    }

    public Node reverseList( Node head ) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;

        }
        return pre;
    }

    public int transformT( Node value ) {
        Node temp = value;
        return Integer.parseInt(temp.toString());
    }
}
