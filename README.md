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
3. ApplicatonContext가 제공하는 부가기능
   - 메시지소스를 활용한 국제화 기능
   - 환경변수
   - 애플리케이션 이벤트
   - 편리한 리소스 조회
     
#### 4-7 다양한 설정 형식 지원 - 자바 코드, XML
##### 스프링 컨테이너는 다양한 형식읜 설정 정보를 받아들일 수 있게 유연하게 설계되어 있다.
- 자바 코드, XML, Groovy 등등

##### 애노테이션 기반 자바 코드 설정 사용
- new AnnotationConfigApplicationContext(AppConfig.class)
- AnnotationConfigApplicationContext

