package com.board.back.service.comment;

import com.board.back.domain.post.comment.Comment;
import com.board.back.repository.comment.CommentRepository;
import com.board.back.repository.member.MemberRepository;
import com.board.back.repository.post.PostRepository;

import java.util.List;
import java.util.Optional;

public class CommentServiceImp implements CommentService {
    private final CommentRepository commentRepository;

    public CommentServiceImp(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public void create(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void update(Comment comment) {
        commentRepository.update(comment);
    }

    @Override
    public void delete(Comment comment) {
        commentRepository.delete(comment);
    }

    @Override
    public List<Comment> findByMemberId(Long memberId) {
        return commentRepository.findByMemberId(memberId);
    }

    @Override
    public List<Comment> findByPostId(Long postId) {
        return commentRepository.findByPostId(postId);
    }

    @Override
    public Optional<Comment> findByCommentId(Long commentId) {
        return commentRepository.findByCommentId(commentId);
    }
}
