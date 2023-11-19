package com.board.back.repository.member;

import com.board.back.domain.member.Member;

import java.util.List;
import java.util.Optional;

/**
 * 회원을 저장하는 리파지토리
 * @version 0.1 - begin
 * */

public interface MemberRepository {
    //엔티티가 병합될시에 병합된 사실을 모른다면 문제가 발생하므로 인터페이스를 설정함

    /**
     * 회원 저장
     * @param member
     * @return Member
     */
    Member save(Member member);
    /**
     * 회원 삭제
     * @param member
     */
    void delete(Member member);
    /**
     * 회원 번호
     * @return Long
     */
    Long count();

    /**
     * 회원 번호로 회원 찾기
     * @param id
     * @return Optional<Member>
     */
    Optional<Member> findById(Long id);

    /**
     * 회원 이름으로 회원 찾기
     * @param name
     * @return Optional<Member>
     */
    Optional<Member> findByName(String name);

    /**
     * 회원 이메일로 회원 찾기
     * @param email
     * @return Optional<Member>
     */
    Optional<Member> findByEmail(String email);

    /**
     * 회원 전체 찾기
     * @return List<Member>
     */
    List<Member> findAll();

    /**
     * 회원 수정
     * @param member
     */
    void update(Member member);
}
