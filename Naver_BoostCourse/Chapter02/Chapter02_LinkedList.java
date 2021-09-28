public class LinkedList<E> implements ListI<E> {
    //노드 정의
    class Node<E> {
        E data;
        Node<E> next;

        public Node(E obj) {
            data = obj;
            next = null;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    /**
     * 사이즈 변수를 선언하여 추가, 삭제 시마다 데이터를 넣어주면
     * 리스트의 사이즈를 구할 때의 시간복잡도가 O(n)에서 O(1)으로 바뀐다.
     */
    private int currentSize; 

    public LinkedList() {
        head = null;
        tail = null;
        currentSize = null;
    }

    public void addFirst(E obj) {
        Node<E> node = new Node<E>(obj);
        if (head == null) {
            tail = node;
        }

        node.next = head;
        head = node;        
        currentSize++;
    }

    // 시간복잡도 : O(1)
    // tail 포인터를 사용하기 때문
    public void addLast<E obj) {
        Node<E> node = new Node<E>(obj);
        if (head == null) {
            head = node;
            tail = node;
            currentSize++;
            return;
        }

        tail.next = node;   //tail의 next는 마지막 값이 되고
        tail = node;        //tail은 새로운 Node를 가리키게 된다.
        currentSize++;
        return
    }

    /**
     * RemoveFirst / RemoveLast
     */
    public E removeFirst() {
        if (head == null) {
            return null;
        }
        E tmp = head.data;

        if (head == tail) {   //요소가 하나만 있을 때
            head = null;
            tail = null;
        } else {
            head = head.next;
        }

        currentSize--;
        return tmp;
    }

    public E removeLast() {
        if (head == null) 
            return null;
        if (head == tail)
            return removeFirst();

        Node<E> current = head;
        Node<E> previous = null;
        while (current != tail) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        tail = previous;
        
        currentSize--;
        return current.data;
    }

    /**
     * Remove 와 Find
     */
    public E remove(E obj) {
        Node<E> current = head;
        Node<E> previous = null;
        while (current != null) {
            if (((Comparable<E>) obj).compareTo(current.data) == 0) {
                if (current == head) 
                    return removeFirst();
                if (current == tail)
                    return removeLast();

                currentSize--;
                previous.next = current.next;
                return current.data;
            }
            previous = current;
            current = current.next;
        }
        return null;
    }

    public boolean contains(E obj) {
        Node<E> current = head;
        while (current != null) {
            if (((Comparable<E)obj).compareTo(current.data) == 0) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Peek 메소드
     */
    public E peekFirst() {
        if (head == null)
            return null;
        return head.data;
    }
 
    public E peekLast() {
        if (tail == null)
            return null;
        return tail.data; 
    }


    /**
     * Interator infterface
     */
    class IteratorHelper implements Interator<E> {
        Node<E> index;
        public IteratorHelper() {
            index = head;
        }

        public boolean hasNext() {
            return (index != null);
        }

        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException;
            }
                

            E val = index.data;
            index = index.next;
            return val;
        }
    }
}  