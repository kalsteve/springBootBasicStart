package com.board.back.domain.Post.comment;

import java.time.LocalDateTime;

/**
 * 댓글 객체
 */

public class Comment {
    private Long commentId;
    private Long memberId;
    private String detail;
    private LocalDateTime creatAt;
    private LocalDateTime modifiedAt;

    /**
     * 생성자 주입
     * @param commentId
     * @param memberId
     * @param detail
     * @param creatAt
     * @param modifiedAt
     */
    public Comment(Long commentId, Long memberId, String detail, LocalDateTime creatAt, LocalDateTime modifiedAt) {
        this.commentId = commentId;
        this.memberId = memberId;
        this.detail = detail;
        this.creatAt = creatAt;
        this.modifiedAt = modifiedAt;
    }

    /**
     * Getter & Setter, principle in java
     */

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public LocalDateTime getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(LocalDateTime creatAt) {
        this.creatAt = creatAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
