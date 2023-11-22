package com.board.back.service.comment;

import com.board.back.domain.post.comment.Comment;

import java.util.List;
import java.util.Optional;

/**
 * 댓글 서비스 인터페이스
 */

public interface CommentService {

    /**
     * 댓글 작성
     * @param comment
     */
    void create(Comment comment);

    /**
     * 댓글 수정
     * @param comment
     */
    void update(Comment comment);

    /**
     * 댓글 삭제
     * @param comment
     */
    void delete(Comment comment);

    /**
     * 회원 번호로 댓글 조회
     * @param memberId
     * @return List<Comment> commentList
     */
    List<Comment> findByMemberId(Long memberId);

    /**
     * 게시판 번호로 댓글 조회
     * @param postId
     * @return List<Comment> commentList
     */
    List<Comment> findByPostId(Long postId);

    /**
     * 댓글 번호로 댓글 조회
     * @param commentId
     * @return Optional<Comment> comment
     */
    Optional<Comment> findByCommentId(Long commentId);
}
