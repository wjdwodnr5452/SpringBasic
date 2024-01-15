package hello.springbasic.order;

import hello.springbasic.AppConfig;
import hello.springbasic.discount.FixDiscountPolicy;
import hello.springbasic.member.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach // 테스트 실행전 실행
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder(){
        Long memberId = 1L;
        Member member = new Member(memberId, "meberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

/*    @Test
    void fieldInjectionTest(){ // 필드 주입시 문제
        OrderServiceImpl orderService = new OrderServiceImpl();
        orderService.createOrder(1L, "itemA", 10000);
        orderService.setMemberRepository(new MemoryMemberRepository());
        orderService.setDiscountPolicy(new FixDiscountPolicy());
    }*/

}
