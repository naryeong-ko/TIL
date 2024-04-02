package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired // 스프링 컨테이너에서 꺼내 넣기 때문에 불필요한 추가 생성 방지
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


}
