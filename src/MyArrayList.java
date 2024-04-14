import java.util.Iterator;

public class MyArrayList<T> extends Comparable<T> implements MyList<T>{
    private Object[] arr;
    private int length = 0;
    private static final int capacity = 10;
    public MyArrayList(){
        this(capacity);
        length = 0;
    }

    public MyArrayList(int initialCapacity) {
        if(initialCapacity<0)
            throw new IllegalArgumentException("Illegal capacity: " + initialCapacity);
        arr = new Object[initialCapacity];
    }

    private void IncreaseCapacity(){
        Object[] newarr = new Object[arr.length * 2];
        for(int i =0;i<length;i++) {
            newarr[i] = arr[i];
        }
        arr = newarr;
    }

    @Override
    public void add(T item) {
        if(length == arr.length)
            IncreaseCapacity();
        arr[length++] = item;
    }
    public void checkup(int index){
        if(index< 0 || index>=length){
            throw new IndexOutOfBoundsException("index: " + index + "size: " + length );
        }
    }
    @Override
    public void set(int index, T item) {
        checkup(index);
        arr[index] = item;
    }


    @Override
    public void add(int index, T item) {
        checkup(index);
        if(length == arr.length)
            IncreaseCapacity();
        System.arraycopy(arr, index, arr, index + 1, length - index);
        arr[index] = item;
        length++;
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
        checkup(index);
        return (T) arr[index];
    }

    @Override
    public T getFirst() {
        if(length==0){
            throw new IndexOutOfBoundsException("List does not exist");
        }
        return (T) arr[0];
    }

    @Override
    public T getLast() {
        if(length==0){
            throw new IndexOutOfBoundsException("List does not exist");
        }
        return (T) arr[length-1];
    }

    @Override
    public void remove(int index) {
        checkup(index);
        int numberMoved= length - index - 1;
        if (numberMoved > 0) {
            System.arraycopy(arr, index + 1, arr, index, numberMoved);
        }
        arr[--length] = null;
    }

    @Override
    public void removeFirst() {
        remove(0);
    }

    @Override
    public void removeLast() {
        remove(length-1);
    }

    @Override
    public void sort() { // sorting by descending
        for(int i=0; i<length;i++){
            for(int j= 0; j<length-i-1;j++){
                if(((Comparable)arr[j]).compareTo(arr[j+1]) > 0){
                    Object temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    @Override
    public int index0f(Object object) {
        for(int i=0;i<length;i++){
            if(arr[i].equals(object)){
                return i;
            }
        }
    }

    @Override
    public int lastIndex0f(Object object) {
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
    public Iterator iterator() {
        return null;
    }
}
