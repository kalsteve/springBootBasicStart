package com.board.back;

import com.board.back.domain.member.Member;
import com.board.back.repository.comment.CommentRepository;
import com.board.back.repository.comment.MemoryCommentRepository;
import com.board.back.repository.member.MemberRepository;
import com.board.back.repository.member.MemoryMemberRepository;
import com.board.back.repository.post.MemoryPostRepository;
import com.board.back.repository.post.PostRepository;
import com.board.back.service.Post.PostService;
import com.board.back.service.Post.PostServiceImp;
import com.board.back.service.comment.CommentService;
import com.board.back.service.comment.CommentServiceImp;
import com.board.back.service.member.MemberService;
import com.board.back.service.member.MemberServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 스프링 빈을 등록하는 클래스
 * DI를 위해 스프링 빈을 등록
 * IoC가 지켜짐
 */
@Configuration
public class SpringConfig {

    /**
     * 회원과 관련된 서비스 등록
     * @return MemberService
     */
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    /**
     * 게시글과 관련된 서비스 등록
     * @return PostService
     */
    @Bean
    public CommentRepository commentRepository() {
        return new MemoryCommentRepository();
    }

    /**
     * 댓글과 관련된 서비스 등록
     * @return CommentService
     */
    @Bean
    public PostRepository postRepository() {
        return new MemoryPostRepository();
    }

    /**
     * 댓글과 관련된 서비스 등록
     * @return CommentService
     */
    @Bean
    public CommentService commentService() {
        return new CommentServiceImp(commentRepository());
    }

    /**
     * 게시글과 관련된 서비스 등록
     * @return PostService
     */
    @Bean
    public PostService postService() {
        return new PostServiceImp(postRepository());
    }

    /**
     * 회원과 관련된 서비스 등록
     * @return MemberService
     */
    @Bean
    public MemberService memberService() {
        return new MemberServiceImp(memberRepository());
    }


}
