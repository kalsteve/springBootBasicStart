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
        validateDuplicateMember(member);
        memberRepository.save(member);
    }

    @Override
    public List<Member> findMembers(Long memberId) {
        return memberRepository.findAll();
    }

    @Override
    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }

    @Override
    public void updateMember(Member member) {
        memberRepository.update(member);
    }

    @Override
    public void deleteMember(Member member) {
        memberRepository.delete(member);
    }

    /**
     * 회원 중복 방지
     * @param member
     */
    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getNickname())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }


}
