package com.board.back.service.comment;

import com.board.back.domain.post.comment.Comment;

/**
 * 댓글 서비스 인터페이스
 * @param comment
 */

public interface CommentService {

    /**
     * 댓글 작성
     * @param comment, member
     */
    void writeComment(Comment comment);

    /**
     * 댓글 수정
     * @param comment
     */
    void updateComment(Comment comment);

    /**
     * 댓글 삭제
     * @param comment
     */
    void deleteComment(Comment comment);

    /**
     * 댓글 조회
     * @param comment
     */
    void readComment(Comment comment);

    /**
     * 댓글 목록 조회
     * @param comment
     */
    void readCommentList(Comment comment);
}
