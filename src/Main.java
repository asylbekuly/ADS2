public class Main { // главный класс для программы
    public static void main(String[] args) { // основной метод запуска программы

        // Пример использования MyArrayList
        // Создание нового экземпляра MyArrayList и добавление элементов
        // MyArrayList<Integer> myList = new MyArrayList<>();
//        MyLinkedList<Integer> myList = new MyLinkedList<>();
//
//        myList.add(5); // добавление элемента
//        myList.add(10);
//        myList.add(8);
//        printArray(myList); // вызов метода для вывода содержимого списка
//
//        myList.set(1, 20); // установка элемента по индексу
//        printArray(myList);
//        myList.add(1, 10); // вставка элемента по индексу
//        printArray(myList);
//
//        myList.addFirst(0); // добавление элемента в начало
//        printArray(myList);
//
//        myList.addLast(4); // добавление элемента в конец
//        printArray(myList);
//
//        // Получение элементов по индексу, первому и последнему элементам
//        System.out.println(myList.get(2));
//        System.out.println(myList.getFirst());
//        System.out.println(myList.getLast());
//
//        // Удаление элемента по индексу, первого и последнего
//        myList.remove(2);
//        printArray(myList);
//        myList.removeFirst();
//        printArray(myList);
//        myList.removeLast();
//        printArray(myList);
//
//        // Сортировка списка и вывод содержимого
//        myList.sort();
//        printArray(myList);
//
//        // Поиск индекса, проверки наличия элементов
//        System.out.println(myList.indexOf(20));
//        System.out.println(myList.lastIndexOf(20));
//        System.out.println(myList.exists(20));
//
//        // Очистка списка
//        myList.clear();
//        printArray(myList);
//
//        // Вывод размера списка
//        System.out.println(myList.size());

        // Пример использования MyStack
//        MyStack<Integer> stack = new MyStack<>();
//        stack.push(1); // добавление элемента в стек
//        stack.push(2);
//        stack.push(3);
//
//        System.out.println("Stack size: " + stack.size()); // вывод размера стека
//        System.out.println("Top element: " + stack.top()); // получение верхнего элемента стека
//
//        while (!stack.ISEmpty()) { // извлечение элементов из стека
//            System.out.println("Popped element: " + stack.pop());
//        }
//
//        System.out.println("Stack is empty: " + stack.ISEmpty()); // проверка, пуст ли стек

        // Пример использования MyQueue
        MyQueue<String> queue = new MyQueue<>(); // создание очереди
        queue.enqueue("Hello"); // добавление элементов в очередь
        queue.enqueue("World");

        System.out.println("Queue size: " + queue.size()); // вывод размера очереди
        System.out.println("Front element: " + queue.front()); // получение первого элемента
        System.out.println("Back element: " + queue.back()); // получение последнего элемента

        // Извлечение элементов из очереди, пока она не станет пустой
        while (!queue.isEmpty()) {
            System.out.println("Dequeued element: " + queue.dequeue());
        }

        System.out.println("Queue is empty: " + queue.isEmpty()); // проверка, пуст ли очередь

        // Пример использования MyHeap
        MyHeap<Integer> heap = new MyHeap<>(); // создание кучи

        // Вставка элементов в кучу
        heap.insert(10);
        heap.insert(20);
        heap.insert(15);
        heap.insert(30);

        // Получение максимального элемента в куче
        System.out.println("Max element: " + heap.getMax());

        // Извлечение максимального элемента из кучи
        System.out.println("Extracted max element: " + heap.extractMax());

        // Размер кучи после извлечения
        System.out.println("Heap size: " + heap.size());

        // Вывод элементов кучи
        System.out.println("Heap elements after extraction:");
        heap.traverse(0); // обход кучи с корня

    }

    // Вспомогательный метод для вывода содержимого списка
//    public static void printArray(Iterable<Integer> arr) {
//        for (Object object : arr) {
//            System.out.print(object + " ");
//        }
//        System.out.println();
//    }
}
