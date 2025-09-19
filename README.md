# <MyLinkedList & 자료구조 구현 과제>
: 이 프로젝트는 자바를 사용하여 단일 연결 리스트(MyLinkedList)를 직접 구현하고, 
이를 활용해 스택(MyStack)과 큐(MyQueue) 자료구조를 구현한 결과물입니다.



# <주요 기능>
MyLinkedList.java

1.제네릭(Generic)을 사용하여 어떤 타입의 데이터도 저장할 수 있습니다.
2.addLast(): 리스트의 마지막에 데이터를 추가합니다.
3.addFirst(): 리스트의 맨 앞에 데이터를 추가합니다.
4.removeAt(): 특정 인덱스의 데이터를 삭제합니다.
5.get(): 특정 인덱스의 데이터를 반환합니다.
6.Iterator 인터페이스를 구현하여 for-each 반복문으로 리스트를 순회할 수 있습니다.


# <실행결과>
```java
=== MyLinkedList 테스트 ===
리스트 크기: 3
2번째 값: 20
삭제 후 리스트 크기: 2
리스트 요소: 10 30
---
=== MyStack 테스트 ===
스택 크기: 3
스택 pop: C
스택 pop: B
스택 크기: 1
---
=== MyQueue 테스트 ===
큐 크기: 3
큐 dequeue: X
큐 dequeue: Y
큐 크기: 1
---
=== 예외 처리 테스트 ===
스택 예외 발생: 리스트가 비었습니다.
큐 예외 발생: 리스트가 비었습니다.
```


# <MyStack.java>
: MyLinkedList를 활용하여 LIFO(Last-In, First-Out) 원리를 따르는 스택을 구현했습니다.

# <MyQueue.java>
: MyLinkedList를 활용하여 FIFO(First-In, First-Out) 원리를 따르는 큐를 구현했습니다.


# <실행 방법>
Main.java 파일을 실행하면 MyLinkedList, MyStack, MyQueue의 기능 테스트 결과를 확인할 수 있습니다.

>(Bash)
javac -d bin src/Main.java src/MyLinkedList.java src/MyStack.java src/MyQueue.java
java -cp bin Main


