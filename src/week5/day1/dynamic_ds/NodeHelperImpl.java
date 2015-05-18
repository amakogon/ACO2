package week5.day1.dynamic_ds;

/**
 * Created by serhii on 18.05.15.
 */
public class NodeHelperImpl implements INodeHelper {

    @Override
    public void printChain(Node head) {
        Node iter = head;
        while (iter != null){
            System.out.print(iter.value + "->");
            iter = iter.next; // step forward in chain
        }
        System.out.println();
    }


    @Override
    public Node addToHead(Node head, Object newVal) {
        return new Node(newVal,head); // create, link then return(it will be new head)
    }

    @Override
    public void addToTail(Node head, Object newVal) {
        // first go down and find free place(tail)
        Node iter = head;

        while(iter.next != null){
            iter = iter.next;
        }

        Node newNode = new Node(newVal,null);// create new node
        iter.next = newNode;// link with tail
    }

    @Override
    public Node create(Object... mas) {
        Node head = null;

        for (int i = mas.length - 1; i >= 0; i--) {
            head = addToHead(head,mas[i]);
        }

        return head;
    }

    @Override
    public String toString(Node head) {
        return head != null ? head.value + "->" + toString(head.next) : "";
    }
}
