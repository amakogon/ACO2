package week5.day1.dynamic_ds;

/**
 * Created by serhii on 18.05.15.
 */
public interface INodeHelper {

    void printChain(Node head);

    Node addToHead(Node head, Object newVal);
    void addToTail(Node head, Object newVal);

    Node create(Object...mas); // Object[] mas

    String toString(Node head);

}
