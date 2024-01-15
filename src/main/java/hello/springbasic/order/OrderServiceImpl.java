package hello.springbasic.order;

import hello.springbasic.discount.DiscountPolicy;
import hello.springbasic.member.Member;
import hello.springbasic.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    /**
     * 필드주입
     * 코드가 간결해서 많은 개발자들을 유혹하지만 외부에서 변경이 불가능해서 테스트 하기 힘들다는 치명적인 단점이 있다
     *
     * DI 프레임워크가 없으면 아무것도 할 수 없다.
     * 사용하지 말자!
     * 애플리케이션의 실제 코드와 관계 없는 테스트 코드
     * 스프링 설정을 목적으로 하는 @Configuration 같은 곳에서만 특별한 용도로 사용
     *
     */
/*    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private DiscountPolicy discountPolicy;*/

/*    public void setMemberRepository(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void setDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }*/

    /**
     *
     * 수정자 주입
        선택, 변경 가능성이 있는 의존관계에 사용
        자바빈 프로퍼티 규약의 수정자 메서드 방식을 사용하는 방법
     */
/*    @Autowired
    public void setMemberRepository(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    @Autowired
    public void setDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }*/

    /**
     *
     * 생성자 주입
     * 생성자 호출시점에 딱 1번만 호출되는 것이 보장된다.
     * 불변, 필수 의존관계에 사용
     */
    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
