# 자바로 배우는 자료구조 [Chapter2]

### 선형 자료구조 (연결 리스트 & 배열)

**1-1. 연결 리스트**

- 순차적인 데이터나 많은 양의 데이터를 정리하는 자료구조
- 배열과 마찬가지로 순서대로 여러 데이터를 저장할 때 사용하지만, 연결 리스트는 항상 맞는 크기로 만들어지도록 설계되어 있다.

<br/>



**1-2. 노드와 크기**

- **[생각해보기]** next가 내부 클래스에 있지 않으면 어떤 문제가 발생할까요?
- 외부에서 next에 접근해 값을 바꿀 수 있게 되고 다음 노드의 정보를 잃게 된다.

<br/>



**1-3. 경계 조건 (Boundary Condition)**

- Empty data structure - 자료 구조가 비어있는 경우
- Single element in the data structure - 자료 구조에 단 하나의 요소가 들어있는 경우

- Adding / removing beginning of data structure - 자료 구조의 첫 번째 요소를 추가하거나 제거하는 경우
- Adding / removing end of the data structure - 자료 구조의 마지막 요소를 추가하거나 제거하는 경우
- Working in the middle - 자료 구조의 중간 부분을 처리할 때 (가장 흔함)

- **[생각해보기]** 자료 구조의 첫 번째 요소를 제거하거나 추가할 때 어떤 포인터를 고려해야 하나요?
  - 추가할 때는 추가된 첫 번째 요소가 두 번째 요소를 가리키게 한 뒤, head가 첫 번째 노드를 가리킬 수 있게 설정해야 한다.
  - 제거 시에는 head가 두 번째 노드를 가리킬 수 있도록 바꿔줘야 한다.

<br/>



**1.4 addFirst 메소드**

- 추가된 요소가 기존 첫 번째 노드를 가리키게 한 뒤,  head가 추가된 노드를 가리키도록 작업한다.

- **[생각해보기]** head가 비어있는 경우, 즉 head가 null을 가리키는 경우에 addFirst 메소드를 사용하면 node.next, head가 어떻게 달라지나요?
  - node.next는 head가 가리키는 null을 가리키게 되고, head는 추가된 노드를 가리키게 된다. 맨 앞에 데이터를 추가할 때는 데이터가 비어있어도 문제 없다.

<br/>



**1.5 addLast 메소드**

- 연결리스트의 마지막을 가리키는 임시 포인터를 사용한다.

- **[생각해보기]** 왜 currentSize 변수 대신 tail 포인터를 사용하나요?
  - head부터 접근하면 요소 하나하나 접근해 시간복잡도가 O(n)이 되지만, tail 포인터를 사용하면 마지막 요소를 가리키고 있는 tail에 새로운 요소를 바로 연결할 수 있기 때문에 시간복잡도를 O(1)로 줄일 수 있다.

<br/>
