package com.board.back.repository.member;

import com.board.back.domain.member.Member;
import com.board.back.domain.post.Post;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MemoryMemberRepository implements MemberRepository {
    private final static ConcurrentMap<Long, Member> store = new ConcurrentHashMap<>();
    private static Long sequence = 0L;

    @Override
    public synchronized Member save(Member member) {
        member.setMemberId(++sequence);
        store.put(member.getMemberId(), member);
        return member;
    }

    @Override
    public synchronized void delete(Member member) {
        store.remove(member.getMemberId());
    }

    @Override
    public synchronized Long count() {
        return sequence;
    }

    @Override
    public synchronized Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public synchronized Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getNickname().equals(name))
                .findFirst();
    }

    @Override
    public synchronized Optional<Member> findByEmail(String email) {
        return store.values().stream()
                .filter(member -> member.getEmail().equals(email))
                .findFirst();
    }

    @Override
    public synchronized List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public void update(Member member) {
        store.put(member.getMemberId(), member);
    }

}
