public interface MyList <T> extends Iterable <T>{
    void add();

    void add(T item);

    void set (int index, T item);
    void add(int index,T item);
    void addFirst(T item);
    void addLast (T item);
    T get (int index);
    T getFirst();
    T getLast();
    void remove (int index);
    void removeFirst();
    void removeLast ();
    void sort();
    int index0f(Object obiect);
    int lastIndex0f (Object object);
    boolean exists (Object object);
    public Object[] toArray() ;
    void clear ();
    int size();
}
