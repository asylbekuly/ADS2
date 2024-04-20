public class MyHeap<T extends Comparable<T>> {
    MyArrayList<T> heap = new MyArrayList<>();
    public MyHeap(){

    }
    public void empty(){
        heap.clear();
    }
    public int size(){
        return heap.size();
    }
    public T getMax(){
        return heap.get(0);
    }
    public T extractMax() { // gets max and swaps with last element then removes last element
        T max = heap.get(0);
        swap(0, heap.size() - 1);
        heap.remove(heap.size() - 1);
        heapify(0);
        return max;
    }
    public void insert(T item){
        heap.add(item);
        int i = heap.size()-1;
        heapify(i);
    }

}
