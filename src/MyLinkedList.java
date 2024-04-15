import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {
    class MyNode<E>{
        E data;
        MyNode nextNode;
        MyNode previNode;
        public MyNode(E data){
            this.data = data;
            this.nextNode = null;
            this.previNode=null;
        }
        public MyNode(E data,MyNode<E> nextNode, MyNode<E> prevNode){
            this.data = data;
            this.nextNode = nextNode;
            this.previNode=prevNode;
        }
        public MyNode() {
            this.data = null;
            this.nextNode = null;
            this.previNode = null;
        }
    }
    private MyNode head;
    private MyNode tail;
    private int size;
    public MyLinkedList(){
        head= null;
        tail=null;
        size = 0;
    }
    public void checkUp(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
        }
    }
    @Override
    public void add(T item) {
        MyNode newNode = new MyNode(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            newNode.previNode = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void set(int index, T item) {
        checkUp(index);
        MyNode current = head;
        for(int i=0;i<index;i++){
            current = current.nextNode;
        }
        current.data = item;
    }

    @Override
    public void add(int index, T item) {
        checkUp(index);
        MyNode newNode = new MyNode(item);
        if(index == 0){
            newNode.nextNode = head;
            head.previNode = newNode;
            head = newNode;
        }
        else if(index == size){
            tail.nextNode = newNode;
            newNode.previNode = tail;
            tail = newNode;
        }
        else{
            MyNode current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.nextNode;
            }
            newNode.nextNode = current.nextNode;
            newNode.previNode = current;
            current.nextNode.previNode = newNode;
            current.nextNode = newNode;
        }
        size++;
    }

    @Override
    public void addFirst(T item) {

    }

    @Override
    public void addLast(T item) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public void sort() {

    }

    @Override
    public int indexOf(Object obiect) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }

    @Override
    public boolean exists(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
