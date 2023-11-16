package com.board.back.service.member;

import com.board.back.domain.member.Member;

import java.util.List;
import java.util.Optional;

public interface MemberService {

    /**
     * 회원 가입
     * @param member
     */
    void join(Member member);

    /**
     * 전체 회원 조회
     * @param memberId
     * @return List<Member>
     */
    List<Member> findMembers(Long memberId);

    /**
     * 한 회원 조회
     * @param memberId
     * @return Optional<Member>
     */
    Optional<Member> findOne(Long memberId);

    /**
     * 회원 정보 수정
     * @param member
     */
    void updateMember(Member member);

    /**
     * 회원 탈퇴
     * @param member
     */
    void deleteMember(Member member);

}
