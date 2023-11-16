package com.board.back.repository.member;

import com.board.back.domain.member.Member;

import java.util.List;
import java.util.Optional;

/**
 * 회원을 저장하는 리파지토리
 * @version 0.1 - begin
 * */

public interface MemberRepository {
    //엔티티가 병합될시에 병합된 사실을 모른다면 문제가 발생하므로
    Member save(Member member);
    void delete(Member member);
    Long count();


    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    Optional<Member> findByEmail(String email);
    List<Member> findAll();

    void deleteById(Long id);
}
