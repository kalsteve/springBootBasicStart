package com.board.back.service.member;

import com.board.back.domain.member.Member;
import com.board.back.repository.member.MemberRepository;

import java.util.List;
import java.util.Optional;

/**
 * 회원과 관련된 서비스를 제공하는 구현체
 */
public class MemberServiceImp implements MemberService{
    private final MemberRepository memberRepository;

    //생성자 주입
    public MemberServiceImp(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public List<Member> findMembers(Long memberId) {
        return null;
    }

    @Override
    public Optional<Member> findOne(Long memberId) {
        return Optional.empty();
    }

    @Override
    public void updateMember(Member member) {

    }

    @Override
    public void deleteMember(Member member) {

    }




}
