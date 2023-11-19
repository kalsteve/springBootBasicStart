package com.board.back.repository.post;

import com.board.back.domain.member.Member;
import com.board.back.domain.post.Post;
import com.board.back.domain.post.comment.Comment;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class MemoryPostRepository implements PostRepository {
    //동시성 문제로 인한 CurrentMap
    private static ConcurrentMap<Long, Post> store = new ConcurrentHashMap<>();
    private static Long sequence = 0L;
    @Override
    public synchronized Post save(Post post) {
        post.setPostId(++sequence);
        store.put(post.getPostId(), post);
        return post;
    }

    @Override
    public synchronized void delete(Post post) {
        store.remove(post.getPostId());
    }

    @Override
    public synchronized Long count() {
        return sequence;
    }

    @Override
    public synchronized Optional<Post> findByPostId(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Post> findByMemberId(Long memberId) {
        return store.values().stream()
                .filter(post -> post.getMemberId().equals(memberId))
                .collect(Collectors.toList());
    }

    @Override
    public List<Post> findByTitle(String title) {
        return store.values().stream()
                .filter(post -> post.getTitle().contains(title))
                .collect(Collectors.toList());

    }

    @Override
    public List<Post> findByCreationDate(Date creationDate) {
        return store.values().stream()
                .filter(post -> post.getCreationDate().equals(creationDate))
                .collect(Collectors.toList());
    }


    @Override
    public synchronized List<Post> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public void deleteByMemberId(Long memberId) {
        store.values().removeIf(post -> post.getMemberId().equals(memberId));
    }

    @Override
    public void deleteByPostId(Long postId) {
        store.values().removeIf(post -> post.getPostId().equals(postId));
    }

    @Override
    public void clear() {
        store.clear();
    }

    @Override
    public void update(Post post) {
        store.put(post.getPostId(), post);
    }
}
