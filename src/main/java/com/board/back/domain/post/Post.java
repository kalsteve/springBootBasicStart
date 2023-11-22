package com.board.back.domain.post;

import java.time.LocalDateTime;
import java.util.Date;

public class Post {

    private Long postId;
    private Long memberId;
    private String title;
    private String content;
    private String author;
    private Date creationDate;
    private Date lastModifiedDate;
    private Long views;

    /**
     * 생성자 주입
     * @param postId
     * @param memberId
     * @param title
     * @param content
     * @param author
     * @param creationDate
     * @param lastModifiedDate
     * @param views
     */
    public Post(Long postId, Long memberId, String title, String content, String author, Date creationDate, Date lastModifiedDate, Long views) {
        this.postId = postId;
        this.memberId = memberId;
        this.title = title;
        this.content = content;
        this.author = author;
        this.creationDate = creationDate;
        this.lastModifiedDate = lastModifiedDate;
        this.views = views;
    }

    /**
     * Getter & Setter, principle in java
     */

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }
}
