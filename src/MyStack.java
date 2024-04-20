import java.util.NoSuchElementException;

// Реализация стека с использованием односвязного списка
public class MyStack<T> {
    // Используем MyLinkedList для хранения элементов стека
    private MyLinkedList<T> stack = new MyLinkedList<>();

    // Конструктор по умолчанию
    public MyStack() {
    }

    // Метод для получения верхнего элемента стека без удаления
    public T top() {
        if (ISEmpty()) { // Проверка на пустой стек
            throw new NoSuchElementException("Stack is empty");
        }
        return stack.getLast(); // Возвращает последний элемент
    }

    // Метод для извлечения и удаления верхнего элемента стека
    public T pop() {
        if (ISEmpty()) { // Проверка на пустой стек
            throw new NoSuchElementException("Stack is empty");
        }
        T item = stack.getLast(); // Получаем верхний элемент
        stack.removeLast(); // Удаляем его из стека
        return item; // Возвращаем извлеченный элемент
    }

    // Метод для добавления элемента в верхнюю часть стека
    public void push(T item) {
        stack.addLast(item); // Добавляем элемент в конец списка
    }

    // Метод для проверки, пуст ли стек
    public boolean ISEmpty() {
        return stack.size() == 0; // Если размер 0, значит стек пуст
    }

    // Метод для получения размера стека
    public int size() {
        return stack.size(); // Возвращает количество элементов в стеке
    }

    // Метод для очистки стека
    public void clear() {
        stack.clear(); // Удаляет все элементы из стека
    }
}
