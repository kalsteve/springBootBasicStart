package com.board.back.repository.comment;

import com.board.back.domain.post.Post;
import com.board.back.domain.post.comment.Comment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class MemoryCommentRepository implements CommentRepository {
    private final static ConcurrentMap<Long, Comment> store = new ConcurrentHashMap<>();
    private static Long sequence = 0L;
    @Override
    public Comment save(Comment comment) {
        comment.setCommentId(++sequence);
        store.put(comment.getCommentId(), comment);
        return comment;
    }

    @Override
    public void delete(Comment comment) {
        store.remove(comment.getCommentId());
    }

    @Override
    public Long count() {
        return sequence;
    }

    @Override
    public Optional<Comment> findByCommentId(Long id) {
        return store.values().stream()
                .filter(comment -> comment.getCommentId().equals(id))
                .findFirst();
    }

    @Override
    public List<Comment> findByPostId(Long id) {
        return store.values().stream()
                .filter(comment -> comment.getPostId().equals(id))
                .collect(Collectors.toList());
    }

    @Override
    public List<Comment> findByMemberId(Long id) {
        return store.values().stream()
                .filter(comment -> comment.getMemberId().equals(id))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteByCommentId(Long commentId) {
        store.remove(commentId);
    }

    @Override
    public void deleteByPostId(Long postId) {
        store.values().removeIf(comment -> comment.getPostId().equals(postId));
    }

    @Override
    public void deleteByMemberId(Long memberId) {
        store.values().removeIf(comment -> comment.getMemberId().equals(memberId));
    }

    @Override
    public List<Comment> findAll() {
        return new ArrayList<>( store.values() );
    }

    @Override
    public void clear() {
        store.clear();
    }

    @Override
    public void update(Comment comment) {
        store.put(comment.getCommentId(), comment);
    }

}
