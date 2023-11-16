package com.board.back.domain.Post;

import java.time.LocalDateTime;

public class Post {
    private Long memberId;
    private Long boardId;
    private String title;
    private String view;
    private LocalDateTime creatAt;
    private LocalDateTime modifiedAt;

    public Post(Long memberId, Long boardId, String title, String view, LocalDateTime creatAt, LocalDateTime modifiedAt) {
        this.memberId = memberId;
        this.boardId = boardId;
        this.title = title;
        this.view = view;
        this.creatAt = creatAt;
        this.modifiedAt = modifiedAt;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
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

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }
}
