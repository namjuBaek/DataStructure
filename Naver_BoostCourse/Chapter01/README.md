# 자바로 배우는 자료구조 [Chapter01]

**1-4. 빅 오 표기법 예시**

- **[생각해보기]** 문제 1에서 n = 1을 대입하면 어떻게 되나요? 적당히 큰 수를 대입해야 하는 이유는 무엇인가요?
  
  - 전자는 1, 후자 값은 0이 되므로 nlogn이 더 빠른 시간복잡도를 가지게 된다. 이런 문제를 방지하기 위해 무한에 가까운 큰 값을 넣어 가정해야 한다.
  

<br/>

**2-1. 객체지향 프로그래밍**

- **[생각해보기]** Person u = new Student(); 라 정의했을 때, 컴파일이 될까요?
  - 컴파일이 가능하다. Student에 해당하는 만큼 힙에 공간이 할당되기 때문에 Person 변수를 파악하고 메모리를 계산할 수 있다.
  

<br/>

**2-2. Comparable 인터페이스**

- **[생각해보기]** Comparable 인터페이스의 T는 무엇을 의미할까요?
  - Generic은 클래스 내부에서 지정하는 것이 아닌 사용자에 의해 지정되는 것을 말한다. 필요에 의해 지정할 수 있도록 하는 일반 (Generic)타입이라는 것이다. 정확하게는 타입의 경계를 지정하고, 컴파일 때 해당 타입으로 캐스팅.
  - Generic 다시 정리하기
  

<br/>

**2-3. 제너릭 프로그래밍 소개**

- **[생각해보기]** 제너릭 프로그래밍의 장점은 무엇인가요?
  - 1가지의 코드로 서로 다른 자료형에 대해서 재사용할 수 있도록 함.
  

<br/>

**2-4. 매개변수화 타입**

- **[생각해보기]** 매개변수화 타입과 객체를 사용하는 방식의 차이점은 무엇인가요?
  - 매개변수화 타입은 컴파일 시 구체적인 타입이 결정되고, 객체는 정해진 타입을 받아 사용한다.
  

<br/>

**2-5. Autoboxing**

- **[생각해보기]** 래퍼 클래스는 기본 자료형과 어떤 점이 다른가요?
  - 기본 자료형은 JVM이 정확하게 필요한 만큼의 메모리만 할당하며, 래퍼 클래스는 객체 버전의 기본 자료형으로 객체를 가리키는 4바이트 포인터를 설정한다. 이때 이 포인터는 객체에 필요한 만큼 차지한 힙 공간을 가리킨다.

<br/>

**2-6. 예외**

- **[생각해보기]** 예외 상황의 이름을 적절하게 설정하는 게 프로그래밍하는 데에 어떤 도움을 줄까요?
  - 디버깅 시 어떤 에러가 발생했는지 빠르게 파악할 수 있다.
