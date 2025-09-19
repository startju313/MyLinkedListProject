import java.util.NoSuchElementException;


public class MyStack<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    /**
     * 스택의 맨 위에 데이터를 추가
     * @param data 추가할 데이터
     */
    public void push(T data) {
        list.addFirst(data); // O(1)
    }

    /**
     * 스택의 맨 위 데이터를 제거하고 반환
     * @return 제거된 데이터
     */
    public T pop() {
        return list.removeFirst(); // O(1)
    }

    /**
     * 스택의 맨 위 데이터를 반환(삭제하지 않음)
     * @return 맨 위 데이터
     */
    public T peek() {
        if (list.size() == 0) {
            throw new NoSuchElementException("스택이 비었습니다.");
        }
        return list.get(0);
    }
    
    /**
     * 스택의 현재 크기를 반환
     */
    public int size() {
        return list.size();
    }

    /**
     * 스택이 비어있는지 확인
     */
    public boolean isEmpty() {
        return list.size() == 0;
    }
}