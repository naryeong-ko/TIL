package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    /*
    // 필드 주입(단점 : 방식 수정 불가)
    @Autowired private final MemberService memberService;

    // 세터 주입(단점 : 누군가가 수정할 수 있음)
    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }
    */

    // 생성자 주입(의존관계가 실행 중에 동적으로 변하는 경우는 거의 없으므로 이 방식 권장)
    @Autowired // 스프링 컨테이너에서 꺼내 넣기 때문에 불필요한 추가 생성 방지
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

}
