# 스프링 핵심 원리 - 기본편

### 세션4 : 스프링 컨테이너와 스프링 빈
#### 4-6 BeanFactory와 ApplicationContext
1. BeanFactory
   - 스프링 컨테이너의 최상위 인터페이스다.
   - 스프링 빈을 관리하고 조회하는 역할을 담당한다.
   - getBean() 을 제공한다.
   - 지금까지 우리가 사용했던 대부분의 기능은 BeanFactory가 제공하는 기능이다.
2. ApplicationContext
   - BeanFactory 기능을 모두 상속받아서 제공한다.
   - 빈을 관리하고 검색하는 기능을 BeanFactory가 제공해주는데, 그러면 둘 차이가 무엇일까?
   - 애플리케이션을 개발할 때는 빈을 관리하고 조회하는 기능은 물론이고, 수많은 부가기능이 필요하다.
   
