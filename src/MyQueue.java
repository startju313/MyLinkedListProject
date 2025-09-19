import java.util.NoSuchElementException;

public class MyQueue<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    /**
     * 큐의 마지막에 데이터를 추가
     * @param data 추가할 데이터
     */
    public void enqueue(T data) {
        list.addLast(data); // O(1)
    }

    /**
     * 큐의 맨 앞 데이터를 제거하고 반환
     * @return 제거된 데이터
     */
    public T dequeue() {
        return list.removeFirst(); // O(1)
    }

    /**
     * 큐의 맨 앞 데이터를 반환(삭제하지 않음).
     * @return 맨 앞 데이터
     */
    public T peek() {
        if (list.size() == 0) {
            throw new NoSuchElementException("큐가 비었습니다.");
        }
        return list.get(0);
    }

    /**
     * 큐의 현재 크기를 반환
     */
    public int size() {
        return list.size();
    }
    
    /**
     * 큐가 비어있는지 확인
     */
    public boolean isEmpty() {
        return list.size() == 0;
    }
}