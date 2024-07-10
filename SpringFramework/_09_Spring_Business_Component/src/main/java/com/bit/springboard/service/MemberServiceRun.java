package com.bit.springboard.service;

import com.bit.springboard.dto.MemberDto;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberServiceRun {
    public static void main(String[] args) {
        AbstractApplicationContext factory =
                new GenericXmlApplicationContext("root-context.xml");

        MemberService memberService = factory.getBean("memberServiceImpl", MemberService.class);

        MemberDto memberDto = new MemberDto();

        memberDto.setUsername("bitcamp");
        memberDto.setPassword("dkdlxl");
        memberDto.setNickname("비트캠프");
        memberDto.setEmail("bitcamp@bit.co.kr");
        memberDto.setTel("010-1111-1111");

        memberService.join(memberDto);

        memberDto.setUsername("bitcamp1");
        memberDto.setPassword("dkdlxl");
        memberDto.setNickname("비트캠프1");
        memberDto.setEmail("bitcamp@bit.co.kr");
        memberDto.setTel("010-1111-1111");

        memberService.join(memberDto);

        memberDto.setUsername("bitcamp2");
        memberDto.setPassword("dkdlxl");
        memberDto.setNickname("비트캠프2");
        memberDto.setEmail("bitcamp@bit.co.kr");
        memberDto.setTel("010-1111-1111");

        memberService.join(memberDto);

        factory.close();
    }
}
