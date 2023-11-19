package com.board.back.service.Post;

import com.board.back.domain.post.Post;

/**
 * 게시글 서비스 역할
 * @param
 */

public interface PostService {
    /**
     * 게시글 생성
     * @param post
     */
    void writePost(Post post);

    /**
     * 게시글 조회
     * @param post
     */
    void readPost(Post post);

    /**
     * 게시글 수정
     * @param post
     */
    void updatePost(Post post);

    /**
     * 게시글 삭제
     * @param post
     */
    void deletePost(Post post);



}
