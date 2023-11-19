package com.board.back.repository.comment;

import com.board.back.domain.post.comment.Comment;

import java.util.List;
import java.util.Optional;

/**
 * 게시글 레포지토리 인터페이스
 */

public interface CommentRepository {

    /**
     * 댓글 저장
     * @param comment
     * @return Comment
     */
    Comment save(Comment comment);

    /**
     * 댓글 삭제
     * @param comment
     */
    void delete(Comment comment);
    /**
     * 댓글 번호
     * @return Long
     */
    Long count();

    /**
     * 댓글 번호로 댓글 찾기
     * @param id
     * @return Optional<Comment>
     */
    Optional<Comment> findById(Long id);

    /**
     * 댓글 이름으로 댓글 찾기
     * @param name
     * @return Optional<Comment>
     */
    Optional<Comment> findByName(String name);

    /**
     * 댓글 이메일로 댓글 찾기
     * @param email
     * @return Optional<Comment>
     */
    Optional<Comment> findByEmail(String email);

    /**
     * 댓글 전체 찾기
     * @return List<Comment>
     */
    List<Comment> findAll();

    /**
     * 댓글 번호로 댓글 삭제
     * @param id
     */
    void deleteById(Long id);
}
