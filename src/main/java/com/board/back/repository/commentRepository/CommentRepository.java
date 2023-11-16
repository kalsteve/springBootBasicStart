package com.board.back.repository.commentRepository;

import com.board.back.domain.board.comment.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentRepository {
    String save(Comment comment);
    String login(Comment comment);
    Optional<Comment> findById(Long id);
    Optional<Comment> findByName(String name);
    Optional<Comment> findByEmail(String email);
    List<Comment> findAll();
}
