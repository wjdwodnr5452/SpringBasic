package hello.springbasic;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 롬복에서 자동으로 getter, setter 을 자동으로 추가 해준다.
@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {

        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("LombokName");

        String name = helloLombok.getName();
        System.out.println("helloLombok = " + helloLombok);
    }

}
