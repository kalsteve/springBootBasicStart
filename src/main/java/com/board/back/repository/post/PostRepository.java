package com.board.back.repository.post;

import com.board.back.domain.post.Post;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * 게시글 레포지토리 인터페이스
 */
public interface PostRepository {
    /**
     * 게시글 저장
     * @param post
     * @return Post
     */
    Post save(Post post);

    /**
     * 게시글 삭제
     * @param post
     */
    void delete(Post post);

    /**
     * 게시글 번호
     * @return Long
     */
    Long count();

    /**
     * 게시글 번호로 게시글 찾기
     * @param postId
     * @return Optional<Post>
     */
    Optional<Post> findByPostId(Long postId);

    /**
     * 회원 번호로 게시글 찾기
     * @param memberId
     * @return Optional<Post>
     */
    List<Post> findByMemberId(Long memberId);

    /**
     * 게시글 제목으로 게시글 찾기
     * @param title
     * @return List<Post>
     */
    List<Post> findByTitle(String title);

    /**
     * 게시글의 생성시간으로 게시글 찾기
     * @param creationDate
     * @return List<Post>
     */
    List<Post> findByCreationDate(Date creationDate);

    /**
     * 게시글 전체 찾기
     * @return List<Post>
     */
    List<Post> findAll();

    /**
     * 회원 번호로 게시글 삭제
     * @param memberId
     */
    void deleteByMemberId(Long memberId);

    /**
     * 게시글 번호로 게시글 삭제
     * @param postId
     */
    void deleteByPostId(Long postId);

    /**
     * 게시글 전체 삭제
     */
    void clear();

    /**
     * 게시글 수정
     * @param post
     */
    void update(Post post);
}
