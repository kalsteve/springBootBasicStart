package com.board.back.repository.memberRepository;

import com.board.back.domain.member.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    boolean save(Member member);
    boolean delete(Member member);
    long count();
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    Optional<Member> findByEmail(String email);
    List<Member> findAll();
}
