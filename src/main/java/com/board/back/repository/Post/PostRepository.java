package com.board.back.repository.Post;

import com.board.back.domain.Post.Post;
import com.board.back.domain.Post.comment.Comment;

import java.util.List;
import java.util.Optional;

/**
 * 게시글 레포지토리 인터페이스
 */

public interface PostRepository {
    Post save(Post post);
    void delete(Post post);
    Long count();


    Optional<Comment> findById(Long id);
    Optional<Comment> findByName(String name);
    Optional<Comment> findByEmail(String email);
    List<Comment> findAll();

    void deleteById(Long id);
}
