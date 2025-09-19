import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        // === MyLinkedList 테스트 ===
        System.out.println("=== MyLinkedList 테스트 ===");
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        System.out.println("리스트 크기: " + list.size());
        System.out.println("2번째 값: " + list.get(1));
        
        list.removeAt(1);
        System.out.println("삭제 후 리스트 크기: " + list.size());

        System.out.print("리스트 요소: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println("\n---");

        // === MyStack 테스트 ===
        System.out.println("=== MyStack 테스트 ===");
        MyStack<String> stack = new MyStack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        
        System.out.println("스택 크기: " + stack.size());
        System.out.println("스택 pop: " + stack.pop());
        System.out.println("스택 pop: " + stack.pop());
        System.out.println("스택 크기: " + stack.size());
        System.out.println("---");

        // === MyQueue 테스트 ===
        System.out.println("=== MyQueue 테스트 ===");
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("X");
        queue.enqueue("Y");
        queue.enqueue("Z");

        System.out.println("큐 크기: " + queue.size());
        System.out.println("큐 dequeue: " + queue.dequeue());
        System.out.println("큐 dequeue: " + queue.dequeue());
        System.out.println("큐 크기: " + queue.size());
        System.out.println("---");

        // === 예외 처리 테스트 ===
        System.out.println("=== 예외 처리 테스트 ===");
        MyStack<Integer> emptyStack = new MyStack<>();
        try {
            emptyStack.pop();
        } catch (NoSuchElementException e) {
            System.out.println("스택 예외 발생: " + e.getMessage());
        }

        MyQueue<Integer> emptyQueue = new MyQueue<>();
        try {
            emptyQueue.dequeue();
        } catch (NoSuchElementException e) {
            System.out.println("큐 예외 발생: " + e.getMessage());
        }
    }
}