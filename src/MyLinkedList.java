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
        add(0,item);
    }

    @Override
    public void addLast(T item) {
        add(item);
    }

    @Override
    public T get(int index) {
        checkUp(index);
        MyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.nextNode;
        }
        return (T) current.data;
    }

    @Override
    public T getFirst() {
        return (T) head.data;
    }

    @Override
    public T getLast() {
        return (T) tail.data;
    }

    @Override
    public void remove(int index) {
        checkUp(index);
        if(index == 0){
            head = head.nextNode;
            head.previNode = null;
        }
        else if(index == size-1){
            tail = tail.previNode;
            tail.nextNode = null;
        }
        else{
            MyNode current = head;
            for(int i = 0;i<index;i++){
                current = current.nextNode;
            }
            current.previNode.nextNode = current.nextNode;
            current.nextNode.previNode = current.previNode;
        }
        size--;
    }

    @Override
    public void removeFirst() {
        remove(0);
    }

    @Override
    public void removeLast() {
        remove(size-1);
    }

    @Override
    public void sort() {
        MyNode<T> current;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            current = head;
            while (current != null && current.nextNode != null) {
                if (((Comparable<T>) current.data).compareTo((T) current.nextNode.data) < 0) {
                    T temp = current.data;
                    current.data = (T) current.nextNode.data;
                    current.nextNode.data = temp;
                    sorted = false;
                }
                current = current.nextNode;
            }
        }
    }


    @Override
    public int indexOf(Object object) {
        MyNode current = head;
        for(int i =0;i<size;i++){
            if(current.data.equals(object)){
                return i;
            }
            current = current.nextNode;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        MyNode current = tail;
        for(int i =size-1;i>=0;i--){
            if(current.data.equals(object)){
                return i;
            }
            current = current.previNode;
        }
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
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
