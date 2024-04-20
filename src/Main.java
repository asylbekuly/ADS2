public class Main {
    public static void main(String[] args) {

        // MyArrayList<Integer> myList = new MyArrayList<>();
//        MyLinkedList<Integer> myList = new MyLinkedList<>();
//
//        myList.add(5);
//        myList.add(10);
//        myList.add(8);
//        printArray(myList);
//
//        myList.set(1, 20);
//        printArray(myList);
//        myList.add(1, 10);
//        printArray(myList);
//
//        myList.addFirst(0);
//        printArray(myList);
//
//        myList.addLast(4);
//        printArray(myList);
//
//
//        System.out.println(myList.get(2));
//
//
//        System.out.println(myList.getFirst());
//        System.out.println(myList.getLast());
//        myList.remove(2);
//        printArray(myList);
//        myList.removeFirst();
//        printArray(myList);
//        myList.removeLast();
//        printArray(myList);
//        myList.sort();
//        printArray(myList);
//
//
//        System.out.println(myList.indexOf(20));
//
//        System.out.println(myList.lastIndexOf(20));
//
//        System.out.println(myList.exists(20));
//        myList.clear();
//        printArray(myList);
//
//        System.out.println(myList.size());
//        MyStack<Integer> stack = new MyStack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        System.out.println("Stack size: " + stack.size());
//        System.out.println("Top element: " + stack.top());
//
//        while (!stack.ISEmpty()) {
//            System.out.println("Popped element: " + stack.pop());
//        }
//
//        System.out.println("Stack is empty: " + stack.ISEmpty());

        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("Hello");
        queue.enqueue("World");

        System.out.println("Queue size: " + queue.size());
        System.out.println("Front element: " + queue.front());
        System.out.println("Back element: " + queue.back());

        while (!queue.isEmpty()) {
            System.out.println("Dequeued element: " + queue.dequeue());
        }

        System.out.println("Queue is empty: " + queue.isEmpty());
        MyHeap<Integer> heap = new MyHeap<>();

        heap.insert(10);
        heap.insert(20);
        heap.insert(15);
        heap.insert(30);

        System.out.println("Max element: " + heap.getMax());

        System.out.println("Extracted max element: " + heap.extractMax());

        System.out.println("Heap size: " + heap.size());

        System.out.println("Heap elements after extraction:");
        heap.traverse(0);
    }



//    public static void printArray(Iterable<Integer> arr) {
//        for (Object object : arr) {
//            System.out.print(object + " ");
//        }
//        System.out.println();
//    }
}