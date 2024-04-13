import java.util.Iterator;

public class MyArrayList<T> implements MyList<T>{
    private Object[] arr;
    private int length = 0;
    private static final int capacity = 10;
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

    @Override
    public void set(int index, Object item) {
        if(index< 0 || index>=length){
            throw new IndexOutOfBoundsException("Index: " + index + )
        }
    }

    @Override
    public void add(int index, Object item) {

    }

    @Override
    public void addFirst(Object item) {

    }

    @Override
    public void addLast(Object item) {

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
    public int index0f(Object obiect) {
        return 0;
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
