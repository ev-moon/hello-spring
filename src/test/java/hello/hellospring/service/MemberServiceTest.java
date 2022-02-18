package hello.hellospring.service;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MemberServiceTest {

    MemberService memberService = new MemberService();

    @Test
    void join() {
        //given
        Member member = new Member();
        member.setName("hello");
        //when
        Long saveId = memberService.join(member);
        //then
        assertThat(memberService.findOne(saveId).get()).isEqualTo(member);
    }

    @Test
    public void 중복_회원_예외() {

    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}
