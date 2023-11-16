package com.board.back.domain.board.comment;

import java.time.LocalDateTime;

public class Comment {
    private Long commentId;
    private Long memberId;
    private String detail;
    private LocalDateTime creatAt;
    private LocalDateTime modifiedAt;

    public Comment(Long commentId, Long memberId, String detail, LocalDateTime creatAt, LocalDateTime modifiedAt) {
        this.commentId = commentId;
        this.memberId = memberId;
        this.detail = detail;
        this.creatAt = creatAt;
        this.modifiedAt = modifiedAt;
    }

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
