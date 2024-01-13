package hello.springbasic;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.springbasic.member", // 패키지 경로 설정 지정을 안하면 모든 자바 경로 파일들을 다 찾는다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) // Configuration.class 어노테이션이 붙은 애는 뺄거다. 기존 예제 코드 때문
)
public class AutoAppConfig {


}
