package com.board.back.service.Post;

import com.board.back.domain.member.Member;
import com.board.back.domain.post.Post;

import java.util.List;
import java.util.Optional;

/**
 * 게시글 서비스 역할
 * @param
 */

public interface PostService {
    /**
     * 게시글 등록
     * @param post
     */
    void create(Post post);

    /**
     * 게시글 번호로 조회
     * @param postId
     * @return Post post
     */
    Optional<Post> searchById(Long postId);

    /**
     * 게시글 목록 조회
     * @param memberId
     * @return List<Post> postList
     */
    List<Post> searchByMemberId(Long memberId);

    /**
     * 게시글 제목으로 조회
     * @param title
     * @return List<Post> postList
     */
    List<Post> searchByTitle(String title);

    /**
     * 게시글 수정
     * @param post
     */
    void update(Post post);

    /**
     * 게시글 삭제
     * @param post
     */
    void delete(Post post);

    /**
     * 게시글 번호로 게시글 삭제
     * @param postId
     */
    void deleteById(Long postId);

    /**
     * 회원 번호로 게시글 삭제
     * @param memberId
     */
    void deleteByMemberId(Long memberId);




}
